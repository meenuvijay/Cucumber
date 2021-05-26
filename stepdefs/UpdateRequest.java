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

public class UpdateRequest extends BaseClass {

	String firstEle;

	@And("Click on First Search Result link")
	public void clickFirstReq() throws InterruptedException {
		firstEle = driver.findElement(By.xpath("(//td[@class='vt'])[1]/a")).getText();
		System.out.println(firstEle);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[@class='vt'])[1]/a")).click();

	}

	@And("Click on look up")
	public void clickLookup() throws InterruptedException {
		driver.findElement(By.id("lookup.sc_request.location")).click();
		Set<String> winset = driver.getWindowHandles();
		List<String> winlist = new ArrayList<String>(winset);
		String secwinhandle = winlist.get(1);
		driver.switchTo().window(secwinhandle);
		System.out.println(driver.getTitle());
	}

	@And("Click on location")
	public void clickLocation() throws InterruptedException {
		driver.findElement(
				By.xpath("//div[@id='treenode_0']/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/img[1]")).click();

		driver.findElement(By.xpath(
				"//div[@id='treenode_0']/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/img[1]"))
				.click();
		driver.findElement(By.linkText("Rhode Island")).click();
		Set<String> winset = driver.getWindowHandles();
		List<String> winlist = new ArrayList<String>(winset);
		String secwinhandle = winlist.get(0);
		driver.switchTo().window(secwinhandle);
		System.out.println(driver.getTitle());

	}

	@And("Click on Date Picker")
	public void clickDate() throws InterruptedException {
		driver.findElement(By.xpath("(//button[@data-date_time_format='yyyy-MM-dd HH:mm:ss']//span)[3]")).click();

		driver.findElement(By.linkText("26")).click();

		driver.findElement(By.id("GwtDateTimePicker_ok")).click();
	}
	
	@And("Click Update")
	public void clickUpdate() {
		driver.findElement(By.id("sysverb_update")).click();
	}
	
	@Then("Verify Update")
	public void verifyUpdate() {
		String Date=driver.findElement(By.xpath("//div[@class='datex date-calendar']")).getText();
		System.out.println(Date);
		String Location=driver.findElement(By.xpath("(//a[@class='linked'])[2]")).getText();
		System.out.println(Location);
		if(Location.equals("Rhode Island"))
		{
			System.out.println("Request Updated Successfully");
		}
	}

}
