package com.DesafioIOS.StepDefinitions.Input;

import com.DesafioIOS.Screens.Input.DatePickerScreen;
import com.DesafioIOS.Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static com.DesafioIOS.Hooks.Hooks.getScenario;


public class DatePickerSteps {

    DatePickerScreen datePickerScreen;

    public DatePickerSteps(){
        datePickerScreen = new DatePickerScreen();
    }

    @And("procurar no DataPicker")
    public void clicarNaData(){
        datePickerScreen.procurarAData();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("trocar o Picker")
    public void mudarODia(){
        datePickerScreen.trocarPicker();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("trocar o hidden")
    public void mudarOHidden(){
        datePickerScreen.hiddenPicker();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("trocar o mes")
    public void mudarMes(){
        datePickerScreen.procurarOMes();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("trocar o ano")
    public void mudarAno(){
        datePickerScreen.procurarOAno();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }



    @Then("verificar a data")
    public void verificarOMes(){
        Assert.assertTrue(datePickerScreen.verificarAno());
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
