package com.cs.controller;

import com.cs.support.Arguments;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;

import static io.appium.java_client.service.local.AppiumDriverLocalService.buildService;
import static com.cs.support.MobileProperties.*;

@Slf4j
public class AppiumServerController {

    private static AppiumDriverLocalService appiumServer;

    private String serverHost = System.getProperty("appium.host");
    private String serverPort = System.getProperty("appium.port");

    public void startAppiumServer() {
        try {
            log.info("----------------- START APPIUM SERVER " + serverHost.concat(":").concat(serverPort) + " -----------------");
            appiumServer = buildService(new AppiumServiceBuilder()
                    .usingDriverExecutable(new File(nodeHome))
                    .withAppiumJS(new File(appiumHome))
                    .withIPAddress(serverHost)
                    .usingPort(Integer.parseInt(serverPort))
                    .withArgument(Arguments.TIME_OUT, "180")
                    .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
                    .withArgument(GeneralServerFlag.LOCAL_TIMEZONE)
                    .withArgument(Arguments.LOG_LEVEL, "info")
            );
            appiumServer.start();
            assert checkIfServerIsRunning();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public void stopAppiumServer() {
        try {
            if (appiumServer.isRunning()) {
                appiumServer.stop();
                log.info("----------------- STOP APPIUM SERVER " + serverHost.concat(":").concat(serverPort) + " -----------------");
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    private boolean checkIfServerIsRunning() {
        boolean isServerRunning = false;
        ServerSocket serverSocket;
        try {
            serverSocket = new ServerSocket(Integer.parseInt(serverPort));
            serverSocket.close();
        } catch (IOException e) {
            isServerRunning = true;
        }
        log.info("------------- APPIUM SERVER " + serverHost.concat(":").concat(serverPort) + " SUCCESS RUNNING -------------");
        return isServerRunning;
    }

}
