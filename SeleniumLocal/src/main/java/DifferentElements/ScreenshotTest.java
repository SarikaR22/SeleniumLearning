package DifferentElements;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		//Google Search box
//		WebElement searchboxEle = driver.findElement(By.name("q"));
		
		//google page element screenshot 
		WebElement gmailSS = driver.findElement(By.className("LX3sZb"));
		String timestamp = new SimpleDateFormat("yyyyMMDD_HHmmss").format(new Date());
		
		System.out.println();
		
//		TakesScreenshot ts =(TakesScreenshot)driver;
//		File source= ts.getScreenshotAs(OutputType.FILE);
//		File source= searchboxEle.getScreenshotAs(OutputType.FILE);
		File source = gmailSS.getScreenshotAs(OutputType.FILE);
		String destination = "/Screenshot/"+ "testImage" +timestamp +".png" ;
		try {
			FileUtils.copyFile(source, new File(destination));
			System.out.println("Successfully taken screenshot");
		}

		catch(IOException e) {
			System.out.println("Failed to take screenshot");
		}
		driver.close();
	}
		

}
