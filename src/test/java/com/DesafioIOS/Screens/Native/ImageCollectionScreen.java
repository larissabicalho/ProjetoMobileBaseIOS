package com.DesafioIOS.Screens.Native;

import com.DesafioIOS.Bases.PageBase;
import org.openqa.selenium.By;

public class ImageCollectionScreen extends PageBase {

    By imageGallery = By.xpath("//XCUIElementTypeStaticText[@name='Image Gallery']");
    By imagensGallery = By.xpath("//*[@type='XCUIElementTypeImage']");

    public int verificarSeExisteGaleria() {
        return quantidadeElementos(imagensGallery);
    }

    public void clicarImageGallery() { click(imageGallery); }

}

