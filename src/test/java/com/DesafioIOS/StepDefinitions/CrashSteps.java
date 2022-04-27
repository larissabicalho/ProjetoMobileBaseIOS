package com.DesafioIOS.StepDefinitions;


import com.DesafioIOS.Screens.CrashScreen;
import com.DesafioIOS.Utils.DriverFactory;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static com.DesafioIOS.Hooks.Hooks.getScenario;


public class CrashSteps {

    CrashScreen crashScreen;

    public CrashSteps() { crashScreen = new CrashScreen();}

    @Then("verificar se existe o botao crash")
    public void verificarCrash(){
        Assert.assertTrue(crashScreen.verificarNoCrash());
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
