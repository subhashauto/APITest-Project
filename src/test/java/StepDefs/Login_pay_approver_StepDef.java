package StepDefs;

import java.io.IOException;

import Base.DriverFactory;
import Pages.Login_Pages;
import io.cucumber.java.en.Then;

public class Login_pay_approver_StepDef {
	Login_Pages login=new Login_Pages(DriverFactory.getDriver());
	
	
	@Then("Login with BOM PaymentApprover and approve the payment")
	public void Login_with_BOM_PaymentApprover_and_approve_the_payment() throws IOException, InterruptedException {
		
		login.weblogin_payment_approver();
        Thread.sleep(2000);
	}
          
}
