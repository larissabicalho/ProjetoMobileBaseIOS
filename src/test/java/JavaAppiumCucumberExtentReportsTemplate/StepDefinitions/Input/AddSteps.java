package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions.Input;

import JavaAppiumCucumberExtentReportsTemplate.Screens.Input.AddScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class AddSteps {

    AddScreen addScreen;

    @And("clicar no moreInfo")
    public void clicarNoAdd(){
        addScreen = new AddScreen();
        addScreen.clicarNoAdd();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no information")
    public void clicarNoInformationButton(){
        addScreen = new AddScreen();
        addScreen.clicarNoInformation();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }



    @Then("verificar se o add foi clicado")
    public void verificarAdd(){
        addScreen = new AddScreen();
        Assert.assertEquals(addScreen.verificarTextoAdd(), "add");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar se o information")
    public void verificarInfo(){
        addScreen = new AddScreen();
        Assert.assertEquals(addScreen.verificarTextoInfo(), "More Info");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }
}
