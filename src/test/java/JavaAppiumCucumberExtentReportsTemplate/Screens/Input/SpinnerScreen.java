package JavaAppiumCucumberExtentReportsTemplate.Screens.Input;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class SpinnerScreen extends PageBase {
    By selectionPicker = By.xpath("//*[@type = 'XCUIElementTypePickerWheel']");


    public void clicarNoSpinner(String option)
    {
        String selection;
        selection = getText(selectionPicker);
        if(option.contains(selection))
        {}
        else {
            do {
                littleSwipeByElement(selectionPicker, "TOP");
                selection = getText(selectionPicker);
            } while (!option.contains(selection));
        }
    }

    public String verificarSpinner(){
        return getText(selectionPicker);
    }


}
