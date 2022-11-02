package StepDefs;

import Base.DriverFactory;
import Pages.Policy_buy_pages;
import Pages.Proposal_Form_Medical_pages;
import io.cucumber.java.en.Then;

public class Proposal_form_Medical_StepDef {
	public Proposal_Form_Medical_pages md = new Proposal_Form_Medical_pages(DriverFactory.getDriver());

	@Then("On Proposal form fill the Medical details and click on Next button")
	public void On_Proposal_form_fill_the_Medical_details_and_click_on_Next_button() throws Exception {

		System.out.println(" Fill the Medical questions for Health Insurance");
		//md.fg_medical_questions();
		md.mn_cigna_sw_medical_questions();
		md.medical_next_btn();

	}

	
}