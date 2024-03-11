package DifferentElements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElements{
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	   driver.get("http://www.google.com");
	   try {
//	        driver.get("http://www.google.com");
//	        driver.findElement(By.cssSelector("[name='q']")).sendKeys("webElement");

	        // Get attribute of current active element
//	        String attr = driver.switchTo().activeElement().getAttribute("title");
//	        System.out.println(attr);
	        
           driver.switchTo().activeElement().sendKeys("Testing");
           driver.switchTo().activeElement().sendKeys(Keys.ENTER);
         
	      }
	   
	   
	   
	   
	   finally {
//	        driver.quit();
	      }
	    
	
	}
}



