package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions.Input;

import JavaAppiumCucumberExtentReportsTemplate.Screens.Input.SolidScreen;
import JavaAppiumCucumberExtentReportsTemplate.Screens.Input.SpinnerScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class SolidSteps {

    SolidScreen solidScreen;
    @And("swippe leve no objeto")
    public void clicarNoSpinner(){
        solidScreen = new SolidScreen();
        solidScreen.swipePequeno();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("verificar a mudanca")
    public void verificar(){
        solidScreen = new SolidScreen();
        Assert.assertTrue(solidScreen.verificarChange());
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
