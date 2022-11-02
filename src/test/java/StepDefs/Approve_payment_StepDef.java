package StepDefs;

import Base.DriverFactory;
import Pages.Approve_payment_pages;
import Pages.Home_page_pages;
import Pages.Login_Pages;
import io.cucumber.java.en.Then;

public class Approve_payment_StepDef {
	Approve_payment_pages aprpymnt = new Approve_payment_pages(DriverFactory.getDriver());
	Home_page_pages homepe = new Home_page_pages(DriverFactory.getDriver());

	@Then("Approve the payment and check the policy status")
	public void Approve_the_payment_and_check_the_policy_status() throws InterruptedException {

		homepe.select_menu_Myspace();
		Thread.sleep(2000);
		homepe.select_submenu_Paymentrequest();
		Thread.sleep(1000);
		aprpymnt.approve_payment_appln();
		Thread.sleep(1000);
		aprpymnt.confirm_debit_auth();
		Thread.sleep(10000);
		aprpymnt.get_app_no();
		Thread.sleep(4000);
		homepe.select_menu_Policyvault();
		Thread.sleep(40000);
		aprpymnt.search_app_no();
		
		

	}

}
