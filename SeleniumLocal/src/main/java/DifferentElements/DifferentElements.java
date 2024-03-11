package DifferentElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DifferentElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		WebElement radiobutton1 = driver.findElement(By.id("my-radio-1"));
		WebElement radiobutton2 = driver.findElement(By.id("my-radio-2"));
		Boolean isSelected = radiobutton1.isSelected();
		System.out.println(isSelected);
		driver.close();
	}

}
