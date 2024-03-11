package DifferentElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TextBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		WebElement textBox = driver.findElement(By.name("my-password"));
		WebElement distextBox = driver.findElement(By.name("my-disabled"));

		//       Boolean isTextBoxEnabled=  textBox.isEnabled();
		Boolean isTextBoxEnabled=  distextBox.isEnabled();

		System.out.println(isTextBoxEnabled);


		driver.close();
	}

}
