package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
					dryRun = false, 
					features= {"src/test/java/Feature/F05_DeleteReqMgmt.feature"},
					glue= {"stepdefs","hooks"},
					monochrome = true
				//	tags = "@smoke"
				
				)
public class RunCucumber extends AbstractTestNGCucumberTests{

}