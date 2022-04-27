package Screens.Input;

import Bases.PageBase;
import org.openqa.selenium.By;

public class AddScreen extends PageBase {

    By moreInfo = By.xpath("//XCUIElementTypeButton[@name='add']");
    By informationButton = By.xpath("//XCUIElementTypeButton[@name='More Info']");


    public void clicarNoAdd(){ click(moreInfo); }

    public void clicarNoInformation(){ click(informationButton); }

    public String verificarTextoInfo(){ return getText(informationButton); }

    public String verificarTextoAdd(){ return getText(moreInfo); }

}
