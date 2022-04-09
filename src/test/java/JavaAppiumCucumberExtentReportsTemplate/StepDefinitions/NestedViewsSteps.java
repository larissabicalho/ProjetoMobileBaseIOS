package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions;

import JavaAppiumCucumberExtentReportsTemplate.Screens.NestedViewsScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class NestedViewsSteps {

    NestedViewsScreen nestedViewsScreen ;


    @And("clicar no Back Navigation")
    public void clicarNoBack() {
        nestedViewsScreen = new NestedViewsScreen();
        nestedViewsScreen.clicarNoBack();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no More")
    public void clicarNoMore() {
        nestedViewsScreen = new NestedViewsScreen();
        nestedViewsScreen.clicarNoMore();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }
    @And("clicar no Next Level Back (.*)")
    public void clicarNoNextLevelBack(String valor){
        nestedViewsScreen = new NestedViewsScreen();
        nestedViewsScreen.clicarNoNextLeveBack(valor);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar Final Level (.*)")
    public void verificarTexto(String texto){
        nestedViewsScreen = new NestedViewsScreen();
        Assert.assertEquals(nestedViewsScreen.verificarFinalLevel(texto), texto);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }


    @Then("verificar se voltou para inicial")
    public void verificarValor(){
        nestedViewsScreen = new NestedViewsScreen();
         Assert.assertTrue(nestedViewsScreen.verificarSeVoltouPrincipal());
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
