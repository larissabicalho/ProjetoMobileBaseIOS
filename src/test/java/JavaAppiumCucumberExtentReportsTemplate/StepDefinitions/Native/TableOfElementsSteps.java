package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions.Native;

import JavaAppiumCucumberExtentReportsTemplate.Screens.Native.ImageCollectionScreen;
import JavaAppiumCucumberExtentReportsTemplate.Screens.Native.TableOfElementsScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;


public class TableOfElementsSteps {

    TableOfElementsScreen tableOfElementsScreen;

    @And("clicar em TableOfElements")
    public void clicarEmImageGallery(){
        tableOfElementsScreen = new TableOfElementsScreen();
        tableOfElementsScreen.clicarTableOfElements();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("ir ate o Elemento 39")
    public void scroolAte39(){
        tableOfElementsScreen = new TableOfElementsScreen();
        tableOfElementsScreen.scroll39();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar Texto 39")
    public void verificarTexto(){
        tableOfElementsScreen = new TableOfElementsScreen();
        Assert.assertEquals(tableOfElementsScreen.verificarTexto39(), "39");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }
}
