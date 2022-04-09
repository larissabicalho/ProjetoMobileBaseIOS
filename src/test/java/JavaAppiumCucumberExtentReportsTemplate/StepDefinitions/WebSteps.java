package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions;

import JavaAppiumCucumberExtentReportsTemplate.Flows.LoginFlows;
import JavaAppiumCucumberExtentReportsTemplate.Screens.LoginScreen;
import JavaAppiumCucumberExtentReportsTemplate.Screens.WebScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import java.io.FileNotFoundException;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class WebSteps {
 WebScreen webScreen;
    @Then("verificar se esta na amazon")
    public void verificarLogin() throws FileNotFoundException {
        webScreen = new WebScreen();
        Assert.assertTrue(webScreen.verificarSeExiste());
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }
}
