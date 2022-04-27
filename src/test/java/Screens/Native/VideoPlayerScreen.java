package Screens.Native;

import Bases.PageBase;
import org.openqa.selenium.By;

public class VideoPlayerScreen extends PageBase {

    By menuVideo = By.xpath("//XCUIElementTypeStaticText[@name='Video Player']");
    By videoAparecendo = By.xpath("//XCUIElementTypeOther[@name='Audio']");

    public void clicarMenuVideo(){
        click(menuVideo);
    }

    public boolean verificarSeOElementoExiste(){
        return returnElementExists(videoAparecendo);
    }


}
