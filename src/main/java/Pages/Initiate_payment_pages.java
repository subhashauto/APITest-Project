package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Initiate_payment_pages {
	WebDriver driver;
	public Initiate_payment_pages(WebDriver driver) {
		this.driver=driver;
	}
	
	private By action_button=By.xpath("//mat-icon[text()='more_vert']");
	private By initiate_payment=By.xpath("//span[text()='Initiate Payment']");
	private By select_auth_debt_confirm=By.xpath("//div[@class='mat-checkbox-inner-container']");	
	private By auth_debt_submit_btn=By.xpath("//button[text()=' Submit ']");
	private By req_approval_ok_btn=By.xpath("//span[text()=' Ok ']");
	
	public void refresh_policy_vault_page() {
		driver.getCurrentUrl();
		driver.navigate().refresh();
	}
	public void initiate_payment() throws InterruptedException {
		List<WebElement> action_btn=driver.findElements(action_button);
		action_btn.get(0).click();
		Thread.sleep(1000);
		driver.findElement(initiate_payment).click();
	}
	
	public void confirm_auth_sign_debt() throws InterruptedException {
		List<WebElement> select_chkbox=driver.findElements(select_auth_debt_confirm);
        select_chkbox.get(0).click();
        select_chkbox.get(1).click();
		driver.findElement(auth_debt_submit_btn).click();
		Thread.sleep(1000);
		driver.findElement(req_approval_ok_btn).click();
		
	}

}
