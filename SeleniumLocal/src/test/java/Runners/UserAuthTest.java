package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//resources//features//Login.feature"
,glue = "stepDefs",
monochrome=true,
dryRun=false
)
//plugin={"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

public class UserAuthTest extends AbstractTestNGCucumberTests {

}
/*
 * features = "src//test//resources//features//UserAuthentication.feature"
 * 
 * ,glue = "stepDefinations"
 * ,plugin = {"pretty", "usage:target\\UsageReport"
 * "					html:target\\HTMLReport.html"
 * 						"json:target\\JSONReport.json"
 */


//}