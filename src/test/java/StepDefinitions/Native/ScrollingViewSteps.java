package StepDefinitions.Native;

import Screens.Native.ScrollingViewScreen;
import Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static Hooks.Hooks.getScenario;

public class ScrollingViewSteps {

    ScrollingViewScreen scrollingViewScreen;
    public ScrollingViewSteps(){
        scrollingViewScreen = new ScrollingViewScreen();
    }
    @And("clicar no menu ContentScrolling")
    public void clicarNoScrool(){
        scrollingViewScreen.clicarMenuScrooling();
        scrollingViewScreen.scroolAteFinalDoTexto();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar se esta na tela")
    public void verificarTextoAparece(){
        Assert.assertTrue(scrollingViewScreen.verificarSeExiste());
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
