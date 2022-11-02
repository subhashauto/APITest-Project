package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Contact_details_pages {
	WebDriver driver;
	public Contact_details_pages(WebDriver driver) {
		this.driver=driver;
		
	}
	
	private By select_mailing_address=By.xpath("//div[text()='Yes']");
	private By fill_address_line1=By.xpath("//input[@formcontrolname='policyaddressline1']");
	private By fill_address_line2=By.xpath("//input[@formcontrolname='policyaddressline2']");
	private By fill_address_line3=By.xpath("//input[@formcontrolname='policyaddressline3']");
	private By click_on_next_btn=By.xpath("//span[text()=' Next ']");
	
	public void select_mailing_address() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> select_address=driver.findElements(select_mailing_address);
		select_address.get(3).click();
		
	}
	
	public void fill_address_lines() {
		driver.findElement(fill_address_line1).clear();
		driver.findElement(fill_address_line1).sendKeys("B 21 AMAR JIVAN CHS");
		driver.findElement(fill_address_line2).clear();
		driver.findElement(fill_address_line2).sendKeys("SENAPATI BAPAT CROSS RD");
		driver.findElement(fill_address_line3).clear();
		driver.findElement(fill_address_line3).sendKeys("SENAPATI BAPAT CROSS RD");
		
	}
	
	public void contact_dtls_page_nxt_btn() {
		List<WebElement> next_btn=driver.findElements(click_on_next_btn);
		next_btn.get(3).click();
		
	}

}
