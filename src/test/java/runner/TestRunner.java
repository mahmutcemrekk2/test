package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utils.DriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepdefinitions"},
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"
        },
        monochrome = true
)
public class TestRunner {
    @AfterClass
    public static void cleanUp() {
        DriverManager.quitDriver();
    }
}
