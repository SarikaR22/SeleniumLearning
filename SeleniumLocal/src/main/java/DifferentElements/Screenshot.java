package DifferentElements;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Screenshot {

	public static String captureScreenShot(WebDriver driver, String screenShotName) {
		
		String timestamp = new SimpleDateFormat("yyyyMMDD_HHmmss").format(new Date());
		TakesScreenshot ts =(TakesScreenshot)driver;
     	File source= ts.getScreenshotAs(OutputType.FILE);
		String destination = "/Screenshot/"+ screenShotName +timestamp +".png" ;
		try {
			FileUtils.copyFile(source, new File(destination));
			System.out.println("Successfully taken screenshot");
		}

		catch(IOException e) {
			System.out.println("Failed to take screenshot");
		}
			
		return destination;
		
	}
	
   public static String captureScreenShot(WebElement element, String screenShotName) {
		
		String timestamp = new SimpleDateFormat("yyyyMMDD_HHmmss").format(new Date());
    	File source= element.getScreenshotAs(OutputType.FILE);
		String destination = "/Screenshot/"+ screenShotName +timestamp +".png" ;
		try {
			FileUtils.copyFile(source, new File(destination));
			System.out.println("Successfully taken screenshot");
		}

		catch(IOException e) {
			System.out.println("Failed to take screenshot");
		}
			
		return destination;
		
	}
}
