package JavaAppiumCucumberExtentReportsTemplate.Screens;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import net.sourceforge.tess4j.TesseractException;
import org.openqa.selenium.By;

import java.io.IOException;

public class AlertsScreen extends PageBase {
    By botaoToast = By.xpath("//XCUIElementTypeButton[@name='Modal']");
    By botaoAlert = By.xpath("//XCUIElementTypeButton[@name='Alert']");
    By alertMessage = By.xpath("//XCUIElementTypeButton[@name='OK']");
    By verificarTextoModal = By.xpath("//XCUIElementTypeStaticText[@name='This is a modal view']");
    By clicarModalTexto = By.xpath("//XCUIElementTypeButton[@name='OK']");


    public void clicarNoAlert(){
        waitForElement(botaoAlert);
        click(botaoAlert);
    }

    public void clicarNoModal(){
        waitForElement(botaoToast);
        click(botaoToast);
    }

    public String elementoToast() throws TesseractException, IOException {
        return getText(verificarTextoModal);
    }

    public String getAlertText() {
         waitForElement(alertMessage);
         return getText(alertMessage);
    }

}
