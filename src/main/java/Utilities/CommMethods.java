package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.support.ui.WebDriverWait;



public class CommMethods {
	
	public static void sendKeysElement(WebDriver driver,By locator,String InputValue,int Timeout) {
		Assert.assertTrue(verifyElementDisplayed(driver, locator, Timeout),
				"Element is not displayed with locator" +locator+ "");
		String Value=driver.findElement((locator)).getAttribute("value");
		if(!Value.isEmpty()) {
		driver.findElement((locator)).click();
		driver.findElement((locator)).clear();
		}
		driver.findElement((locator)).sendKeys(InputValue);
	}
	
	public static boolean verifyElementDisplayed(WebDriver driver,By locator,int Timeout) {
		boolean status=false;
		try {
			waitUntilVisibilityOfElementByXpath(driver, locator, Timeout);
			if(driver.findElement(locator).isDisplayed())
            status=true;
			
			
		}
		catch(Exception e){
			status=false;
			
		}
		return status;
		
	}
	
	
	public static List<WebElement> clickElements(WebDriver driver,By locator,int Timeout) {
		if(verifyElementDisplayed(driver, locator, Timeout)) {
			try{
				waitUntilElementIsClickableByXpath(driver, locator, Timeout);
				driver.findElement((locator)).click();
			}
			catch(Exception e) {
				Assert.assertTrue(false, "Not able to click the Element with xPath" +locator);
				
			}
		}
		else {
			Assert.assertTrue(false, "Element is not displayed with xPath" +locator);
		}
		return null;
	
	}
	
	public static void clickElement(WebDriver driver,By locator,int Timeout) {
		if(verifyElementDisplayed(driver, locator, Timeout)) {
			try{
				waitUntilElementIsClickableByXpath(driver, locator, Timeout);
				driver.findElement((locator)).click();
			}
			catch(Exception e) {
				Assert.assertTrue(false, "Not able to click the Element with xPath" +locator);
				
			}
		}
		else {
			Assert.assertTrue(false, "Element is not displayed with xPath" +locator);
		}
	
	}
	
	public static boolean waitUntilVisibilityOfElementByXpath(WebDriver driver,By locator,int Timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Timeout);
		return (wait.until(ExpectedConditions.visibilityOfElementLocated(locator)) != null);		
	}
	
	public static boolean waitUntilElementIsClickableByXpath(WebDriver driver,By locator,int Timeout) {
		WebDriverWait wait=new WebDriverWait(driver, Timeout);
		return(wait.until(ExpectedConditions.elementToBeClickable(locator))!=null);
	}
	
	public static void scrollIntoView(WebDriver driver, By locator) throws Exception {
		CommMethods.waitUntilVisibilityOfElementByXpath(driver, locator, 10);
		WebElement QtyPlusButton = driver.findElement((locator));
		((JavascriptExecutor) driver)
				.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", QtyPlusButton);
		Thread.sleep(800);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,20)");
		Thread.sleep(500);
	}
	
	public static void Customersearch() {
		
	}

}
