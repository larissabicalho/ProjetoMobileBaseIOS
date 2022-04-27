package Screens;

import Bases.PageBase;
import org.openqa.selenium.By;

public class NestedViewsScreen extends PageBase {

    By nextLevelButton = By.xpath("//XCUIElementTypeButton[@name='Next']");
    By backNavigationButton = By.xpath("//XCUIElementTypeButton[@name='Back']");
    By more = By.xpath("//XCUIElementTypeButton[@name='More']");
    By verificarNested = By.xpath("//XCUIElementTypeStaticText[@name='Nested']");
    String texto = "//XCUIElementTypeStaticText[@name='###']";



    public void clicarNoBack(){
        waitForElement(backNavigationButton);
        click(backNavigationButton);
    }

    public void clicarNoMore(){
        waitForElement(more);
        click(more);
    }

    public void clicarNoNextLeveBack(String view){
        waitForElement(nextLevelButton);
        int i = Integer.valueOf(view) - 1;
        while(i > 0) {
            if(Integer.valueOf(view) !=1) {
                click(nextLevelButton);
            }
            i = i - 1;
        }
    }


    public String verificarFinalLevel(String palavra){
        texto = texto.replace("###", palavra);
        return getText(By.xpath(texto));
    }

   public boolean verificarSeVoltouPrincipal(){
      return returnElementDisplayedElement(verificarNested);}

}
