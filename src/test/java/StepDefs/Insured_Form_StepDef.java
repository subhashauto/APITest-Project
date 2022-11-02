package StepDefs;

import Base.DriverFactory;
import Pages.Insured_Form_pages;
import io.cucumber.java.en.Then;

public class Insured_Form_StepDef {
	public Insured_Form_pages is=new Insured_Form_pages(DriverFactory.getDriver());
	@Then("Fill the Insured details and click on Next button")
	public void Fill_the_Insured_details_and_click_on_Next_button() throws InterruptedException {
		is.select_title();
		is.select_marital_status();
		is.select_occupation();
		is.insured_next_button();
		
	}

}
