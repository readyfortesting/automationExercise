package runners;


import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
        plugin={"html:target/cucumber-html-reports-regression/cucumber.html", // buradaki / \\ idi, degistirdim, emin degilim
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features="src/test/resources/features",
        glue = "StepDefinitions",
        tags = "@regression",
        dryRun = false


)


public class RegressionTestRunner {



}