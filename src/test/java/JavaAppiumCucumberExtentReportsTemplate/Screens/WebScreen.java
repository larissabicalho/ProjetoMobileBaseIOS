package JavaAppiumCucumberExtentReportsTemplate.Screens;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class WebScreen extends PageBase {
    By verificarAmazon = By.xpath("//XCUIElementTypeOther[@name='Amazon.com. Spend less. Smile more.']");

    public boolean verificarSeExiste(){
        return returnElementDisplayed(verificarAmazon);
    }
}
