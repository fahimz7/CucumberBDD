package runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/feature"},
        glue={"stepdefinitions"},
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"},
        strict = true,

        monochrome=true,
        tags={""}
        // tags={"@Test1,@Test2"}

)

public class AERunner {
}
