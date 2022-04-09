package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions.Input;

import JavaAppiumCucumberExtentReportsTemplate.Screens.Input.LabelScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import java.text.ParseException;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class TimePickerSteps {

    LabelScreen labelScreen;
    @And("clicar no menu TimePickerScreen")
    public void clicarNoMenuTimePickerScreen(){
        labelScreen = new LabelScreen();
  //      labelScreen.elementoTime();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("adicionar hora (.*) e minuto (.*)")
    public void colocarDataEHora(String hora, String minuto){
        labelScreen = new LabelScreen();
  //      labelScreen.timePickerTipo(hora,minuto);
      //  getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("colocar o turno (.*)")
    public void colocarTurno(String turno){
        labelScreen = new LabelScreen();
   //     labelScreen.clicarSeAMPM(turno);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("verificar se hora (.*) e minutos (.*) e qual turno (.*)")
    public void colocarTurno(String hora, String minuto,String turno) throws ParseException {
        labelScreen = new LabelScreen();
  //      Assert.assertTrue(labelScreen.verificarTempo(hora,minuto,turno));
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
