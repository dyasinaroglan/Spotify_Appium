package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Utils {

    public static AppiumDriver<MobileElement> openApp(Device device, App app){
        Driver.runAppium();
        return Driver.getDriver(device,app);
    }

}
