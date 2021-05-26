package stepdefs;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CreateRequest extends BaseClass {
	
	   String reqQno;
	   String firstEle;
	   String ReqStatus;

		

		
		@And("Switch Frame")
		public void switchFrame() {
			driver.switchTo().frame("gsft_main");
		}
		
		@And("Click on  New button")
		public void clickNew() {
			driver.findElement(By.id("sysverb_new")).click();
		}
		
		
		@And("Click on Request")
		public void clickRequest() {
			driver.findElement(By.linkText("Request")).click();
		}
		
		@And("Get Request Entry No")
		public void getReqNo() throws InterruptedException
		{
			 reqQno = driver.findElement(By.id("sc_request.number")).getAttribute("value");
			System.out.println(reqQno);
			Thread.sleep(1000);
		}
		
		
		@And("Click Submit")
		public void clickSubmit() throws InterruptedException {
			driver.findElement(By.id("sysverb_insert")).click();
			System.out.println("The Request Entry is Created Successfully");
			Thread.sleep(1000);
		}
		
		@And("Click on Search for Request no")
		public void clickSearch() throws InterruptedException
		{
			driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(reqQno + Keys.ENTER);
			Thread.sleep(2000);
			
		}
		
		@And("Click on First Request no") 
		public void clickFirstReq() throws InterruptedException
		{
			firstEle = driver.findElement(By.xpath("(//td[@class='vt'])[1]/a")).getText();
			System.out.println(firstEle);
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//td[@class='vt'])[1]/a")).click();
			
		}
		
		@Then("Verify the Request Status")
		public void verifyReqStatus()
		{
			 ReqStatus = driver.findElement(By.id("sc_request.request_state")).getText();

			 if(ReqStatus.contains("Pending"))
			 {
				 System.out.println("The Request is in  Pending Approval status");
			 }else {
				 System.out.println("The Request is not in expected status");
			 }
		}

}
