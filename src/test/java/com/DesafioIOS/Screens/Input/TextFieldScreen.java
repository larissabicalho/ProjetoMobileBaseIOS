package com.DesafioIOS.Screens.Input;

import com.DesafioIOS.Bases.PageBase;
import org.openqa.selenium.By;

public class TextFieldScreen extends PageBase {

    By textField = By.xpath("//*[@type='XCUIElementTypeTextView']");

    public void escreverTexto(String texto){
        click(textField);
        clear(textField);
        sendKeys(textField, texto);
    }

    public String verificarSeEstaEscrito(){
       return getText(textField);
    }

}
