package com.DesafioIOS.StepDefinitions.Input;

import com.DesafioIOS.Screens.Input.LabelScreen;
import com.DesafioIOS.Utils.DriverFactory;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static com.DesafioIOS.Hooks.Hooks.getScenario;


public class LabelSteps {

    LabelScreen labelScreen;

    @Then("verificar Label 1")
    public void verificarLabel1(){
        labelScreen = new LabelScreen();
        Assert.assertEquals(labelScreen.verificarTextoLabel1(), "I am label 1");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar Label 2")
    public void verificarLabe2(){
        labelScreen = new LabelScreen();
        Assert.assertEquals(labelScreen.verificarTextoLabel2(), "I am label 2");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar quantidade de label")
    public void verificarQuantidadeLabel(){
        labelScreen = new LabelScreen();
        Assert.assertEquals(labelScreen.verificarQuantidadeDeLabels(), 2);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }
}
