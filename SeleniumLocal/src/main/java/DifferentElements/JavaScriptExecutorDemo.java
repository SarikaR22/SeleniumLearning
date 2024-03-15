package DifferentElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		driver.get("https:www.google.com");
//		js.executeScript("alert('testing')");
		driver.get("https://demo.opencart.com/");
		//Use "arguments[0]" when interacting with webelement
		WebElement macbook = driver.findElement(By.xpath("//a[contains(text(),'MacBook')]"));
		js.executeScript("arguments[0].scrollIntoView();", macbook);
		js.executeScript("arguments[0].click()", macbook);
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");

		
		
//		
//		driver.close();
		
		
		
	}

}
