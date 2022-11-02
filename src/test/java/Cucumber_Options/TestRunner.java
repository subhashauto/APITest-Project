package Cucumber_Options;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Utilities.ConfigReader;
import Utilities.OpenBrowser;
import Utilities.TakeScreenshot;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Subhash\\Automation\\Auto_LD\\src\\test\\resources\\Features",glue={"StepDefs","Hooker"},plugin= {"html:Reports/cucumber-html-report"})
public class TestRunner {
	WebDriver driver;
	ExtentTest logger;
	ExtentReports extent;
	@BeforeClass
	public void writeTestDataFile() throws IOException {
		ConfigReader cr=new ConfigReader();
		Properties config=cr.init_prop();
		System.out.println("Starting the Super Suit");
		System.out.println("Second Line");
		String appenv;
		String siteURL;
		String browser;
		String country;
		
		appenv=System.getProperty("APPENV");
		browser=System.getProperty("BROWSER");
		siteURL=System.getProperty("SITEURL");
		country=System.getProperty("COUNTRY");
		System.out.println("The appenv is "+ appenv);
		System.out.println("The Browser is " + browser);
		System.out.println("The SiteURL is " + siteURL);
		System.out.println("The Country is " + country);
		if(appenv==null || browser==null || siteURL==null || country==null) {
		appenv=config.getProperty("URL");
		browser=config.getProperty("Browser");
		siteURL=config.getProperty("SiteURL");
		country=config.getProperty("Country");
		
		}
	}

	@BeforeMethod
	public void reportsetup() {
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/TestExecutionReports.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("Test");
	}
	@AfterMethod
	public void teardown(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String temp=TakeScreenshot.capturescreenshot(driver);
			logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		}
		extent.flush();
	}
	

	
}
