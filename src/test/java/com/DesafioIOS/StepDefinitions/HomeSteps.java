package com.DesafioIOS.StepDefinitions;


import com.DesafioIOS.Screens.HomeScreen;
import com.DesafioIOS.Utils.DriverFactory;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static com.DesafioIOS.Hooks.Hooks.getScenario;


public class HomeSteps {

    HomeScreen homeScreen;
    Scenario scenario;

    public HomeSteps(){
        homeScreen = new HomeScreen();
    }

    @Given("clicar no menu lateral")
    public void clicarLateral(){
        homeScreen.clicarMenu();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then ("valido frase Home")
    public void validarHome(){
        Assert.assertEquals(homeScreen.validarTextoHome(), "AWS Device Farm Sample app");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then ("A mensagem da home inválida")
    public void validarMensagem(){
        Assert.assertNotEquals(homeScreen.validarTextoHome(), "AWS Device");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }


}
