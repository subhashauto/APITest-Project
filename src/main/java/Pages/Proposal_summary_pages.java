package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import Utilities.CommMethods;

public class Proposal_summary_pages {
	WebDriver driver;

	public Proposal_summary_pages(WebDriver driver) {
		this.driver = driver;
	}

	private By prop_summary_btn = By.xpath("//span[text()=' Submit ']");
	private By cust_review_Pay_confirm_ok_btn = By.xpath("//span[text()=' Ok ']");

	public void proposal_summ_submit() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		CommMethods.clickElement(driver, prop_summary_btn, 5);
		
		

		if (CommMethods.verifyElementDisplayed(driver, cust_review_Pay_confirm_ok_btn, 5)) {
			CommMethods.clickElement(driver, cust_review_Pay_confirm_ok_btn, 5);
			System.out.println("The Element Clicked Successfully");
		}

	}

	public void cust_revw_pay_confirm_Ok() {
		if (CommMethods.verifyElementDisplayed(driver, cust_review_Pay_confirm_ok_btn, 5)) {
			CommMethods.clickElement(driver, cust_review_Pay_confirm_ok_btn, 5);
			System.out.println("The Element Clicked Successfully");

		}

	}

}
