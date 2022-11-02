package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.CommMethods;

public class Policy_buy_pages {

	WebDriver driver;

	public Policy_buy_pages(WebDriver driver) {
		this.driver = driver;
	}

	private By health_fg = By.xpath(
			"/html/body/app/div/div[2]/app-quote-health-hospitalisation/div[1]/div/div[2]/app-display-result-quote/div[1]/div[4]/div[2]/div/button/span");
	private By health_maha_signa = By.xpath(
			"/html/body/app/div/div[2]/app-quote-health-hospitalisation/div[1]/div/div[2]/app-display-result-quote/div[1]/div[8]/div/button/span[text()='Buy Now']");
	// private By
	// health_fg=By.xpath("/html/body/app/div/div[2]/app-quote-health-hospitalisation/div[1]/div/div[2]/app-display-result-quote/div[1]/div[14]/div/button/span");
	private By ans_of_ques_yes = By.xpath(
			"/html/body/div[2]/div[2]/div/mat-dialog-container/app-policy-prompt-modal/div[2]/button[1]/span[text()='Yes']");
	private By ans_of_ques_no = By.xpath("//*[@id=\"mat-dialog-0\"]/app-policy-prompt-modal/div[2]/button[2]/span");
	private By maha_cigna_show_all_button = By.xpath("//button/span[text()=' Show all ']");
	private By ma_cigna_sws_prd = By.xpath("//button/span[text()=' Buy Now ']");

	public void buy_mn_cigna_sw_policy() throws InterruptedException {

		Thread.sleep(2000);
		CommMethods.clickElement(driver, maha_cigna_show_all_button, 5);
		List<WebElement> cigna_btn = driver.findElements(ma_cigna_sws_prd);
		cigna_btn.get(1).click();

	}

	public void buy_fg_policy() {
		CommMethods.clickElement(driver, health_fg, 5);

	}

}
