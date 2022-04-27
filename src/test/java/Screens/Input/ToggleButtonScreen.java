package Screens.Input;

import Bases.PageBase;
import org.openqa.selenium.By;

public class ToggleButtonScreen extends PageBase {

    By toggleButton = By.xpath("//*[@type='XCUIElementTypeSwitch']");

    public void clicarElementoToggle() {
        waitForElement(toggleButton);
        click(toggleButton);
    }

    public String verificarToggle() {
        waitForElement(toggleButton);
        return getText(toggleButton);
    }
}
