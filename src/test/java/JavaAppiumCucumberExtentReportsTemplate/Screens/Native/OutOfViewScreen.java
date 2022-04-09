package JavaAppiumCucumberExtentReportsTemplate.Screens.Native;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class OutOfViewScreen extends PageBase {
    By menuContent = By.xpath("//XCUIElementTypeStaticText[@name='Out of View Component']");
    By hiddenText = By.xpath("//*[@name='This is hidden text' and @visible = 'true']");

    public void clicarMenuContent(){
        click(menuContent);
    }


    public void scrollUntilElementIsShown(){
        while(!returnElementDisplayedElement(hiddenText)){
           topToBottonSwipe();
        }
    }

    public String verificarSeOTextoAparecendo(){
        scrollUntilElementIsShown();
        return getText(hiddenText);
    }



}
