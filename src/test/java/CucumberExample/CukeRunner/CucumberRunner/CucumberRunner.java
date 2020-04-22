package CucumberExample.CukeRunner.CucumberRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
        glue={"src/test/java/Steps"},
        dryRun = true,
        strict = false,
        tags = "",
        plugin = {
        "pretty",
                "html:target/cucumber-html-report",
                "json:target/cucumber.json",
                "pretty", "html:target/Destination"
        })
public class CucumberRunner {
}
