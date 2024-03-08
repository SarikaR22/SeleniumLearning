package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class TestProgram{
	public static void main(String[] args){

		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\Administrator\\Downloads\\SampleHTML.html");
		WebElement firstName = driver.findElement(By.id("fname"));

		//		firstName.clear();
		//		firstName.sendKeys("Sarika");
		//		String name = firstName.getAttribute("value");
		//		System.out.println(name);


//		By maleRadioButton = RelativeLocator.with(By.tagName("input")).toLeftOf(By.xpath("//input[@value='f']"));
//		By maleRadioButton = RelativeLocator.with(By.tagName("input")).above(By.xpath("//input[@id='fname']")).toLeftOf(By.xpath("//input[@value='f']"));
//		driver.findElement(maleRadioButton).click();
		
    String newsText= driver.findElement(By.cssSelector("input[name^='news']")).getText();
		System.out.println(newsText);
		
		//		driver.close();
	}
}