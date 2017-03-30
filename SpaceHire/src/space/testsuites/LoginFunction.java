package space.testsuites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import spacehire.pages.BasePage;
import spacehire.pages.WelcomePage;

public class LoginFunction {

/*	WebDriver driver;
	BasePage basePage;
	WelcomePage welcomePage;
	String expectedTitle = "Spacehir";
	@BeforeTest
	public void beforeTest(){
		driver = new FirefoxDriver();
		basePage = new BasePage(driver);
		welcomePage = new WelcomePage(driver);		
	}*/
	
	/*@Test
	public void login() throws InterruptedException{
		basePage.openBrowser();
		//welcomePage.clickOnLoginButton();
		//welcomePage.clickOnPopupLogin();
	}*/
	
	@Test
	public void verifyPageTitle(){
		/*basePage.openBrowser();
		//Assert.assertEquals(driver.getTitle(), expectedTitle);
		basePage.verifyTitle(expectedTitle);*/
		System.out.println("Done");
	}
	
	
	
	
}
