package com.DesafioIOS.Screens;

import com.DesafioIOS.Bases.PageBase;
import org.openqa.selenium.By;


public class AlertsScreen extends PageBase {

    By botaoToast = By.xpath("//XCUIElementTypeButton[@name='Modal']");
    By botaoAlert = By.xpath("//XCUIElementTypeButton[@name='Alert']");
    By alertMessage = By.xpath("//XCUIElementTypeButton[@name='OK']");
    By verificarTextoModal = By.xpath("//XCUIElementTypeStaticText[@name='This is a modal view']");


    public void clicarNoAlert(){
        waitForElement(botaoAlert);
        click(botaoAlert);
    }

    public void clicarNoModal(){
        waitForElement(botaoToast);
        click(botaoToast);
    }

    public String elementoToast(){ return getText(verificarTextoModal); }

    public String getAlertText() {
         return getText(alertMessage);
    }

}
