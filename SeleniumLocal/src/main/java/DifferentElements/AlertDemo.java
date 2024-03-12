package DifferentElements;

import java.io.File;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AlertDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/alerts#");
		driver.findElement(By.linkText("prompt happen")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Testt");
		String alerttext = alert.getText();
		 
	 System.out.println(alerttext);
		
	}

}
