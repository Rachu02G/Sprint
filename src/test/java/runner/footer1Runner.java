package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(
		features = "features",
		glue = "stepDefinitions",
		//plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
	    plugin={"pretty","json:target/cucumberReports.json","html:target/cucumberReports.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	    dryRun=true
		)
 
public class footer1Runner extends AbstractTestNGCucumberTests {
 
}
