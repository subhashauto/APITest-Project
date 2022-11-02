package Pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.CommMethods;

public class Customer_consent_email_pages {
	WebDriver driver;

	public Customer_consent_email_pages(WebDriver driver) {
		this.driver = driver;

	}

	private By enter_emailid = By.xpath("//input[@type='email']");
	private By click_email_next_btn = By.xpath("//span[text()='Next']");
	private By enter_Pass = By.xpath("//input[@type='password']");
	private By click_pass_next_btn = By.xpath("//span[text()='Next']");
	private By check_support_mail_id = By.xpath("//span[@email='support@lastdecimal.com']");
	private By select_app_number = By.xpath("//a[contains(text(),'5')]");
	private By cust_consent_summry_page_next_btn=By.xpath("//span[text()=' Submit ']");
	public By cust_consent_otp=By.xpath("//input[@formcontrolname='otp']");
	public By cust_consent_otp_submit=By.xpath("//span[text()='Submit']");
	


	public void open_new_window() {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("https://mail.google.com/mail/u/0/?tab=km#inbox");

	}

	public void gmail_login() throws InterruptedException {
		driver.findElement(enter_emailid).sendKeys("subhash.shinde@lastdecimal.com");		
		driver.findElement(click_email_next_btn).click();
		Thread.sleep(4000);
		driver.findElement(enter_Pass).sendKeys("Decimal@123");
		driver.findElement(click_pass_next_btn).click();
		Thread.sleep(2000);
	}

	public void select_appln_number() throws InterruptedException {
		List<WebElement> support_emails = driver.findElements(check_support_mail_id);
		support_emails.get(1).click();
		Thread.sleep(2000);
		CommMethods.clickElement(driver, select_app_number, 5);
		driver.close();
		
		//driver.findElement(select_app_number).click();
		//List<WebElement> select_appin_number = driver.findElements(select_app_number);
		// select_appin_number.get(0).click();*/
		//System.out.println("The Total no. of Application is:" + select_appin_number.size());
		//select_appin_number.get(0).click();

		/*
		 * for (int i = 0; i <= select_appin_number.size(); i++) {
		 * 
		 * System.out.println("Check next If condition"); if
		 * (select_appin_number.equals(i)) { select_appin_number.get(i).click();
		 * //select_appin_number.get(i).click();
		 * 
		 * System.out.println("The application selected and selected");
		 * 
		 * }
		 * 
		 * }
		 */

	}

	public void cust_consent_summary_page() throws Exception {
		//((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		driver.findElement(cust_consent_summry_page_next_btn).click();
		/*String mainWindowHandle=driver.getWindowHandle();
		Set<String> s1=driver.getWindowHandles();		
		Iterator<String> i1=s1.iterator();
		while(i1.hasNext()) {
			String ChildWindow=i1.next();
			if(!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				Thread.sleep(2000);
				driver.findElement(cust_consent_summry_page_next_btn).click();
			}
			
		}*/
		Thread.sleep(2000);

	}
	
	public void enter_consent_otp() throws InterruptedException {
		CommMethods.sendKeysElement(driver, cust_consent_otp, "561392", 5);
		Thread.sleep(1000);
		CommMethods.clickElement(driver, cust_consent_otp_submit, 5);
		
	}
	

}
