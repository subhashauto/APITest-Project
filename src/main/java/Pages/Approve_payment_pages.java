package Pages;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.CommMethods;
import Utilities.ConfigReader;

public class Approve_payment_pages {
	WebDriver driver;
	ConfigReader configreader = new ConfigReader();
	Properties prop;
	String textvalue;

	private By select_app_and_appr_Pyment = By.xpath("//button[text()=' Approve ']");
	private By auth_debt_confirm_yes = By.xpath("//span[text()='Yes']");
	private By search_app_no = By.xpath("//input[@formcontrolname='searchField']");
	private By get_app_no = By.xpath("//td[contains(text(),'4')]");
	private By app_no=By.xpath("//table//tr[3]/td[2]");

	public Approve_payment_pages(WebDriver driver) {
		this.driver = driver;

	}

	public void approve_payment_appln() {
		List<WebElement> approve_pay = driver.findElements(select_app_and_appr_Pyment);
		approve_pay.get(0).click();

	}

	public void confirm_debit_auth() {
		CommMethods.clickElement(driver, auth_debt_confirm_yes, 0);
	}

	public void get_app_no() {
		
		WebElement element = driver.findElement(app_no);

		 textvalue = element.getText();

		// WebElement text=element;
		System.out.println("The Text is: " + textvalue);
		
		// call.entertextinfield();
		// driver.findElement(search_app_no).click();
		
	}

	public void search_app_no() {
		driver.findElement(search_app_no).sendKeys(textvalue);
		driver.findElement(search_app_no).sendKeys(Keys.ENTER);
		
	}
	public String getTextOfelement() {
		String elementtext = driver.findElement(get_app_no).getText();
		System.out.println("The text of EleMent is:" + elementtext);
		return elementtext;
	}

	public void enterappnoinfield() {
		driver.findElement(search_app_no).clear();
		driver.findElement(search_app_no).sendKeys(getTextOfelement());

	}

}
