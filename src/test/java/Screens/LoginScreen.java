package Screens;

import Bases.PageBase;
import org.openqa.selenium.By;

public class LoginScreen extends PageBase {

    By usernameField = By.xpath("//XCUIElementTypeTextField[@value='Username']");
    By passwordField = By.xpath("//XCUIElementTypeSecureTextField[@value='Password']");
    By loginButton = By.xpath("//XCUIElementTypeButton[@name='Login']");
    By verificarLogin = By.xpath("//XCUIElementTypeStaticText[@name='Logged in as admin']");
    By verificarLoginErrado = By.xpath("//XCUIElementTypeStaticText[@name='PERMISSION DENIED']");
    By clicarLogout = By.xpath("//*[@type='XCUIElementTypeButton']");
    By clicarTryButton = By.xpath("//*[@type='XCUIElementTypeButton']");
    By loginPageMenu = By.xpath("//XCUIElementTypeStaticText[@name='Login']");

    //Actions
    public void preencherUsuario(String usuario) {
        sendKeys(usernameField, usuario);
    }

    public void preencherSenha(String senha) {
        sendKeys(passwordField, senha);
    }

    public void clicarEmLogin() {
        click(loginButton);
    }

    public String verificarMessageLogin() {
        return getText(verificarLogin);
    }

    public String verificarMessageLoginErrado() {
        return getText(verificarLoginErrado);
    }

    public void clicarEmLogout() {
        click(clicarLogout);
    }

    public boolean verificarSeVoltouParaInicial() {
        return returnElementDisplayed(loginPageMenu);
    }

    public void clicarTryButton(){
        waitForElement(clicarTryButton);
        click(clicarTryButton);
    }

}
