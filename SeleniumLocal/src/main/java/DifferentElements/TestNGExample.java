package DifferentElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestNGExample {
	WebDriver driver;
	WebElement checkboxElement;
	@BeforeClass
	public void setup() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	}
	@Test
	public void testCase1() {
		SoftAssert softAssert= new SoftAssert();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
        String title = driver.getTitle();
        String expectedTitle = "Selenium Easy ";
        softAssert.assertEquals(title, expectedTitle);
//        Assert.assertEquals(title, expectedTitle);
        
	}
	@Test
	public void testCase2() {
        checkboxElement = driver.findElement(By.id("isAgeSelected"));
        checkboxElement.click();
//        System.out.println("After select "  +checkboxElement.isSelected());
//        Assert.assertTrue(checkboxElement.isSelected());
        Assert.assertTrue(checkboxElement.isSelected(), "Checkbox is selected after the select");
	}
	@Test
	public void testCase3() {
        checkboxElement.click();
//        System.out.println("After unselect "  +checkboxElement.isSelected());
        Assert.assertTrue((checkboxElement.isSelected()));
        String destination = Screenshot.captureScreenShot(checkboxElement, "CheckboxSS");
        System.out.println(destination);
	}
	@AfterClass
	public void tearDown(){
		driver.close();
		
	
	}
//	public static void main(String[] args) {
//
//		System.out.println("Inside Testng");
//	}

}
