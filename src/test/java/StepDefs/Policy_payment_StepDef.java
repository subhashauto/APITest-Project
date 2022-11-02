package StepDefs;

import Base.DriverFactory;
import Pages.Policy_payment_pages;
import io.cucumber.java.en.Then;

public class Policy_payment_StepDef {
	Policy_payment_pages pymnt=new Policy_payment_pages(DriverFactory.getDriver());
	@Then("Make the payment")
	public void Make_the_payment() {
		pymnt.select_payment_method();
		pymnt.close_payment_window();
		pymnt.policy_vault_window();
		
	}

}
