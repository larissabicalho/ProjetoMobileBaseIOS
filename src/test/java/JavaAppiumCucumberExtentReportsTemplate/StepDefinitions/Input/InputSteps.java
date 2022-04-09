package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions.Input;

import JavaAppiumCucumberExtentReportsTemplate.Screens.Input.InputScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class InputSteps {

    InputScreen inputScreen;
    @And("clicar no segundo Info")
    public void clicarNoMenuAdd() throws InterruptedException {
        inputScreen = new InputScreen();
        inputScreen.swipe(2);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no terceiro Info")
    public void clicarNoMenuData() throws InterruptedException {
        inputScreen = new InputScreen();
        inputScreen.swipe(3);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no quarta Info")
    public void clicarNoLabel() throws InterruptedException {
        inputScreen = new InputScreen();
        inputScreen.swipe(4);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no sexta Info")
    public void clicarNoToogle() throws InterruptedException {
        inputScreen = new InputScreen();
        inputScreen.swipe(6);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no nona Info")
    public void clicarNoSpinner() throws InterruptedException {
        inputScreen = new InputScreen();
        inputScreen.swipe(9);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no decima Info")
    public void clicarNo() throws InterruptedException {
        inputScreen = new InputScreen();
        inputScreen.swipe(10);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }
}
