package stepdefs;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteRequest extends BaseClass {

	String firstEle;

	@And("Click on Search Result link for Delete")
	public void clickFirstReqcancel() throws InterruptedException {
		firstEle = driver.findElement(By.xpath("(//td[@class='vt'])[1]/a")).getText();
		System.out.println(firstEle);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[@class='vt'])[1]/a")).click();

	}

	@And("Click on Delete")
	public void clickDeleteReq() {
		driver.findElement(By.id("sysverb_delete")).click();
    }
	
	@And("Click OK")
	public void clickOK() {
		driver.findElement(By.id("ok_button")).click();
    }
	
	@Then("Verify Delete")
	public void verifyDelete() {
	String noRecordsTo = driver.findElement(By.xpath("//td[text()='No records to display']")).getText();

	if(noRecordsTo.equals("No records to display"))
	{
		System.out.println("Deleted Successfully");
	}else {
		System.out.println("Issue with Delete Record");
	}
	
	}
	
	
}
