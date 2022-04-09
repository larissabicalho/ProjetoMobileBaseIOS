package JavaAppiumCucumberExtentReportsTemplate.Screens.Native;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class ScrollingViewScreen extends PageBase {

    By menuScrolling = By.xpath("//XCUIElementTypeStaticText[@name='Scrolling View']");
    By finalElemento = By.xpath("//XCUIElementTypeOther[@name='Vertical scroll bar, 3 pages']");

    public void clicarMenuScrooling(){
        click(menuScrolling);
    }


    public void scroolAteFinalDoTexto(){
    //    System.out.println(getText(By.xpath("//XCUIElementTypeApplication[@name=\"AWSDeviceFarmiOSReferenceApp-cal\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeStaticText")));
       topToBottonSwipeTexto();
       topToBottonSwipeTexto();

    }

    public Boolean verificarSeExiste(){
        System.out.println(getText(By.xpath("//XCUIElementTypeApplication[@name=\"AWSDeviceFarmiOSReferenceApp-cal\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeStaticText")));
        return returnElementDisplayed(finalElemento);
    }


}
