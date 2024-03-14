package DifferentElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
//		driver.switchTo().frame("mce_0_ifr");
		driver.switchTo().frame(0);
		WebElement textInput = driver.findElement(By.id("tinymce"));
		textInput.clear();
		textInput.sendKeys("Input text into Iframe");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Elemental Selenium")).click();
		
		
	}

}
