package StepDefs;

import Base.DriverFactory;
import Pages.Initiate_payment_pages;
import Pages.Login_Pages;
import io.cucumber.java.en.Then;

public class Initiate_Payment_StepDef {
	Initiate_payment_pages polstatus=new Initiate_payment_pages(DriverFactory.getDriver());
	Login_Pages lgout=new Login_Pages(DriverFactory.getDriver());
	@Then("Check the policy status and initiate the payment")
	public void Check_the_policy_status_and_initiate_the_payment() throws InterruptedException {
		polstatus.refresh_policy_vault_page();
		Thread.sleep(16000);
		polstatus.initiate_payment();
		Thread.sleep(7000);
		polstatus.confirm_auth_sign_debt();
		Thread.sleep(5000);
		lgout.Weblogout();
		
	}

}
