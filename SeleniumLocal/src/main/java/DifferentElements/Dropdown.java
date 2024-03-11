package DifferentElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		WebElement dropdown = driver.findElement(By.name("my-select"));
        Select option = new Select(dropdown);
        option.selectByIndex(2);
        System.out.println(option.getFirstSelectedOption().getText());
//        List<WebElement> selected= option.getAllSelectedOptions();
//      for(WebElement el:selected) {
//    	  System.out.println(el.getText());
//      }
        
        WebElement disabledElement=   driver.findElement(By.name("my-disabled"));
       Boolean isEnabled=  disabledElement.isEnabled();
       System.out.println(isEnabled);
        
	
	
	}

}
