package stepdefs;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
public class Login extends BaseClass{
	

	
	@When("Load URL {string}")
	public void loadUrl(String url)
	{
		driver.get(url);
	}
	
	@And("Switch Frame Main")
	public void switchFrame() {
		driver.switchTo().frame("gsft_main");
	}

	@And("Type username as {string}")
	public void typeUsername(String username) {
		driver.findElement(By.id("user_name")).sendKeys(username);
	}
	
	
	
	@And("Type password as {string}")
	public void typePassword(String password) {
		driver.findElement(By.id("user_password")).sendKeys(password);
	}
	
	@And("Click Login Button")
	public void clickLogin()
	{
		driver.findElement(By.id("sysverb_login")).click();
	}
	
	@And("Verify Login is successful")
	public void verifyLoginSuccess()
	{
		 WebElement navsideBar =  driver.findElement(By.xpath("//nav[@class='navpage-nav']"));
		String title = driver.getTitle();
		//System.out.println(Homepage);
		System.out.println(navsideBar.isDisplayed());
		if(title.contains("ServiceNow"))
		{
			System.out.println("Login Successful");
		}else
		{
			System.out.println("Login not Successful");
		}
		
		


	}
	
	WebElement filternav;

	@When("Filter input nav as (.*)$")
	public void typeFilter1(String navpage) throws InterruptedException {
		filternav = driver.findElement(By.id("filter"));
		filternav.sendKeys(navpage);
		filternav.sendKeys(Keys.ENTER);
		
		//Thread.sleep(1000);
	}
		
		@And("Switch Main Frame")
		public void switchMainFrame() {
			driver.switchTo().frame("gsft_main");
		}

		
		WebElement searchNum;
		
		@And("Click on Search for Field (.*)$")
		public void clickSearch(String searchinput) throws InterruptedException
		{
			
			searchNum = driver.findElement(By.xpath("//input[@placeholder='Search']"));
			searchNum.sendKeys(searchinput);
			searchNum.sendKeys(Keys.ENTER); 
			Thread.sleep(1000);	

			}
		
		
		@And("Click on ServiceDesk")
		public void clickServiceDesk() 
		{
			driver.findElement(By.xpath("//div[text()='My Work']")).click();
		}
		
	
		
}


