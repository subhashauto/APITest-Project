package StepDefs;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.DriverFactory;
import Pages.Home_page_pages;
import Pages.Health_quote_gen_pages;
import Pages.Login_Pages;
import Pages.My_Quote_pages;
import Pages.User_Home_Page;
import Utilities.OpenBrowser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login_StepDef {
	// public Login_Pages lg=new Login_Pages(OpenBrowser.setup());
	public Login_Pages lg = new Login_Pages(DriverFactory.getDriver());

	@Given("Login with {string} and {string}")
	public void Login_with_and(String uname, String pass) throws IOException, InterruptedException {
		// Login_Pages lg=new Login_Pages(driver);
		lg.webLogin(uname, pass);

	}

}
