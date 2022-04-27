package com.DesafioIOS.StepDefinitions.Input;

import com.DesafioIOS.Screens.Input.SolidScreen;
import com.DesafioIOS.Utils.DriverFactory;
import io.cucumber.java.en.And;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static com.DesafioIOS.Hooks.Hooks.getScenario;

public class SolidSteps {

    SolidScreen solidScreen;

    public SolidSteps(){
        solidScreen = new SolidScreen();
    }

    @And("swippe leve no objeto")
    public void clicarNoSpinner(){
        solidScreen.swipePequeno();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("verificar a mudanca")
    public void verificar(){
        Assert.assertTrue(solidScreen.verificarChange());
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
