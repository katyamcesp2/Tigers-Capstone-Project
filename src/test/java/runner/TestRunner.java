package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.CucumberReportingConfig;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "classpath:features",
		glue = "step.definition",
	    tags = "@retailPageFinalTest or @DesktopsTabFinalTest or @laptopAndNoteBooksFinaltest or @homePageFinalTest",
		dryRun = false,
		monochrome = true,
		strict = true,
		plugin = {"pretty",
				"html:target/site/cucumber-pretty",
				"json:target/cucumber.json"
				},
		
		publish = true	
		)


public class TestRunner {
	
@AfterClass	
public static void generateReport() {
	CucumberReportingConfig.reportingConfig();
}
	

}
