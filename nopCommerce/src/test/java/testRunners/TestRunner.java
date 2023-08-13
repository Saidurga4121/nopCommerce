package testRunners;

import org.junit.runner.RunWith;

// import io.cucumber.junit.CucumberOptions;

// import cucumber.api.CucumberOptions;
// import cucumber.api.junit.Cucumber;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\003KT8744\\eclipse-workspace\\nopCommerce\\src\\test\\resources\\features"
		,glue={"stepDefinitions"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
//		strict = true,// it will check the mapping ,but even if mapping is not correct ,it will execute but will give pending execption todo:implement me
		monochrome = true, // gives the output in readable format
		dryRun=false // if dryrun is true ...then it will just check the mapping.if it is flase , then it will execute the testcase
//		 
		)
public class TestRunner 
{

}
