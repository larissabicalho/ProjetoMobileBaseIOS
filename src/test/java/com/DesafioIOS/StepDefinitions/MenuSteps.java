package com.DesafioIOS.StepDefinitions;

import com.DesafioIOS.Screens.MenuScreen;
import com.DesafioIOS.Utils.DriverFactory;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import static com.DesafioIOS.Hooks.Hooks.getScenario;

public class MenuSteps {

    MenuScreen menuScreen;
    Scenario scenario;

    public MenuSteps(){
        menuScreen = new MenuScreen();
    }


    @When("clicar no menu Home")
    public void menuHome(){
        menuScreen.clicarMenuHome();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no menu Native")
    public void menuNative(){
        menuScreen.clicarMenuNative();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no menu Nested Views")
    public void menuNestedViews(){
        menuScreen.clicarMenuNestedViews();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no menu Web")
    public void menuWeb(){
        menuScreen.clicarMenuWeb();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }


    @When("clicar no menu HTTP")
    public void menuHttp(){
        menuScreen.clicarMenuHttp();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no menu Login")
    public void menuLogin(){
        menuScreen.clicarMenuLoginPage();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @When("clicar no menu Input")
    public void menuInput(){
        menuScreen.clicarMenuInputControl();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }


    @And("clicar no menu Crash/Bug")
    public void menuCrash(){
        menuScreen.clicarMenuCrash();
       getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no menu Alerts")
    public void menuAlerts(){
        menuScreen.clicarMenuAlerts();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
