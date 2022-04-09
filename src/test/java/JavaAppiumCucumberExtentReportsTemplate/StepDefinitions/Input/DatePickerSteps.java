package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions.Input;

import JavaAppiumCucumberExtentReportsTemplate.Screens.Input.DatePickerScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class DatePickerSteps {

    DatePickerScreen datePickerScreen;

    @And("procurar no DataPicker")
    public void clicarNaData(){
        datePickerScreen = new DatePickerScreen();
        datePickerScreen.procurarAData();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("trocar o Picker")
    public void mudarODia(){
        datePickerScreen = new DatePickerScreen();
        datePickerScreen.trocarPicker();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("trocar o hidden")
    public void mudarOHidden(){
        datePickerScreen = new DatePickerScreen();
        datePickerScreen.hiddenPicker();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("trocar o mes")
    public void mudarMes(){
        datePickerScreen = new DatePickerScreen();
        datePickerScreen.procurarOMes();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("trocar o ano")
    public void mudarAno(){
        datePickerScreen = new DatePickerScreen();
        datePickerScreen.procurarOAno();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }



    @Then("verificar a data")
    public void verificarOMes(){
        datePickerScreen = new DatePickerScreen();
        Assert.assertTrue(datePickerScreen.verificarAno());
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
