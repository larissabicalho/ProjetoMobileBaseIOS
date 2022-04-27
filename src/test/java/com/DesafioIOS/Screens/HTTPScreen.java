package com.DesafioIOS.Screens;

import com.DesafioIOS.Bases.PageBase;
import org.openqa.selenium.By;

public class HTTPScreen extends PageBase {

    By textoSite = By.xpath("//XCUIElementTypeTextField[@name='navigation bar']");
    By validarGoogle = By.xpath("//XCUIElementTypeImage[@name='Google']");
    By clicarEmGO = By.xpath("//XCUIElementTypeButton[@name='Go']");


    public void clicarELimparHome(){
        waitForElement(textoSite);
        clear(textoSite);
        click(textoSite);
    }

    public void preencherSite(String site){ sendKeys(textoSite, site); }

    public String validarMensagemGoogle(){
        return getText(validarGoogle);
    }

    public void clicarNoEnterParaSite(){
        click(clicarEmGO);
    }


}
