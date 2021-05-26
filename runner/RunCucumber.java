package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
					dryRun = false, 
					features= {"src/test/java/Feature/F01_Login.feature",
							"src/test/java/Feature/F02_CreateReqMgmt.feature",	
							"src/test/java/Feature/F03_UpdateReqMgmt.feature",
							"src/test/java/Feature/F04_CancelReqMgmt.feature",
					"src/test/java/Feature/F05_DeleteReqMgmt.feature"},
					glue= {"stepdefs","hooks"},
					monochrome = true,
					publish= true
				//	tags = "@smoke"
				
				)
public class RunCucumber extends AbstractTestNGCucumberTests{

}