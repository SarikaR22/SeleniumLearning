package DifferentElements;

import java.io.File;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FileUpload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.get("https://the-internet.herokuapp.com/upload");
		    File uploadFile = new File("C:\\Users\\Administrator\\Downloads\\Picture.png");

		    WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
		    fileInput.sendKeys(uploadFile.getAbsolutePath());
		    driver.findElement(By.id("file-submit")).click();

	    WebElement fileName = driver.findElement(By.id("uploaded-files"));
	    System.out.println("Uploaded File name is "  +fileName.getText());
		    
	}

}
