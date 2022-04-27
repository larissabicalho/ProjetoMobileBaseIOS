package StepDefinitions.Native;

import Screens.Native.TableOfElementsScreen;
import Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static Hooks.Hooks.getScenario;


public class TableOfElementsSteps {

    TableOfElementsScreen tableOfElementsScreen;

    public TableOfElementsSteps(){
        tableOfElementsScreen = new TableOfElementsScreen();
    }

    @And("clicar em TableOfElements")
    public void clicarEmImageGallery(){
        tableOfElementsScreen.clicarTableOfElements();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("ir ate o Elemento 39")
    public void scroolAte39(){
        tableOfElementsScreen.scroll39();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar Texto 39")
    public void verificarTexto(){
        Assert.assertEquals(tableOfElementsScreen.verificarTexto39(), "39");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }
}
