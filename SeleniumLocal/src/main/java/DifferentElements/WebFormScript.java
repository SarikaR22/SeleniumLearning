package DifferentElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebFormScript {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver ;
		driver= new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		WebElement textInput = driver.findElement(By.id("my-text-id"));
		WebElement password = driver.findElement(By.name("my-password"));
		WebElement textArea = driver.findElement(By.name("my-textarea"));
		WebElement dropdown = driver.findElement(By.name("my-select"));
		WebElement textdropdown = driver.findElement(By.name("my-datalist"));
		WebElement valuetochoose = driver.findElement(By.xpath("//*[@id='my-options']/option[2]"));
		Select option = new Select(dropdown);
		textInput.sendKeys("User1");
		password.sendKeys("User1");
		textArea.sendKeys("Test Automation");
		option.selectByIndex(2);
//		WebDriverWait wait = new WebDriverWait(driver,10); 
//
//		Actions action = new Actions(driver);
//		Actions showList= action.clickAndHold(textdropdown);
//	    WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id("buttonId")));
//
//		.moveToElement(valuetochoose).click().perform();
//		textdropdown.click();
//		List<WebElement> valueList = driver.findElements(By.xpath("//*[@id='my-options']/option"));
		/*
		 * for (WebElement value : valueList) { String dropdownValue =
		 * value.getAttribute("value"); if (dropdownValue.equals("New York")) {
		 * value.click(); break; } System.out.println("Dropdown values are  " +
		 * value.getAttribute("value")); }
		 */
	}

}
