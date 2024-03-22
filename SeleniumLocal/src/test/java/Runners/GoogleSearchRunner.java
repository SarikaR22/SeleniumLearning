package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//resources//Features//GoogleSearchUsingScenarioOutline.feature"
,glue = "stepDefs",
monochrome=true,
dryRun = false

)
public class GoogleSearchRunner extends AbstractTestNGCucumberTests {

}