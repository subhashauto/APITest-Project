package StepDefs;

import Base.DriverFactory;
import Pages.Proposer_basic_info_pages;
import io.cucumber.java.en.Then;

public class Proposer_basic_info_StepDef {
	Proposer_basic_info_pages prp=new Proposer_basic_info_pages(DriverFactory.getDriver());
	
	@Then("Fill the Proposer details and click on Next button")
	public void Fill_the_Proposer_details_and_click_on_Next_button() throws InterruptedException {
		prp.proposer_pan();
		prp.nominee_detaisl();
		prp.policy_communication_details();
		prp.proposer_next_btn();
		
	}

}
