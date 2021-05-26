package stepdefs;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CancelRequest extends BaseClass {

	String firstEle;

	@And("Click on Search Result link for Cancel")
	public void clickFirstReqcancel() throws InterruptedException {
		firstEle = driver.findElement(By.xpath("(//td[@class='vt'])[1]/a")).getText();
		System.out.println(firstEle);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[@class='vt'])[1]/a")).click();

	}

	@And("Click on Cancel Request")
	public void clickLookup() throws InterruptedException {
		driver.findElement(By.xpath("(//button[@name='not_important'])[4]")).click();
	}

	
	
	@Then("Verify Cancel Request")
	public void verifyUpdate() {
		String noRecordsTo = driver.findElement(By.xpath("//td[text()='No records to display']")).getText();
		
		if(noRecordsTo.equals("No records to display"))
		{
			System.out.println("Cancelled Successfully");
		}
	}

}
