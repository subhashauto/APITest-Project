package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.CommMethods;

public class User_Home_Page {
	WebDriver driver;
	
	private By policy_vault=By.xpath("//*[text()='Policy Vault']");
	private By quick_quote=By.xpath("//*[text()='Quick Quote']");
	private By one_min_plan=By.xpath("//*[text()='One Minute Plan']");
	
	public User_Home_Page(WebDriver driver) {
		this.driver=driver;
		//PageFactory.initElements(driver, this);
		
	}
	
	public void clickOn_quickquote() {
		driver.findElement(quick_quote).click();
	}
	
	public void clickOn_policyvault() {
		driver.findElement(policy_vault).click();
	}
	
	public void oneMin_plan() {
		driver.findElement(one_min_plan).click();
	}

}
