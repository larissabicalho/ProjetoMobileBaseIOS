package com.DesafioIOS.StepDefinitions;


import com.DesafioIOS.Screens.HTTPScreen;
import com.DesafioIOS.Utils.DriverFactory;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static com.DesafioIOS.Hooks.Hooks.getScenario;


public class HTTPSteps {

    Scenario scenario;
    HTTPScreen httpScreen;

    public HTTPSteps(){
        httpScreen = new HTTPScreen();
    }

    @And("entrar no site")
    public void entrarNoSiteGoogle() {
        httpScreen.clicarELimparHome();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("selecionar o site (.*)")
    public void selecionarOSite(String site){
        httpScreen.preencherSite(site);
        httpScreen.clicarNoEnterParaSite();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("valido o site")
    public void validarOSite(){
        Assert.assertEquals(httpScreen.validarMensagemGoogle(), "Google");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
