package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions.Native;

import JavaAppiumCucumberExtentReportsTemplate.Screens.Native.ScrollingViewScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class ScrollingViewSteps {

    ScrollingViewScreen scrollingViewScreen;
    @And("clicar no menu ContentScrolling")
    public void clicarNoScrool(){
        scrollingViewScreen = new ScrollingViewScreen();
        scrollingViewScreen.clicarMenuScrooling();
        scrollingViewScreen.scroolAteFinalDoTexto();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar se esta na tela")
    public void verificarTextoAparece(){
        scrollingViewScreen = new ScrollingViewScreen();
        Assert.assertTrue(scrollingViewScreen.verificarSeExiste());
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
