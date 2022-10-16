package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/Cucumber-TestRaporlari2.html",
                "json:target/json-reports/cucumber2.json",
                "junit:target/xml-report/cucumber2.xml" },
        features = "src/test/resources/features",
        glue= "stepDefinitions",
        //tags = "@wip", US1002 yi runnerdan çalıştırmak istersek
        tags = "@aut",
        dryRun = false
)



public class TestRunner2 {
}
