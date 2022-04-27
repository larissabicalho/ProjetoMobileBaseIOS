package StepDefinitions.Input;

import Screens.Input.SpinnerScreen;
import Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static Hooks.Hooks.getScenario;

public class SpinnerSteps {
    SpinnerScreen spinnerScreen;

    public SpinnerSteps(){
        spinnerScreen = new SpinnerScreen();
    }
    @And("clicar no spinner (.*)")
    public void clicarNoSpinner(String option){
        spinnerScreen.clicarNoSpinner(option);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar se spinner foi selecionado (.*)")
    public void verificarCheckbox(String spinner){
        Assert.assertEquals(spinnerScreen.verificarSpinner(), spinner);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
