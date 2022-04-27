package com.DesafioIOS.Screens;

import com.DesafioIOS.Bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginScreen extends PageBase {

    By usernameField = By.xpath("//XCUIElementTypeTextField[@value='Username']");
    By passwordField = By.xpath("//XCUIElementTypeSecureTextField[@value='Password']");
    By loginButton = By.xpath("//XCUIElementTypeButton[@name='Login']");
    By verificarLogin = By.xpath("//XCUIElementTypeStaticText[@name='Logged in as admin']");
    By verificarLoginErrado = By.xpath("//XCUIElementTypeStaticText[@name='PERMISSION DENIED']");
    By clicarLogout = By.xpath("//XCUIElementTypeButton[@name='log out']");
    By clicarTryButton = By.xpath("//*[@name='try again'][@type = 'XCUIElementTypeButton']");
    By loginPageMenu = By.xpath("//XCUIElementTypeStaticText[@name='Login']");

    //Actions
    public void preencherUsuario(String usuario) {
        sendKeys(usernameField, usuario);
    }

    public void preencherSenha(String senha) throws InterruptedException {
        sendKeys(passwordField, senha);
        esconderTeclado();
    }

    public void clicarEmLogin() {
        waitForElement(loginButton);
        click(loginButton);
    }

    public String verificarMessageLogin() {
        return getText(verificarLogin);
    }

    public String verificarMessageLoginErrado() {
        return getText(verificarLoginErrado);
    }

    public void clicarEmLogout(){
        clicar(clicarLogout);
    }

    public boolean verificarSeVoltouParaInicial() {
        return returnElementDisplayed(loginPageMenu);
    }

    public void clicarTryButton(){ clicar(clicarTryButton); }

}
