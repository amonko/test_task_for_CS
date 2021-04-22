package com.cs.utils;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class MobilePageObject extends PageObject {

    public MobilePageObject(WebDriver driver) {
        super(driver, page -> {
            PageFactory
                    .initElements(new AppiumFieldDecorator(((WebDriverFacade) page.getDriver()).getProxiedDriver(),
                            page.getImplicitWaitTimeout()), page);
            return true;
        });
    }

    public AndroidDriver getAndroidDriver() {
        return (AndroidDriver) ((WebDriverFacade) getDriver()).getProxiedDriver();
    }

    public void swipeUp(double startXVar, double startYVar, double endXVar, double endYVar) {
        Dimension size = getAndroidDriver().manage().window().getSize();
        int startY = (int)(size.height * startYVar);
        int endY = (int)(size.height * endYVar);
        int startX = (int)(size.width * startXVar);
        int endX = (int)(size.width * endXVar);

        TouchAction action = new TouchAction(getAndroidDriver());
        action.press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(endX, endY))
                .release().perform();
    }
}
