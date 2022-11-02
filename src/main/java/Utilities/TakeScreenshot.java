package Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class TakeScreenshot {
	
	public static String capturescreenshot(WebDriver driver)  {
		
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			String path=System.getProperty("user.dir"+"/Screenshot"+System.currentTimeMillis()+".png");
			//FileUtils.copyFile(source, new File("./Screenshots/"+ScreenshotName+".png"));
			File destination=new File(path);
			
			System.out.println("Screenshot Taken:");
			try {
				FileUtils.copyFile(source, destination);
		}
		  catch (Exception e) {
			
			System.out.println("Exception while taking screen shot:"+e.getMessage());
		}
			return path;
		
	}

}
