package com.DesafioIOS.StepDefinitions.Native;

import com.DesafioIOS.Screens.Native.VideoPlayerScreen;
import com.DesafioIOS.Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static com.DesafioIOS.Hooks.Hooks.getScenario;


public class VideoPlayerSteps {

    VideoPlayerScreen videoPlayerScreen;


public VideoPlayerSteps(){
    videoPlayerScreen = new VideoPlayerScreen();
}

    @And("clicar no menu VideoPlayer")
    public void clicarNoVideoPlayer(){
        videoPlayerScreen.clicarMenuVideo();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar se o video apareceu")
    public void verificarSeVideoAparece(){
        Assert.assertTrue(videoPlayerScreen.verificarSeOElementoExiste());
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }
}
