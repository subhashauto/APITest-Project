package StepDefs;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.DriverFactory;
import Pages.Home_page_pages;
import Pages.Login_Pages;
import Utilities.OpenBrowser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Home_page_StepDef {
	// public Login_Pages lg=new Login_Pages(OpenBrowser.setup());
	public Login_Pages lg = new Login_Pages(DriverFactory.getDriver());
	public Home_page_pages cu = new Home_page_pages(DriverFactory.getDriver());

	public void searchcust() throws IOException {
		cu.customer_search("10002152447");
	}

//
//	@Given("Login with {string} and {string}")
//	public void Login_with_and(String uname,String pass) throws IOException {
//			//Login_Pages lg=new Login_Pages(driver);
//		    lg.webLogin(uname, pass);
//		}
//	
//		@Then("Select Customer screen should displayed on Home page")
//		public void Select_Customer_screen_should_displayed_on_Home page() {
//		   
//		}

}
