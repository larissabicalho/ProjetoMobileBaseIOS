package Screens.Input;

import Bases.PageBase;
import org.openqa.selenium.By;

public class TextFieldScreen extends PageBase {

    By textField = By.xpath("//*[@type='XCUIElementTypeTextView']");

    public void escreverTexto(String texto){
        clear(textField);
        sendKeys(textField, texto);
    }

    public String verificarSeEstaEscrito(){
       return getText(textField);
    }

}
