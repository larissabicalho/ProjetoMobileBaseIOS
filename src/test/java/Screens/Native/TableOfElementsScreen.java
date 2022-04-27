package Screens.Native;

import Bases.PageBase;
import org.openqa.selenium.By;

public class TableOfElementsScreen extends PageBase {
    By menuTable = By.xpath("//XCUIElementTypeStaticText[@name='Table of elements']");
    By menu39 = By.xpath("//XCUIElementTypeStaticText[@name='39']");

    public void clicarTableOfElements() { click(menuTable); }


    public void scroll39() {
        while (!returnElementDisplayedElement(menu39)) {
            topToBottonSwipe();
        }
    }

    public String verificarTexto39() {
        click(menu39);
        return getText(menu39);
    }
}
