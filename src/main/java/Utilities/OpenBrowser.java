package Utilities;

import org.openqa.selenium.WebDriver;


import Base.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class OpenBrowser {
	//public static WebDriver driver;
	private DriverFactory driverfactory;
	public WebDriver driver;
	
//	public static WebDriver setup() {
//		return driver=DriverFactory.SelectDriver(driver, "https://retailer.paynearby.in");
//	}
	
	@Before
	public void setChrome() {
		driverfactory=new DriverFactory();
		driverfactory.init_driver("chrome");
		DriverFactory.getDriver().get("https://retailer.paynearby.in");
	}
	
	public void setFirefox() {
		driverfactory=new DriverFactory();
		driverfactory.init_driver("firefox");
		DriverFactory.getDriver().get("https://retailer.paynearby.in");
	}
	@After
	public void teardown() {
		DriverFactory.getDriver().close();		
		
	}

}
