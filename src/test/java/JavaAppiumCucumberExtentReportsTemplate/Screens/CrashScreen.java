package JavaAppiumCucumberExtentReportsTemplate.Screens;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class CrashScreen extends PageBase {

    By botaoCrash = By.xpath("//XCUIElementTypeButton[@name='ic warning white 48pt']");

    public boolean verificarNoCrash(){
        return returnElementDisplayedElement(botaoCrash);
    }
}
