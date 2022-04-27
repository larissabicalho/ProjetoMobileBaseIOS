package com.DesafioIOS.StepDefinitions;

import com.DesafioIOS.Enums.Users;
import com.DesafioIOS.Flows.LoginFlows;
import com.DesafioIOS.Screens.LoginScreen;
import com.DesafioIOS.Utils.Arquivos;
import com.DesafioIOS.Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import java.io.FileNotFoundException;

import static com.DesafioIOS.Hooks.Hooks.getScenario;


public class LoginSteps {

    LoginFlows loginFlows;
    LoginScreen loginScreen;

    public LoginSteps(){
        loginFlows = new LoginFlows();
        loginScreen = new LoginScreen();
    }

    @And("efetuar o login")
    public void fazerLogin() throws FileNotFoundException, InterruptedException {
        Users usersDados = Arquivos.getJsonUsers();
        loginFlows.efetuarLogin(usersDados.getUser(), usersDados.getSenha());
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("efetuar o login errado")
    public void fazerLoginErrado() throws FileNotFoundException, InterruptedException {
        Users usersDados = Arquivos.getJsonUsers();
        loginFlows.efetuarLogin(usersDados.getUserErrado(), usersDados.getSenhaErrada());
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar Logout")
    public void clicarLogout(){
        loginScreen.clicarEmLogout();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar Login Admin")
    public void verificarLogin()  {
        Assert.assertEquals(loginScreen.verificarMessageLogin(),"Logged in as admin");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("verificar tela principal")
    public void verificarTelaPrincipal(){
        Assert.assertTrue(loginScreen.verificarSeVoltouParaInicial());
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar Login Errado")
    public void verificarLoginErrado(){
        Assert.assertEquals(loginScreen.verificarMessageLoginErrado(),"PERMISSION DENIED");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar TryButton")
    public void clicarTryButton(){
        loginScreen.clicarTryButton();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }
}
