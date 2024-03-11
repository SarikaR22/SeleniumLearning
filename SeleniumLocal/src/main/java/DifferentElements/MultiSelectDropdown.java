package DifferentElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		WebElement dropdown = driver.findElement(By.id("cars"));
        Select option = new Select(dropdown);
        option.selectByVisibleText("Volvo");
        option.selectByVisibleText("Audi");
//        System.out.println(option.getFirstSelectedOption().getText());
        List<WebElement> selected= option.getAllSelectedOptions();
        
      for(WebElement el:selected) {
    	  System.out.println(el.getText());
      }
      option.deselectAll();
      

      
//        WebElement disabledElement=   driver.findElement(By.name("my-disabled"));
//       Boolean isEnabled=  disabledElement.isEnabled();
//       System.out.println(isEnabled);
//        
//	
	
	}

}
