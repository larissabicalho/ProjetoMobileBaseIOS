package JavaAppiumCucumberExtentReportsTemplate.Utils;

import JavaAppiumCucumberExtentReportsTemplate.GlobalParameters;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.IOException;
import java.net.URL;

import static JavaAppiumCucumberExtentReportsTemplate.GlobalParameters.*;

public class DriverFactory {

    //https://github.com/extent-framework/extentreports-cucumber4-adapter/issues/48
    public static AppiumDriver<MobileElement> driver;
    public static AppiumDriver<MobileElement> getDriver() {
        return driver;
    }

    public static void inicializaDriver(boolean deviceFarm)throws IOException {

            //Se for iOS e for DeviceFarm
            if(isDeviceFarm){
                String accessKey = AccessKeyBrowserStack;
                String userName = UsernameBrowserStack;
                String buildNumber = BuildNumberBrowserStack;
                String ipaUploadPath = AppIOSUploadBrowserStack;

                DesiredCapabilities caps = new DesiredCapabilities();
                caps.setCapability("device", IOSDeviceBrowserStack);
                caps.setCapability("os_version", IOSOSVersionBrowserStack);
                caps.setCapability("project", IOSProjectBrowserStack);
                caps.setCapability("build", "iOS - Build ["+buildNumber+"]");
                caps.setCapability("app","bs://" + ipaUploadPath);
                caps.setCapability("automationName", "XCUITest");
                caps.setCapability("autoAcceptAlerts", "true");
                caps.setCapability(IOSMobileCapabilityType.START_IWDP, "true");

                driver = new IOSDriver<MobileElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);
            }

            //Se for iOS e não for DeviceFarm
            else {

                //Se for iOS, não for DeviceFarm e for MacOS (Appium puro)
                if(isMacOS){

                    DesiredCapabilities caps = new DesiredCapabilities();
                    caps.setCapability(MobileCapabilityType.DEVICE_NAME, IOSDeviceName);
                    caps.setCapability(IOSMobileCapabilityType.PLATFORM_NAME, IOSPlatformName);
                    caps.setCapability(IOSMobileCapabilityType.VERSION, IOSPlatformVersion);
                    caps.setCapability(MobileCapabilityType.APP, IOSAppPath);
                    caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                    caps.setCapability(MobileCapabilityType.UDID, IOSUDID);
                    caps.setCapability(IOSMobileCapabilityType.AUTO_ACCEPT_ALERTS, IOSAuto_Accept_Alerts);
                    caps.setCapability(IOSMobileCapabilityType.SEND_KEY_STRATEGY, IOSSendKeyStrategy);

                    caps.setCapability(IOSMobileCapabilityType.START_IWDP, "true");
                    caps.setCapability(IOSMobileCapabilityType.WDA_LAUNCH_TIMEOUT,"240000");
                    caps.setCapability(IOSMobileCapabilityType.WDA_CONNECTION_TIMEOUT, "240000");
                    caps.setCapability(IOSMobileCapabilityType.XCODE_ORG_ID, IOSXcodeCodeId);
                    caps.setCapability(IOSMobileCapabilityType.XCODE_SIGNING_ID,"iPhone Developer");
                    caps.setCapability(IOSMobileCapabilityType.USE_NEW_WDA, "true");


                }
                //se for simulador de IOS
                if(isIosSimulator){

                    DesiredCapabilities caps = new DesiredCapabilities();
                    caps.setCapability("deviceName", IOSDeviceName);
                    caps.setCapability("platformName", IOSPlatformName);
                    caps.setCapability("platformVersion", IOSPlatformVersion);
                    caps.setCapability("app", IOSAppPath);
                    caps.setCapability("automationName", "XCUITest");
                    caps.setCapability("sendKeysStrategy", IOSSendKeyStrategy);

                    driver = new IOSDriver<MobileElement>(new URL(GlobalParameters.AppiumServer), caps);
                }

                //Se for iOS, não for DeviceFarm e for Appium Studio/Appium
                else {
                    DesiredCapabilities caps = new DesiredCapabilities();
                    caps.setCapability(MobileCapabilityType.DEVICE_NAME, IOSDeviceName);
                    caps.setCapability(IOSMobileCapabilityType.PLATFORM_NAME, IOSPlatformName);
                    caps.setCapability(IOSMobileCapabilityType.VERSION, IOSPlatformVersion);
                    caps.setCapability(MobileCapabilityType.APP, IOSAppPath);
                    caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                    //caps.setCapability(MobileCapabilityType.UDID, IOSUDID);
                    caps.setCapability(IOSMobileCapabilityType.AUTO_ACCEPT_ALERTS, IOSAuto_Accept_Alerts);
                    caps.setCapability(IOSMobileCapabilityType.SEND_KEY_STRATEGY, IOSSendKeyStrategy);
                    caps.setCapability(IOSMobileCapabilityType.START_IWDP, "true");
                    caps.setCapability(IOSMobileCapabilityType.WDA_LAUNCH_TIMEOUT, "240000");
                    caps.setCapability(IOSMobileCapabilityType.WDA_CONNECTION_TIMEOUT, "240000");
                    caps.setCapability("report.disable",true);

                    driver = new IOSDriver<MobileElement>(new URL(AppiumServer), caps);

                }
            }
        }

    public static void finalizaDriver(){
        driver.quit();
    }


}
