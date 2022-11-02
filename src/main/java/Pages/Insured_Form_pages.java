package Pages;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Utilities.CommMethods;

public class Insured_Form_pages {
	WebDriver driver;

	public Insured_Form_pages(WebDriver driver) {
		this.driver = driver;

	}

	private By select_title = By.xpath("//div[@class='mat-select-value ng-tns-c78-38']");
	private By select_title_option = By.xpath("mat-option-text");
	private By select_title_Mr = By.xpath("//span[text()=' Mr ']");
	private By select_marital_status = By.xpath("//div[@class='mat-select-value ng-tns-c78-46']");
	private By select_marital_single = By.xpath("//span[text()=' Single ']");
	private By select_marital_married = By.xpath("//span[text()=' Married ']");
	private By select_occupation_status = By.xpath("//div[@class='mat-select-value ng-tns-c78-48']");
	private By select_occupation_private = By.xpath("//span[text()=' Private Service ']");
	private By insured_next_btn = By.xpath("//span[text()=' Next ']");

	public void select_title() throws InterruptedException {
		System.out.println("Select the Tilte: ");
		Thread.sleep(1000);
		CommMethods.clickElement(driver, select_title, 5);
		CommMethods.clickElement(driver, select_title_Mr, 5);

		// Select title=new Select(driver.findElement(select_title_option));
		// title.selectByVisibleText(" Mr. ");

	}

	public void select_marital_status() {
		System.out.println("Select The Marrital Status: ");
		//Assert.assertTrue(select_marital_status.findElement(.assertEquals(select_marital_status, select_marital_status)), "The Element not Found");
		CommMethods.clickElement(driver, select_marital_status, 5);
		CommMethods.clickElement(driver, select_marital_single, 5);

	}

	public void select_occupation() {
		CommMethods.clickElement(driver, select_occupation_status, 5);
		CommMethods.clickElement(driver, select_occupation_private, 5);
	}

	public void insured_next_button() {
		List<WebElement> next_btn = driver.findElements(insured_next_btn);
		next_btn.get(1).click();
	}

}
