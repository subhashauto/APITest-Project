package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.CommMethods;

public class Yes_No_RM_pages {
	

	WebDriver driver;
	
	public Yes_No_RM_pages(WebDriver driver) {
		this.driver=driver;
	}
	
	private By ans_of_ques_yes=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-policy-prompt-modal/div[2]/button[1]/span[text()='Yes']");
	private By ans_of_ques_no=By.xpath("//*[@id=\"mat-dialog-0\"]/app-policy-prompt-modal/div[2]/button[2]/span");
	
	
	public void ansofQuestion_Yes() {
		CommMethods.clickElement(driver, ans_of_ques_yes, 5);
	}
	
	public void ansofQuestion_No() {
		CommMethods.clickElement(driver, ans_of_ques_no, 5);
	}

}
