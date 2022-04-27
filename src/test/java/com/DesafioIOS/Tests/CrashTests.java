package com.DesafioIOS.Tests;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
        features = "src/test/resources/features/Crash.feature",
        glue = {"com/DesafioIOS/StepDefinitions/","com.DesafioIOS.Hooks"}

)
public class CrashTests extends AbstractTestNGCucumberTests {

}