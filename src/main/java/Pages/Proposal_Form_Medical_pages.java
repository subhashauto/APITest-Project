package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.CommMethods;

public class Proposal_Form_Medical_pages {
	WebDriver driver;

	public Proposal_Form_Medical_pages(WebDriver driver) {
		this.driver = driver;
	}

	private By hospitalization_of_illness_yes = By.xpath("");
	private By hospitalization_of_illness_no = By.xpath(
			"/html/body/app/div/div[2]/app-proposal/mat-horizontal-stepper/div[2]/div[1]/app-policy-questions/form/mat-card/mat-card-content/div[2]/mat-radio-group/div[2]/mat-radio-button[@value='N']");
	private By diabeties_hypertension_yes = By.xpath("");
	private By diabeties_hypertension_no = By.xpath("//*[@id=\"mat-radio-21\"]/label/div[1]/div[1]");
	private By cancer_related_issue_yes = By.xpath("");
	private By cancer_related_issue_no = By.xpath("//*[@id=\"mat-radio-24\"]/label/div[1]/div[1]");
	private By click_medical_next_button = By
			.xpath("//button[@class='mat-focus-indicator next-btn mat-button mat-button-base ng-star-inserted']");

	private By click_fg_policy_already = By.xpath(
			"/html/body/app/div/div[2]/app-proposal/mat-horizontal-stepper/div[2]/div[1]/app-policy-questions/form/mat-card/mat-card-content/div[2]/mat-radio-group/div[2]/mat-radio-button/label/div[1]/div[2]");
	private By click_fg_deformity = By.xpath(
			"/html/body/app/div/div[2]/app-proposal/mat-horizontal-stepper/div[2]/div[1]/app-policy-questions/form/mat-card/mat-card-content/div[4]/mat-radio-group/div[2]/mat-radio-button/label/div[1]/div[1]");
	private By click_fg_health_complaints = By.xpath(
			"/html/body/app/div/div[2]/app-proposal/mat-horizontal-stepper/div[2]/div[1]/app-policy-questions/form/mat-card/mat-card-content/div[6]/mat-radio-group/div[2]/mat-radio-button/label/div[1]/div[1]");
	private By click_fg_accident_injury = By.xpath(
			"/html/body/app/div/div[2]/app-proposal/mat-horizontal-stepper/div[2]/div[1]/app-policy-questions/form/mat-card/mat-card-content/div[8]/mat-radio-group/div[2]/mat-radio-button/label/div[1]/div[1]");
	private By click_fg_planned_surgery = By.xpath(
			"/html/body/app/div/div[2]/app-proposal/mat-horizontal-stepper/div[2]/div[1]/app-policy-questions/form/mat-card/mat-card-content/div[10]/mat-radio-group/div[2]/mat-radio-button/label/div[1]/div[1]");

	private By click_mdl_que_no = By.xpath(".//div[text()='No']");
	private By click_mdl_que_yes = By.xpath(".//div[text()='Yes']");

	public void fg_medical_questions() throws InterruptedException {

		// int redbtn=driver.findElements(click_mdl_q).size();
		List<WebElement> radio_no = driver.findElements(click_mdl_que_no);
		// List<WebElement> radio_no=CommMethods.clickElements(driver, click_mdl_que_no,
		// 5);
		List<WebElement> radio_yes = driver.findElements(click_mdl_que_yes);
		WebElement next = driver.findElement(click_medical_next_button);
		// List<WebElement> btnrd=CommMethods.clickElement(driver, click_mdl_q, 5);
		// btnrd.get(0).click();

		// System.out.println("The total no of Radio is: " + btnrd.size());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		radio_no.get(0).click();
		radio_yes.get(1).click();
		radio_no.get(2).click();
		radio_no.get(3).click();
		radio_no.get(4).click();
		radio_no.get(5).click();
		driver.findElement(click_medical_next_button).click();

		/*
		 * for (int i = 0; i <= btnrd.size(); i++) { btnrd =
		 * driver.findElements(click_mdl_q); btnrd.get(i).click();
		 * 
		 * } Thread.sleep(3000); next.click();
		 */

	}

	public void mn_cigna_sw_medical_questions() {
		List<WebElement> radio_no = driver.findElements(click_mdl_que_no);
		List<WebElement> radio_yes = driver.findElements(click_mdl_que_yes);

		// System.out.println("The total no of Radio is: " + btnrd.size());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		radio_no.get(0).click();
		radio_no.get(1).click();
		radio_no.get(2).click();

	}

	public void medical_next_btn() throws InterruptedException {

		driver.findElement(click_medical_next_button).click();

	}

	public void test() {
		System.out.println("Test the function call");
	}

}
