package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.CommMethods;

public class Proposer_basic_info_pages {
	WebDriver driver;
	
	public Proposer_basic_info_pages(WebDriver driver) {
		this.driver=driver;	
			
	}
	private By pan_number=By.xpath("//input[@id='mat-input-14']");
	private By select_nominee_tilte=By.xpath("//span[@class='mat-select-placeholder ng-tns-c78-64 ng-star-inserted']");
	private By select_nominee_Mr=By.xpath("//span[text()=' Mr ']");
	private By enter_nominee_fname=By.xpath("//input[@id='mat-input-15']");
	private By enter_nominee_lname=By.xpath("//input[@id='mat-input-16']");
	private By select_nominee_gender=By.xpath("//span[@class='mat-select-placeholder ng-tns-c78-68 ng-star-inserted']");
	private By select_nominee_gendermale=By.xpath("//span[text()=' Male ']");
	private By select_nominee_reln=By.xpath("//span[@class='mat-select-placeholder ng-tns-c78-71 ng-star-inserted']");
	private By select_nominee_reln_son=By.xpath("//span[text()=' Son ']");
	private By enter_emaiid=By.xpath("//input[@id='mat-input-18']");
	private By enter_mobile_no=By.xpath("//input[@id='mat-input-19']");
	private By open_calender=By.xpath("//*[@class='mat-datepicker-toggle-default-icon ng-star-inserted']");
	private By select_date=By.xpath("//div[text()=' 1 ']");
	private By click_next_btn=By.xpath("//span[text()=' Next ']");
	


 public void proposer_pan() throws InterruptedException {
	 //driver.findElement(pan_number).click();
	 //driver.findElement(pan_number).sendKeys("CDFPR2547R");
	 Thread.sleep(2000);
	 CommMethods.sendKeysElement(driver, pan_number, "CHBPD2345R", 5);
	 
	 
 }
 
 public void nominee_detaisl() {
	 CommMethods.clickElement(driver, select_nominee_tilte, 5);
	 CommMethods.clickElement(driver, select_nominee_Mr, 5);
	 CommMethods.sendKeysElement(driver, enter_nominee_fname, "Anil", 5);
	 CommMethods.sendKeysElement(driver, enter_nominee_lname, "Patil", 5);
	 CommMethods.clickElement(driver, select_nominee_gender, 5);
	 CommMethods.clickElement(driver, select_nominee_gendermale, 5);
	 CommMethods.clickElement(driver, select_nominee_reln, 5);
	 CommMethods.clickElement(driver, select_nominee_reln_son, 5);
	 List<WebElement> open_cal=driver.findElements(open_calender);
	 System.out.println("The total no of element is: " +open_cal.size());
	 open_cal.get(2).click();
	 driver.findElement(select_date).click();
	 
 }
 
 public void policy_communication_details() {
	 CommMethods.sendKeysElement(driver, enter_emaiid, "subhash.shinde@lastdecimal.com", 5);
	 CommMethods.sendKeysElement(driver, enter_mobile_no, "9762185936", 5);
	 
 }
 public void proposer_next_btn() {
	 List<WebElement> next_btn = driver.findElements(click_next_btn);
		next_btn.get(2).click();
 }
 }