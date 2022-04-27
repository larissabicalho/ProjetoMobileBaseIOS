package Tests;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
        features = "src/test/resources/features/Home.feature",
        glue = {"StepDefinitions/","JavaAppiumCucumberExtentReportsTemplate.Hooks"}

)
public class HomeTests extends AbstractTestNGCucumberTests {

}