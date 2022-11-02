package StepDefs;

import java.io.IOException;

import Base.DriverFactory;
import Pages.Home_page_pages;
import Pages.User_Home_Page;
import io.cucumber.java.en.Then;

public class User_home_page_StepDef {
	public User_Home_Page home=new User_Home_Page(DriverFactory.getDriver());
	public Home_page_pages cu=new Home_page_pages(DriverFactory.getDriver());

	
	@Then("On User home page enter {string} and Click on Quick Quote")
	public void On_User_home_page_enter_and_Click_on_Quick_Quote(String CIF) throws IOException, InterruptedException {
			cu.customer_search(CIF);
			Thread.sleep(1000);
			cu.customer_submit();
			Thread.sleep(2000);
			home.clickOn_quickquote();
			Thread.sleep(2000);

}

}