package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions;

import JavaAppiumCucumberExtentReportsTemplate.Screens.HTTPScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class HTTPSteps {

    Scenario scenario;
    HTTPScreen HTTPScreen;

    @And("entrar no site")
    public void entrarNoSiteGoogle() {
        HTTPScreen = new HTTPScreen();
        HTTPScreen.clicarELimparHome();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("selecionar o site (.*)")
    public void selecionarOSite(String site){
        HTTPScreen = new HTTPScreen();
        HTTPScreen.preencherSite(site);
        HTTPScreen.clicarNoEnterParaSite();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("valido o site")
    public void validarOSite(){
        HTTPScreen = new HTTPScreen();
        Assert.assertEquals(HTTPScreen.validarMensagemGoogle(), "Google");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
