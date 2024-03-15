package DifferentElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Actions action = new Actions(driver);
	driver.get("https://jqueryui.com/tooltip/");
    driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
    driver.findElement(By.id("age")).sendKeys(Keys.DOWN);
    action.moveToElement(driver.findElement(By.id("age"))).perform();
    String tooltipText = driver.findElement(By.className("ui-tooltip-content")).getText();
	System.out.println("Tooltip text " +tooltipText);
	}

}
