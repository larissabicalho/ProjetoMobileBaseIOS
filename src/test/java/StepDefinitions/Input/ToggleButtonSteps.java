package StepDefinitions.Input;

import Screens.Input.ToggleButtonScreen;
import Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static Hooks.Hooks.getScenario;

public class ToggleButtonSteps {

    ToggleButtonScreen toggleButtonScreen;

    public ToggleButtonSteps(){
        toggleButtonScreen = new ToggleButtonScreen();
    }

    @And("clicar no toggle")
    public void clicarNoToggle(){
        toggleButtonScreen.clicarElementoToggle();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar se toggle foi clicado")
    public void verificarToggleOn(){
        Assert.assertEquals(toggleButtonScreen.verificarToggle(),"1");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }
}
