package Screens.Native;

import Bases.PageBase;
import org.openqa.selenium.By;

public class ScrollingViewScreen extends PageBase {

    By menuScrolling = By.xpath("//XCUIElementTypeStaticText[@name='Scrolling View']");
    By finalElemento = By.xpath("//XCUIElementTypeOther[@name='Vertical scroll bar, 3 pages']");


    public void clicarMenuScrooling() { click(menuScrolling); }


    public void scroolAteFinalDoTexto() {
        topToBottonSwipeTexto(finalElemento, "TOP");
        topToBottonSwipeTexto(finalElemento, "TOP");
    }

    public Boolean verificarSeExiste() { return returnElementDisplayed(finalElemento); }

}
