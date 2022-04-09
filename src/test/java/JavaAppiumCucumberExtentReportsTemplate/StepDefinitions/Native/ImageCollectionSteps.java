package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions.Native;

import JavaAppiumCucumberExtentReportsTemplate.Screens.Native.ImageCollectionScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class ImageCollectionSteps {

    ImageCollectionScreen imageCollectionScreen;

    @Then("verificar se existe galeria")
    public void verificarSeExisteGaleria(){
        imageCollectionScreen = new ImageCollectionScreen();
        Assert.assertEquals(imageCollectionScreen.verificarSeExisteGaleria(),8);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar em ImageGallery")
    public void clicarEmImageGallery(){
        imageCollectionScreen = new ImageCollectionScreen();
        imageCollectionScreen.clicarImageGallery();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
