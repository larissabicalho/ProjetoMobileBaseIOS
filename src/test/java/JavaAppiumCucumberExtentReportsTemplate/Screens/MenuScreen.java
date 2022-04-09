package JavaAppiumCucumberExtentReportsTemplate.Screens;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class MenuScreen extends PageBase {


    By inputControlMenu = By.xpath("//XCUIElementTypeButton[@name='Inputs']");

    By loginPageMenu = By.xpath("//XCUIElementTypeStaticText[@name='Login']");

    By homeMenu = By.xpath("//XCUIElementTypeButton[@name='Home']");

    By httpMenu = By.xpath("//XCUIElementTypeButton[@name='HTTP']");

    By nativeMenu = By.xpath("//XCUIElementTypeButton[@name='Native']");

    By nestedViewsMenu = By.xpath("//XCUIElementTypeStaticText[@name=\"Nested\"]");

    By crashBugMenu = By.xpath("//XCUIElementTypeStaticText[@name=\"Crash\"]");

    By alertsMenu = By.xpath("//XCUIElementTypeStaticText[@name=\"Alerts\"]");

    By webMenu = By.xpath("//XCUIElementTypeStaticText[@name=\"Web\"]");

    public void clicarMenuInputControl(){
        click(inputControlMenu);
    }


    public void clicarMenuLoginPage(){
        click(loginPageMenu);
    }

    public void clicarMenuAlerts(){
        click(alertsMenu);
    }

    public void clicarMenuHome(){
        click(homeMenu);
    }

    public void clicarMenuHttp(){
        click(httpMenu);
    }

    public void clicarMenuNative(){
        waitForElement(nativeMenu);
        click(nativeMenu);
    }

    public void clicarMenuNestedViews(){
        click(nestedViewsMenu);
    }

    public void clicarMenuWeb(){
        click(webMenu);
    }

    public void clicarMenuCrash(){
        click(crashBugMenu);
    }

}

