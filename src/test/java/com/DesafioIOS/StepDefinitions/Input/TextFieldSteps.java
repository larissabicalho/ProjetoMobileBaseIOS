package com.DesafioIOS.StepDefinitions.Input;

import com.DesafioIOS.Screens.Input.TextFieldScreen;
import com.DesafioIOS.Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static com.DesafioIOS.Hooks.Hooks.getScenario;

public class TextFieldSteps {

    TextFieldScreen textFieldScreen;

    public TextFieldSteps(){
        textFieldScreen = new TextFieldScreen();
    }

    @And("escrever Texto (.*)")
    public void clicarNoVideoPlayer(String texto){
        textFieldScreen.escreverTexto(texto);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar se o texto esta escrito (.*)")
    public void verificarTexto(String texto) {
        Assert.assertEquals(textFieldScreen.verificarSeEstaEscrito(),texto);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }
}
