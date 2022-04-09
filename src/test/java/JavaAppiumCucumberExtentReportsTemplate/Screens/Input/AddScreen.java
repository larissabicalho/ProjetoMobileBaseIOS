package JavaAppiumCucumberExtentReportsTemplate.Screens.Input;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class AddScreen extends PageBase {
    By moreInfo = By.xpath("//XCUIElementTypeButton[@name='add']");
    By informationButton = By.xpath("//XCUIElementTypeButton[@name='More Info']");
    By validarCheckBox = By.xpath("//android.widget.TextView[@content-desc='Checkbox Display']");


    public void clicarNoAdd(){
       click(moreInfo);
    }

    public void clicarNoInformation(){
        click(informationButton);
    }

    public String verificarTextoInfo(){
        return getText(informationButton);
    }

    public String verificarTextoAdd(){
        return getText(moreInfo);
    }


}
