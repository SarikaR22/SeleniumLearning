package DifferentElements;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesTest {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stqatools.com/demo/Windows.php");
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window Name "  +parentWindow);
		WebElement newTabButton = driver.findElement(By.xpath("//button[contains(text(),'new Tab')]"));
		newTabButton.click();
		System.out.println("Page Title "  +driver.getTitle());
		Set<String> totalTabs = driver.getWindowHandles();
		
		System.out.println("total tabs opened  "  +totalTabs.size());
		for (String childWindow:totalTabs) {
			System.out.println("total windows opened  " +childWindow);
			if(!childWindow.equalsIgnoreCase(parentWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println("Switched to Child window " + driver.getTitle() );
				driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/a")).click();
			
			}
		}
	driver.close();
	driver.switchTo().window(parentWindow);
	System.out.println("Parent page title" +driver.getTitle());
		

	}

}
