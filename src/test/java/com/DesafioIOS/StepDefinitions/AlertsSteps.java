package com.DesafioIOS.StepDefinitions;

import com.DesafioIOS.Screens.AlertsScreen;
import com.DesafioIOS.Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;


import static com.DesafioIOS.Hooks.Hooks.getScenario;

public class AlertsSteps {

    AlertsScreen alertsScreen;

    public AlertsSteps(){
        alertsScreen = new AlertsScreen();
    }

    @Then("validar Mensagem")
    public void clicarToastMenu() {
        Assert.assertEquals(alertsScreen.elementoToast(),"This is a modal view");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no botao Alert")
    public void validarAlert(){
        alertsScreen.clicarNoAlert();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no botao Modal")
    public void validarModal(){
        alertsScreen.clicarNoModal();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar a mensagem do alerta")
    public void validarAlerta(){
        Assert.assertEquals(alertsScreen.getAlertText(),"OK");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
