package JavaAppiumCucumberExtentReportsTemplate.Screens.Input;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class ToggleButtonScreen extends PageBase {
    By toggleClick = By.xpath("//android.widget.TextView[@text='Toggle Button']");
    By toggleButton = By.xpath("//*[@type='XCUIElementTypeSwitch']");



    public void clicarElementoToggle(){
        waitForElement(toggleButton);
        click(toggleButton);
    }

    public String verificarToggle(){
        waitForElement(toggleButton);
        return getText(toggleButton);
    }
}
