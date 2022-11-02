package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.CommMethods;

public class Health_quote_gen_pages {
	WebDriver driver;
	private By ind_policy=By.xpath("//div[text()=' Individual']");
	private By ff_policy=By.xpath("//mat-radio-group[@formcontrolname='policyType']//div//mat-radio-button[@value='2']");
	private By pol_cover_new=By.xpath(".//div[text()=' Buy a New Policy with Hospitalization Cover ']");
			//("//*[text()=' Buy a New Policy with Hospitalization Cover ']//preceding::div[3]");
	private By pol_cover_ex=By.xpath("//*[text()=' Enhance Existing Cover ']");
	private By select_pol_cover_amount=By.xpath("//mat-select[@formcontrolname='sumAssured']");
	private By pol_cover_amt_ex=By.xpath("//span[text()='Five Lakh']");
	private By pol_cover_amt_10_lakh=By.xpath("//span[text()=' Ten Lakh ']");
	private By Pol_cover_amt_required=By.xpath("//div[starts-with(@class,'mat-select-value ng-tns-')]//span//span[text()='Five Lakh']");
	private By select_pol_cover_for_year=By.xpath("//mat-select[@formcontrolname='tenure']");
	private By select_pol_cover_1_year=By.xpath("//span[text()=' 1 ']");
	private By select_pol_self_pri_member=By.xpath("//mat-option[@id='mat-option-40']");
	private By select_pol_pri_member=By.xpath("//mat-select[@formcontrolname='primaryMember']");
	private By cust_dob=By.xpath("");
	private By cust_gen_male=By.xpath("//div[text()='Male']");
	private By cust_gen_female=By.xpath("//mat-radio-button[@value='F']//label//div[text()='Female']");
	private By cust_is_smoker_yes=By.xpath("//div//mat-radio-group[@formcontrolname='smoker']//div[text()='Yes']");
	private By cust_is_smoker_no=By.xpath("//mat-radio-group[@formcontrolname='smoker']//div[text()='No']");
	private By cust_good_helath_yes=By.xpath("//mat-radio-group[@formcontrolname='dogh']//div[text()='Yes']");
	private By cust_good_health_no=By.xpath("//mat-radio-group[@formcontrolname='dogh']//div[text()='No']");
	private By cust_pincode=By.xpath("");
	private By btn_gen_quote=By.xpath("//button/span[text()=' Generate Quote ']");
	private By person_smoker_preexcondtn_no=By.xpath("//div[text()='No']");

	public Health_quote_gen_pages(WebDriver driver) {
		this.driver=driver;
		//PageFactory.initElements(driver, this);
		
	}
	
	/*public void select_ind_pol_type() {
		driver.findElement(ind_policy).click();
	}
	
	public void select_pol_ampunt() {
		driver.findElement(pol_cover_amt_ex);
	}
	public void select_ff_pol_type() {
		driver.findElement(ff_policy).click();
	}
	
	public void select_cust_smoker_yes() {
		driver.findElement(cust_is_smoker_yes).click();
	}
	
	public void select_cust_smoker_no() {
		driver.findElement(cust_is_smoker_no).click();
	}
	
	public void select_cust_dogh_yes() {
		driver.findElement(cust_good_helath_yes).click();
	}
	
	public void select_cust_dogh_no() {
		driver.findElement(cust_good_health_no).click();
	}
	
	public void generate_quote() {
		driver.findElement(btn_gen_quote).click();
	}
	
	public void select_pol_cover_new() {
		driver.findElement(pol_cover_new).click();
	}
	
	public void select_gender_female() {
		driver.findElement(cust_gen_female).click();
	}*/
	
	public void health_quote_form() throws InterruptedException{
		CommMethods.clickElement(driver, ind_policy, 0);
		CommMethods.clickElement(driver, pol_cover_new, 0);
		CommMethods.clickElement(driver, ind_policy, 0);
		CommMethods.clickElement(driver, select_pol_cover_amount, 0);
		Thread.sleep(1000);
		if(CommMethods.verifyElementDisplayed(driver, pol_cover_amt_10_lakh, 5)) {
			CommMethods.clickElement(driver, pol_cover_amt_10_lakh, 5);
		}
		
		CommMethods.clickElement(driver, select_pol_cover_for_year, 0);
		Thread.sleep(1000);
		CommMethods.clickElement(driver, select_pol_cover_1_year, 0);		
		CommMethods.clickElement(driver, select_pol_pri_member, 0);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		CommMethods.clickElement(driver, select_pol_self_pri_member, 0);
		Thread.sleep(4000);
		CommMethods.clickElement(driver, cust_is_smoker_no, 5);
		CommMethods.clickElement(driver, cust_good_health_no, 5);		
		CommMethods.clickElement(driver, btn_gen_quote, 5);
		
	}

}
