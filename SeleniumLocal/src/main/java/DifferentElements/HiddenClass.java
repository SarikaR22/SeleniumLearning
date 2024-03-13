package DifferentElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("iPhone");
		Thread.sleep(7000);
		List<WebElement> searchList = driver.findElements(By.className("_2SmNnR"));
 		for(WebElement element:searchList) {
		if(element.getText().contains("iphone 13")){
			  element.click();
				break;
			}
//			System.out.println(element.getText());

		}

	}
}

