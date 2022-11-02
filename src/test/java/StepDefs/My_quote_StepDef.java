package StepDefs;

import org.openqa.selenium.WebElement;

import Base.DriverFactory;
import Pages.Health_quote_gen_pages;
import Pages.My_Quote_pages;
import Pages.Policy_buy_pages;
import io.cucumber.java.en.Then;

public class My_quote_StepDef {
	
	public Health_quote_gen_pages pr=new Health_quote_gen_pages(DriverFactory.getDriver());
	
	
	@Then("Enter mandatory details and generate the quote")
	public void Enter_mandatory_details_and_generate_the_quote() throws Exception {
		/*Thread.sleep(2000);		
		pr.select_ind_pol_type();
		Thread.sleep(2000);
		pr.select_pol_cover_new();	
		Thread.sleep(4000);
		pr.select_pol_ampunt();
		pr.select_gender_female();
		Thread.sleep(1000);
		pr.select_cust_smoker_no();	
		Thread.sleep(1000);
		pr.select_cust_dogh_no();
		Thread.sleep(1000);
		pr.generate_quote();	*/	
		pr.health_quote_form();

}
}
