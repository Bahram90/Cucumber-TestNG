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
                "html:target/default-report",
                "json:target/cucumber1.json"
        })
public class CucumberRunner {
}
