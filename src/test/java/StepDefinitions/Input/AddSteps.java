package StepDefinitions.Input;

import Screens.Input.AddScreen;
import Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static Hooks.Hooks.getScenario;

public class AddSteps {

    AddScreen addScreen;

    public AddSteps(){
        addScreen = new AddScreen();
    }

    @And("clicar no moreInfo")
    public void clicarNoAdd(){
        addScreen.clicarNoAdd();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no information")
    public void clicarNoInformationButton(){
        addScreen.clicarNoInformation();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }



    @Then("verificar se o add foi clicado")
    public void verificarAdd(){
        Assert.assertEquals(addScreen.verificarTextoAdd(), "add");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar se o information")
    public void verificarInfo(){
        Assert.assertEquals(addScreen.verificarTextoInfo(), "More Info");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }
}
