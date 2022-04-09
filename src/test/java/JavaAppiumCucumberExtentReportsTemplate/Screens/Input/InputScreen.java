package JavaAppiumCucumberExtentReportsTemplate.Screens.Input;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class InputScreen extends PageBase {
    By index = By.xpath("//*[@type='XCUIElementTypePageIndicator']");

    public void swipe(int qtdSwipe) {

      for (int i = 1; i < qtdSwipe; i++) {
          scrollUsingTouchActionsE(5);

     }
    }
}
