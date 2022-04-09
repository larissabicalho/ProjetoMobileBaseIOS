package JavaAppiumCucumberExtentReportsTemplate.Screens.Input;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class SolidScreen extends PageBase {
    By solidInfo = By.xpath("//XCUIElementTypeImage[@type='XCUIElementTypeImage']");

    public void swipePequeno(){
        swipeElementWithDirection2(solidInfo, "down");
    }

    public boolean verificarChange() {
        MobileElement element = waitForElement(solidInfo);
        if(element.getCoordinates().onPage().getY()!=398){
            return true;
        } else {
            return false;
        }
    }
}
