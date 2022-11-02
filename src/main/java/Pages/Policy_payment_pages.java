package Pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.CommMethods;

public class Policy_payment_pages {
	WebDriver driver;
	public Policy_payment_pages(WebDriver driver) {
		this.driver=driver;
	}
	
	public By select_payment_method_bank=By.xpath("//span[text()=' At Bank ']");
	public By select_payment_method_online=By.xpath("//span[text()=' Online ']");
	
	public void select_payment_method() {
		CommMethods.clickElement(driver, select_payment_method_bank, 5);
		
	}
	public void close_payment_window() {
		driver.close();
	}
	public void policy_vault_window() {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
	}

}
