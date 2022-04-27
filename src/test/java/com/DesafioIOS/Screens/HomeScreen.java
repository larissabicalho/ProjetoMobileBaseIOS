package com.DesafioIOS.Screens;


import com.DesafioIOS.Bases.PageBase;
import org.openqa.selenium.By;

public class HomeScreen extends PageBase {

    By menuButton = By.xpath("//XCUIElementTypeButton[@name='More']");

    By textoHome = By.xpath("//XCUIElementTypeStaticText[@name='AWS Device Farm Sample app']");

    public void clicarMenu(){
        click(menuButton);
    }

    public String validarTextoHome() {
       return getText(textoHome);
    }


}
