package Hooker;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import Base.DriverFactory;
import Utilities.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks {
	//public static WebDriver driver;
		private DriverFactory driverfactory;
		public WebDriver driver;
		public Properties prop;
		private ConfigReader configReader; 
		
//		public static WebDriver setup() {
//			return driver=DriverFactory.SelectDriver(driver, "https://retailer.paynearby.in");
//		}
		
		@Before
		public void setChrome() throws IOException {
			configReader=new ConfigReader();
			prop=configReader.init_prop();
			driverfactory=new DriverFactory();
			driverfactory.init_driver("chrome");
			DriverFactory.getDriver().get(prop.getProperty("SiteURL"));
		}
		
		public void setFirefox() {
			driverfactory=new DriverFactory();
			driverfactory.init_driver("firefox");
			DriverFactory.getDriver().get("https://retailer.paynearby.in");
		}
		
		
		public void teardown() {
			DriverFactory.getDriver().close();		
			
		}



}
