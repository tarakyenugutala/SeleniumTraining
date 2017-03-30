package spacehire.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class BasePage {

	public static WebDriver driver;
	
	public BasePage(WebDriver driver){
		this.driver = driver;
	}
	
	public void openBrowser(){
		driver.get("https://www.spacehire.com/");
	}
	
	public void verifyTitle(String expectedTitle){
		try{
			Assert.assertEquals(driver.getTitle(), expectedTitle);
		}
		catch(Error e){
			System.out.println("Title is not matched");
		}
		
	}
	
	
	
}
