package StepDefs;

import Base.DriverFactory;
import Pages.Policy_buy_pages;
import Pages.Yes_No_RM_pages;
import io.cucumber.java.en.Then;

public class YesNo_StepDef {
	public Yes_No_RM_pages yn=new Yes_No_RM_pages(DriverFactory.getDriver());
	@Then("Click on Yes button to get policy immediately")
	public void Click_on_Yes_button_to_get_policy_immediately() throws Exception {			
		yn.ansofQuestion_Yes();	
		Thread.sleep(4000);
	}

}
