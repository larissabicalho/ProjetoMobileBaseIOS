package com.DesafioIOS.StepDefinitions;


import com.DesafioIOS.Screens.WebScreen;
import com.DesafioIOS.Utils.DriverFactory;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static com.DesafioIOS.Hooks.Hooks.getScenario;


public class WebSteps {

 WebScreen webScreen;

 public WebSteps() {
     webScreen = new WebScreen();
 }

    @Then("verificar se esta na amazon")
    public void verificarLogin(){
        Assert.assertTrue(webScreen.verificarSeExiste());
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }
}
