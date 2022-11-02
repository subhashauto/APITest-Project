package StepDefs;

import Base.DriverFactory;
import Pages.Customer_consent_email_pages;
import io.cucumber.java.en.Then;

public class Customer_consent_email_StepDef {
	Customer_consent_email_pages custcon=new Customer_consent_email_pages(DriverFactory.getDriver());
	@Then("Give the customer consent")
	public void Give_the_customer_consent() throws Exception {
		custcon.open_new_window();
		custcon.gmail_login();
		custcon.select_appln_number();
		custcon.cust_consent_summary_page();
		custcon.enter_consent_otp();
		
		
	}

}
