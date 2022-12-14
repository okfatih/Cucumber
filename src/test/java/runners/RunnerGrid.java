package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin = {
                "pretty",
                "html:target/html-reports/cucumber.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        features = "./src/test/resources/features/GridFeatures/grid_test_case.feature",
        glue = {"stepDefinitions"},
        tags = "@cross_browser_test",
        dryRun = false

)
//java -jar selenium-server-4.6.0.jar standalone önemli bu command de k
public class RunnerGrid {

}