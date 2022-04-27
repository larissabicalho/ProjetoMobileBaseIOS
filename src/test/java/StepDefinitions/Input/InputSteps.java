package StepDefinitions.Input;

import Screens.Input.InputScreen;
import Utils.DriverFactory;
import io.cucumber.java.en.And;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static Hooks.Hooks.getScenario;

public class InputSteps {

    InputScreen inputScreen;

    public InputSteps(){
        inputScreen = new InputScreen();
    }
    @And("clicar no segundo Info")
    public void clicarNoMenuAdd(){
        inputScreen.swipe(2);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no terceiro Info")
    public void clicarNoMenuData() {
        inputScreen.swipe(3);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no quarta Info")
    public void clicarNoLabel(){
        inputScreen.swipe(4);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no sexta Info")
    public void clicarNoToogle(){
        inputScreen.swipe(6);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no nona Info")
    public void clicarNoSpinner(){
        inputScreen.swipe(9);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no decima Info")
    public void clicarNo(){
        inputScreen.swipe(10);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }
}
