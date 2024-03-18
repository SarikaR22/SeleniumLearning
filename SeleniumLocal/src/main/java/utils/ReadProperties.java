package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public Properties readProperties() throws IOException {
		File src = new File("./configuration.properties");
		FileInputStream fis = new FileInputStream(src);
		Properties prop = new Properties(); 
		prop.load(fis);
		return prop; 

	}

}
