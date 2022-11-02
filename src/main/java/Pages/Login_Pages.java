package Pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.CommMethods;
import Utilities.ConfigReader;

public class Login_Pages {
	WebDriver driver;
	WebDriver driver1;
	ConfigReader configReader = new ConfigReader();
	Properties prop;

	@FindBy(id = "mat-input-0")
	WebElement txt_username;

	@FindBy(id = "mat-input-1")
	WebElement txt_password;

	@FindBy(id = "BtnLogin")
	WebElement btn_login;

	private By user_id = By.xpath("//div//input[starts-with(@placeholder,'Username')]");
	private By user_pass = By.xpath("//div//input[starts-with(@placeholder,'Password')]");
	private By log_button = By.xpath(
			"//button[@class='mat-focus-indicator login-btn mat-raised-button mat-button-base mat-primary']//span[@class='mat-button-wrapper']");

	private By bom_paymnt_app_user_id = By.xpath("//input[@formcontrolname='username']");
	private By bom_paymnt_app_user_pass = By.xpath("//input[@formcontrolname='password']");
	private By bom_paymnt_app_log_button = By.xpath("//span[text()='Login']");
	private By select_logout = By.xpath("//img[@src='../../assets/icons/admin_panel_settings-24px.svg']");
	private By logout = By.xpath("//button[@role='menuitem' and @tabindex='0']");

	public Login_Pages(WebDriver driver) {
		this.driver = driver;
		// PageFactory.initElements(driver, this);

	}

	public void webLogin(String username, String password) throws IOException, InterruptedException {
		prop = configReader.init_prop();
//		txt_username.sendKeys(username);
//		txt_password.sendKeys(password);
		// btn_login.click();
//		CommMethods.sendKeysElement(driver, user_id, prop.getProperty(username), 5);		
//		CommMethods.sendKeysElement(driver, user_pass, prop.getProperty(password),5);
//		driver.findElement(log_button).click();

		if (CommMethods.verifyElementDisplayed(driver, log_button, 5)) {
			System.out.println("Ther login user id :" + prop.getProperty(username));
			CommMethods.sendKeysElement(driver, user_id, prop.getProperty(username), 5);
			CommMethods.sendKeysElement(driver, user_pass, prop.getProperty(password), 5);
			CommMethods.clickElement(driver, log_button, 5);

		} else {
			System.out.println("Unable to login into the system");
		}

	}

	public void weblogin_payment_approver() throws IOException, InterruptedException {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Subhash\\Automation\\chromedriver.exe"); WebDriver driver = new
		 * ChromeDriver();
		 */
		driver.get("https://uat.bancaedge.com/account/login");
		// driver.manage().window().maximize();
		/*
		 * if(CommMethods.verifyElementDisplayed(driver, bom_paymnt_app_log_button, 5))
		 * { CommMethods.sendKeysElement(driver, bom_paymnt_app_user_id,
		 * prop.getProperty(userid), 5); CommMethods.sendKeysElement(driver,
		 * bom_paymnt_app_user_pass, prop.getProperty(userpass), 5);
		 * CommMethods.clickElement(driver, bom_paymnt_app_log_button, 5);
		 * 
		 * }
		 */
		CommMethods.sendKeysElement(driver, bom_paymnt_app_user_id, "bompaymentapprover", 5);
		CommMethods.sendKeysElement(driver, bom_paymnt_app_user_pass, "{9eoblh5pt1N", 5);
		CommMethods.clickElement(driver, bom_paymnt_app_log_button, 5);
		//driver.switchTo().alert().dismiss();
		

	}

	public void Weblogout() throws InterruptedException {
		driver.findElement(select_logout).click();
		Thread.sleep(1000);
		List<WebElement> sel_logout = driver.findElements(logout);
		sel_logout.get(13).click();
		// driver.findElement(logout).click();

	}

}
