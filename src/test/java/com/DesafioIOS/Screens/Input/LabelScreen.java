package com.DesafioIOS.Screens.Input;


import com.DesafioIOS.Bases.PageBase;
import org.openqa.selenium.By;


public class LabelScreen extends PageBase {

    By labelOne = By.xpath("//XCUIElementTypeStaticText[@name='I am label 1']");
    By labelTwo= By.xpath("//XCUIElementTypeStaticText[@name='I am label 2']");
    By labels = By.xpath("//*[@type='XCUIElementTypeStaticText']");

    public String verificarTextoLabel1()
    {
        return getText(labelOne);
    }

    public String  verificarTextoLabel2()
    {
        return getText(labelTwo);
    }

    public int verificarQuantidadeDeLabels()
    {
        return quantidadeElementos(labels);
    }

}
