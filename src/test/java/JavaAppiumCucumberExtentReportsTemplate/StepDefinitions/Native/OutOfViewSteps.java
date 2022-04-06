package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions.Native;

import JavaAppiumCucumberExtentReportsTemplate.Screens.Native.OutOfViewScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class ContentOutOfViewSteps {

    OutOfViewScreen outOfViewScreen;
    @And("clicar no menu ContentOutOfView")
    public void clicarNoScrool(){
        outOfViewScreen = new OutOfViewScreen();
        outOfViewScreen.clicarMenuContent();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("verificar se o texto escondido aparece")
    public void verificarSeOTextoApareceu(){
        outOfViewScreen = new OutOfViewScreen();
        Assert.assertEquals(outOfViewScreen.verificarSeOTextoAparecendo(),"This is hidden text");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
