package com.DesafioIOS.StepDefinitions.Native;


import com.DesafioIOS.Screens.Native.ImageCollectionScreen;
import com.DesafioIOS.Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static com.DesafioIOS.Hooks.Hooks.getScenario;


public class ImageCollectionSteps {

    ImageCollectionScreen imageCollectionScreen;

    public ImageCollectionSteps(){
        imageCollectionScreen = new ImageCollectionScreen();
    }

    @Then("verificar se existe galeria")
    public void verificarSeExisteGaleria(){
        Assert.assertEquals(imageCollectionScreen.verificarSeExisteGaleria(),8);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar em ImageGallery")
    public void clicarEmImageGallery(){
        imageCollectionScreen.clicarImageGallery();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
