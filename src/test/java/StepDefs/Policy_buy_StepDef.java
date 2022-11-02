package StepDefs;

import org.openqa.selenium.WebElement;

import Base.DriverFactory;
import Pages.Policy_buy_pages;
import io.cucumber.java.en.Then;

public class Policy_buy_StepDef {
	public Policy_buy_pages pb=new Policy_buy_pages(DriverFactory.getDriver());
	@Then("Click on Buy Now")
	public void Click_on_Buy_Now() throws Exception {
		Thread.sleep(1000);
		pb.buy_mn_cigna_sw_policy();
		Thread.sleep(1000);
		
	}
	
}
