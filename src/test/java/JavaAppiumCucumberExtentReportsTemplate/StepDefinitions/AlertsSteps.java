package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions;

import JavaAppiumCucumberExtentReportsTemplate.Screens.AlertsScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.sourceforge.tess4j.TesseractException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import java.io.IOException;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class AlertsSteps {

    AlertsScreen alertsScreen;

    @Then("validar Mensagem")
    public void clicarToastMenu() throws TesseractException, IOException {
        alertsScreen = new AlertsScreen();

        Assert.assertEquals(alertsScreen.elementoToast(),"This is a modal view");

        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no botao Alert")
    public void xpto1(){
        alertsScreen = new AlertsScreen();
        alertsScreen.clicarNoAlert();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no botao Modal")
    public void xpto2(){
        alertsScreen = new AlertsScreen();
        alertsScreen.clicarNoModal();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar a mensagem do alerta")
    public void xpto3(){
        alertsScreen = new AlertsScreen();
        Assert.assertEquals(alertsScreen.getAlertText(),"OK");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
