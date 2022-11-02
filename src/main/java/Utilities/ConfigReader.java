package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private Properties prop;
	public Properties init_prop() throws IOException {
		prop=new Properties();
		FileInputStream fis;
		try {
			fis=new FileInputStream("./src/test/resources/Config/configuration.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			
			System.out.println("File Not found" +e.getMessage());
		}
		return prop;
	}

}
