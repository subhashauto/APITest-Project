import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import testAPI.ChromeDriver;
import testAPI.Webdriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@Test
		public void test() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Subhash\\Automation\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://uat.bancaedge.com/account/login");
			
			
		}

	}

}
