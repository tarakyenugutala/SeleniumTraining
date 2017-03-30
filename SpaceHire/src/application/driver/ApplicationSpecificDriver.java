package application.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import spacehire.pages.BasePage;

public class ApplicationSpecificDriver extends BasePage {

	public ApplicationSpecificDriver(WebDriver driver) {
		super(driver);		
	}

	
	public static void clickButton(By element){
		driver.findElement(element).click();
	}
	
	public static void implicitWait(long waitTime){
		// polling time= 250ms
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}
	
	public static void explicitWait(long waitTime, By locator){
		// polling time= 500ms
		WebDriverWait wait = new WebDriverWait(driver, waitTime);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	
	}
	
	
	
	
	
}
