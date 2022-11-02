package Pages;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.CommMethods;
import Utilities.ConfigReader;

public class Home_page_pages {
	WebDriver driver;
	ConfigReader configReader = new ConfigReader();
	Properties prop;

	private By cif_search = By.id("mat-input-2");
	private By btn_submit = By.xpath(
			"//button[@class='mat-focus-indicator next-btn mat-raised-button mat-button-base']//span[@class='mat-button-wrapper']");
	private By select_my_space_menu = By.xpath("//span[text()='My Space']");
	private By select_payment_req = By.xpath("//button[text()='Payment Requests ']");
	private By select_menu_policy_vault = By.xpath("//span[text()=' Policy Vault ']");

	public Home_page_pages(WebDriver driver) {
		this.driver = driver;
		// PageFactory.initElements(driver, this);

	}

	public void customer_search(String CIF) throws IOException {
		prop = configReader.init_prop();
		if (CommMethods.verifyElementDisplayed(driver, cif_search, 5)) {
			System.out.println("The CIF Number is: " + prop.getProperty(CIF));
			CommMethods.sendKeysElement(driver, cif_search, prop.getProperty(CIF), 5);
		}

	}

	public void customer_submit() {
		if (CommMethods.verifyElementDisplayed(driver, btn_submit, 5)) {
			CommMethods.clickElement(driver, btn_submit, 5);
		}

	}

	public void select_menu_Myspace() {
		driver.findElement(select_my_space_menu).click();

	}

	public void select_submenu_Paymentrequest() {
		List<WebElement> pay_req = driver.findElements(select_payment_req);
		pay_req.get(2).click();

	}
	
	public void select_menu_Policyvault() {
		driver.findElement(select_menu_policy_vault).click();

	}
	
	

}
