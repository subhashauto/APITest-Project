package StepDefs;

import Base.DriverFactory;
import Pages.Contact_details_pages;
import io.cucumber.java.en.Then;

public class Contact_details_StepDef {
	Contact_details_pages ct=new Contact_details_pages(DriverFactory.getDriver());
	@Then("Fill the Contact Info details and click on Next button")
	public void Fill_the_Contact_Info_details_and_click_on_Next_button() throws InterruptedException {
		ct.select_mailing_address();
		ct.fill_address_lines();
		ct.contact_dtls_page_nxt_btn();
		
	}

}
