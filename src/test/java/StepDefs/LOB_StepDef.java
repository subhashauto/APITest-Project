package StepDefs;

import Base.DriverFactory;
import Pages.Health_quote_gen_pages;
import Pages.My_Quote_pages;
import io.cucumber.java.en.Then;

public class LOB_StepDef {
	public My_Quote_pages prod=new My_Quote_pages(DriverFactory.getDriver());	
	@Then("Select Health Insurance product")
	public void Select_Health_Insurance_product() throws Exception {
		prod.Open_LOB_Health();
	}

}
