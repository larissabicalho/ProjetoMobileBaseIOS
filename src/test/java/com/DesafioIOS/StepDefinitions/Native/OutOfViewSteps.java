package com.DesafioIOS.StepDefinitions.Native;

import com.DesafioIOS.Screens.Native.OutOfViewScreen;
import com.DesafioIOS.Utils.DriverFactory;
import io.cucumber.java.en.And;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static com.DesafioIOS.Hooks.Hooks.getScenario;


public class OutOfViewSteps {

    OutOfViewScreen outOfViewScreen;

    public OutOfViewSteps(){ outOfViewScreen = new OutOfViewScreen();}

    @And("clicar no menu ContentOutOfView")
    public void clicarNoScrool(){
        outOfViewScreen.clicarMenuContent();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("verificar se o texto escondido aparece")
    public void verificarSeOTextoApareceu(){
        Assert.assertEquals(outOfViewScreen.verificarSeOTextoAparecendo(),"This is hidden text");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
