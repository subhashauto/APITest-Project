package Base;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.etsi.uri.x01903.v13.OCSPRefsType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.events.WebDriverEventListener;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

public static WebDriver driver;
public static WebDriver SelectDriver(WebDriver driver,String AppURL) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\nbt550\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//driver.get("https://retailer.paynearby.in");
	driver.get(AppURL);
	return driver;	
	
}
	

	//public WebDriver driver;
	private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();

	public  WebDriver init_driver(String Browser) {
		if (Browser.equalsIgnoreCase("chrome")) {
			System.out.println("Welcome To The Bancaedge System");
			ChromeOptions options = new ChromeOptions();
			HashMap<String, Integer> contentSettings = new HashMap<String, Integer>();
			HashMap<String, Object> profile = new HashMap<String, Object>();
			HashMap<String, Object> prefs = new HashMap<String, Object>();
			contentSettings.put("geolocation", 1);
			contentSettings.put("notifications", 1);
			profile.put("managed_default_content_settings", contentSettings);
			prefs.put("profile", profile);
			prefs.put("profile.password_manager_enabled", false);
			options.setExperimentalOption("prefs", prefs);
			options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
			/*
			 * Map<String, Object> prefs = new HashMap<String, Object>();
			 * prefs.put("profile.default_content_setting_values.notifications", 1);
			 * ChromeOptions options = new ChromeOptions();
			 * options.setExperimentalOption("prefs", prefs);
			 */
			WebDriverManager.chromedriver().setup();
			
			tlDriver.set(new ChromeDriver(options));
		} else if (Browser.equalsIgnoreCase("firefox")) {
			System.out.println("Firefox is the site");
			FirefoxOptions options = new FirefoxOptions();
			FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference("permissions.default.desktop-notification", 1);
			options.setProfile(profile);
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver(options));
		}	
//		 else if (Browser.equalsIgnoreCase("edge")) {
//			HashMap<String, Object> edgePrefs = new HashMap<String, Object>();
//			edgePrefs.put("profile.default_content_settings.popups", 1);
//			edgePrefs.put("profile.default_content_setting_values.notifications", 1);
//			edgePrefs.put("profile.default_content_setting_values.automatic_downloads", 1);
//			edgePrefs.put("profile.content_settings.pattern_pairs.*,*.multiple-automatic-downloads", 1);
//			EdgeOptions egdeOptions = new EdgeOptions();
//			egdeOptions.setExperimentalOption("prefs", edgePrefs);
//			WebDriverManager.edgedriver().setup();
//			tlDriver.set(new EdgeDriver(egdeOptions));
//		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}

	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}


}
