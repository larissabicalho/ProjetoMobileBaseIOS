package StepDefinitions;


import Screens.HomeScreen;;


import Utils.DriverFactory;
import io.cucumber.core.api.Scenario;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static Hooks.Hooks.getScenario;

public class HomeSteps {

    HomeScreen homeScreen;
    Scenario scenario;
    public HomeSteps(){
        homeScreen = new HomeScreen();
    }

    @Given("clicar no menu lateral")
    public void xpto1(){
        homeScreen.clicarMenu();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then ("valido frase Home")
    public void xpto2(){
        Assert.assertEquals(homeScreen.validarTextoHome(), "AWS Device Farm Sample app");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then ("A mensagem da home inválida")
    public void xpto3(){
        Assert.assertNotEquals(homeScreen.validarTextoHome(), "AWS Device");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }


}
