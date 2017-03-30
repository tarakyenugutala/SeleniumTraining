package spacehire.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import application.driver.ApplicationSpecificDriver;

public class WelcomePage extends BasePage {
	
	ApplicationSpecificDriver sDriver;
	public WelcomePage(WebDriver driver) {
		super(driver);
	}


	By loginButton = By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[4]/a/b");
	By loginButton1 = By.xpath("//*[@id='loginModal']/div/div/div/div[2]/div/div[2]/div[3]/a[1]");
	
	
	public void clickOnLoginButton(){	
		sDriver.clickButton(loginButton);
		
	}
	
	public void clickOnPopupLogin(){
		sDriver.explicitWait(10, loginButton1);
		sDriver.clickButton(loginButton1);
	}
	
	
	
}
