package JavaAppiumCucumberExtentReportsTemplate.Screens.Input;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class DatePickerScreen extends PageBase {
    By clicarNoData = By.xpath("//XCUIElementTypeOther[@name=\"Date Picker\"]");
    By trocarMesAno = By.xpath("//XCUIElementTypeButton[@name='Show year picker']");
    By trocarOMes = By.xpath("//XCUIElementTypePickerWheel[@value='maio']");
    By verificarData = By.xpath("//android.widget.TextView[@content-desc='Datepicker Display']");
    By tirarDataHidden = By.xpath("//XCUIElementTypeButton[@name=\"Hide year picker\"]");


    public void procurarAData(){
        click(clicarNoData);
    }
    public void trocarPicker(){
        click(trocarMesAno);
    }

    public void hiddenPicker(){
        click(tirarDataHidden);
    }

    public void procurarOMes(){
       swipeElementWithDirection2(By.xpath("(//*[@type='XCUIElementTypePickerWheel'])[1]"),"up");
       // click(trocarOMes);
    }

    public void procurarOAno(){
        swipeElementWithDirection2(By.xpath("(//*[@type='XCUIElementTypePickerWheel'])[2]"),"down");
    }


    public boolean verificarAno(){
        return getText(clicarNoData).equals("5 de out. de 2028");
    }


}
