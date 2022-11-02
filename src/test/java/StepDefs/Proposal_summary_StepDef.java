package StepDefs;

import Base.DriverFactory;
import Pages.Proposal_summary_pages;
import io.cucumber.java.en.Then;

public class Proposal_summary_StepDef {
	Proposal_summary_pages sm=new Proposal_summary_pages(DriverFactory.getDriver());
	@Then("View proposal summary and click on Submit button")
	public void View_proposal_summary_and_click_on_Submit_button() throws InterruptedException {
		sm.proposal_summ_submit();
		Thread.sleep(2000);
		sm.cust_revw_pay_confirm_Ok();
		
	}
	

}
