package testRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features",
        glue = {"stepDefinition"}, // show step definition

        // reportType:location
        plugin = {"pretty", "html:test-output/html-report"},

        monochrome = true, //display the console properly we can read

        dryRun = false // check if feature files are
)
public class TestRunner {


}
