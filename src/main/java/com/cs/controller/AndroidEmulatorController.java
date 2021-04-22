package com.cs.controller;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Slf4j
public class AndroidEmulatorController {


    private String udid = System.getProperty("appium.udid");
    private String deviceName = System.getProperty("appium.deviceName");

    public void startEmulator() {
        try {
            ProcessBuilder pb = new ProcessBuilder("emulator", "-avd", deviceName);
            pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
            pb.redirectError(ProcessBuilder.Redirect.INHERIT);
            Process process = pb.start();
            process.waitFor(60, TimeUnit.SECONDS);
            if (!verifyStartEmulator()){
                log.error("----------------- ANDROID EMULATOR " + deviceName + " ISN'T CONNECTED -----------------");
                throw new RuntimeException("ANDROID EMULATOR " + deviceName + " ISN'T CONNECTED");
            }
        } catch (IOException | InterruptedException e) {
            log.error("IO exception during executing console command" + e);
        }
    }

    private boolean verifyStartEmulator(){
        List<String> adb = getAdbDeviceList();
        getEmulatorUdid(adb);
        if (adb.iterator().hasNext()){
            for(String str : adb){
                if (!(str.equals(udid)) || (!str.contains("offline"))) {
                    log.info("----------------- ANDROID EMULATOR " + deviceName + " IS CONNECTED -----------------");
                    return true;
                }
            }
        }
        return false;
    }

    private List<String> getAdbDeviceList(){
        List<String> adbDevice = new ArrayList<>();
        String line;
        try {
            BufferedReader bufferedReader = commandLineExec(Arrays.asList("adb", "devices"));
            while ((line = bufferedReader != null ? bufferedReader.readLine() : null) != null) {
                if (!(line.isEmpty() || line.contains("List of devices attached"))){
                    adbDevice.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return adbDevice;
    }

    private void getEmulatorUdid(List<String> adbDevice){
        if (adbDevice.size() == 0){
            udid = "";
            log.info("----------------- EMULATOR NOT FOUND -----------------");
        } else if (adbDevice.size() > 1){
            udid = adbDevice.get(1).replaceAll("\\t.*", "");
            log.info("----------------- EMULATOR UDID : " + udid + " -----------------");
        } else {
            udid = adbDevice.get(0).replaceAll("\\t.*", "");
            log.info("----------------- EMULATOR UDID : " + udid + " -----------------");
        }
    }

    public void killEmulatorProcess(){
        if (verifyStartEmulator()) {
            String console;
            try {
                Process process = Runtime.getRuntime().exec("adb -s " + udid + " emu kill");
                InputStream inputStream = process.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                while ((console = bufferedReader.readLine()) != null) {
                    if (!console.isEmpty()) {
                        log.info(console);
                    }
                }
                process.waitFor(30, TimeUnit.SECONDS);
            } catch (IOException | InterruptedException e) {
                log.error("IO exception during executing console command" + e);
            }
        }
    }

    private BufferedReader commandLineExec (List<String> commands){
        try {
            ProcessBuilder builder = new ProcessBuilder(commands);
            Process process = builder.start();
            InputStream inputStream = process.getInputStream();
            return new BufferedReader(new InputStreamReader(inputStream));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
