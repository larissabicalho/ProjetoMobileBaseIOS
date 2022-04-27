package Screens.Input;

import Bases.PageBase;
import org.openqa.selenium.By;

public class DatePickerScreen extends PageBase {

    By mes = By.xpath("(//*[@type='XCUIElementTypePickerWheel'])[1]");
    By ano = By.xpath("(//*[@type='XCUIElementTypePickerWheel'])[2]");
    By clicarNoData = By.xpath("//XCUIElementTypeOther[@name='Date Picker']");
    By trocarMesAno = By.xpath("//XCUIElementTypeButton[@name='Show year picker']");
    By tirarDataHidden = By.xpath("//XCUIElementTypeButton[@name='Hide year picker']");


    public void procurarAData(){
        click(clicarNoData);
    }

    public void trocarPicker(){
        click(trocarMesAno);
    }

    public void hiddenPicker(){
        click(tirarDataHidden);
    }

    public void procurarOMes(){ swipeElementWithDirection2(mes,"up");}

    public void procurarOAno(){ swipeElementWithDirection2(ano,"down"); }

    public boolean verificarAno(){
        return getText(clicarNoData).equals("5 de out. de 2028");
    }

}
