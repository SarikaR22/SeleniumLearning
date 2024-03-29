package DifferentElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RedBusTes {

	
	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		driver.get("https://www.redbus.in");
		WebElement source = driver.findElement(By.id("src"));
		WebElement destination   = driver.findElement(By.id("dest"));
		source.sendKeys("Chenn");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		List<WebElement> sourceList = driver.findElements(By.xpath("//*[contains(@class,'sc-iwsKbI')]/div/text[@class='placeHolderMainText']"));
		for(WebElement pickupPoint:sourceList) {
			System.out.println("List of pick up points from Chennai are " +pickupPoint.getText());
		    if(pickupPoint.getText().equalsIgnoreCase("Guindy")){
		    	action.moveToElement(pickupPoint).click().perform();
		    	System.out.println("Source is selected");
		    	break;
		    }
			
		}
		
		destination.sendKeys("Coim");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		List<WebElement> destinationList = driver.findElements(By.xpath("//*[contains(@class,'sc-iwsKbI')]/div/text[@class='placeHolderMainText']"));
		for(WebElement dropPoint:destinationList) {
			System.out.println("List of drop points To Coimbatore are " +dropPoint.getText());
		    if(dropPoint.getText().equalsIgnoreCase("Lakshmi Mills")){
		    	action.moveToElement(dropPoint).click().perform();
		    	System.out.println("Destination is selected");
		    	break;
		    }
			
		}
		
		WebElement dateBox = driver.findElement(By.xpath("//*[contains(@class,'sc-kAzzGY')]"));
       WebElement dateToSelect = driver.findElement(By.xpath("//*[contains(@class,'DayTiles__CalendarDaysBlock')]/span[contains(text(),'18')]"));
       WebElement searchButton = driver.findElement(By.id("search_button"));
       dateToSelect.click();
       searchButton.click();
       List<WebElement> busList = driver.findElements(By.xpath("//*[contains(@class,'travels')]"));
       for(WebElement busName:busList) {
    	   System.out.println("Bus Names are "+busName.getText());
       }
//		String expectedMonth = "Apr 2024";
//		WebElement monthpicker = driver.findElement(By.xpath("//*[contains(@class,'DayNavigator__IconBlock')][2]"));
//		String currentMonth = monthpicker.getText();
//    	WebElement dateToSelect = driver.findElement(By.xpath("//*[contains(@class,'DayTiles__CalendarDaysBlock')]/span[contains(text(),'18')]"));
//		System.out.println(currentMonth);
//	    WebElement nextButton = driver.findElement(By.xpath("//*[contains(@class,'DayNavigator__IconBlock')][3]"));
//	    if(!currentMonth.equalsIgnoreCase(expectedMonth)){
//	    	action.moveToElement(nextButton).click().perform();
//   	    	String newMonth = monthpicker.getText();
//	    	System.out.println("New month shown " +newMonth);
//	    	}
//		WebElement monthToSelect = driver.findElement(By.xpath("//*[contains(@class,'DayNavigator__IconBlock')][2]"));
//		String currentMonthToSelect = monthToSelect.getText();
//
//		WebElement dateToSelect = driver.findElement(By.xpath("//*[contains(@class,'DayTiles__CalendarDaysBlock')]/span[contains(text(),'18')]"));
//
//	  	  if(currentMonthToSelect.equalsIgnoreCase(expectedMonth)){
//	           System.out.println("We are in the correct month and year");
//	    	    dateToSelect.click();
//
//       }
//	    
//	    	}

	    }
	    
	    	
}
	
		    

