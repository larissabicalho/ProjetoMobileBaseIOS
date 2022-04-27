package StepDefinitions;


import Screens.MenuScreen;
import Utils.DriverFactory;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.en.And;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import static Hooks.Hooks.getScenario;

public class MenuSteps {

    MenuScreen menuScreen;
    Scenario scenario;

    public MenuSteps(){
        menuScreen = new MenuScreen();
    }


    @And("clicar no menu Home")
    public void xpto2(){
        menuScreen.clicarMenuHome();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no menu Native")
    public void xpto6(){
        menuScreen.clicarMenuNative();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no menu Nested Views")
    public void xpto8(){
        menuScreen.clicarMenuNestedViews();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no menu Web")
    public void xpto13(){
        menuScreen.clicarMenuWeb();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }



    @And("clicar no menu HTTP")
    public void xpto4(){
        menuScreen.clicarMenuHttp();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no menu Login")
    public void xpto11(){
        menuScreen.clicarMenuLoginPage();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no menu Input")
    public void xpto7(){
        menuScreen.clicarMenuInputControl();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }


    @And("clicar no menu Crash/Bug")
    public void xpto9(){
        menuScreen.clicarMenuCrash();
       getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no menu Alerts")
    public void xpto10(){
        menuScreen.clicarMenuAlerts();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
