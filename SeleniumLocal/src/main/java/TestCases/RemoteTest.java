package TestCases;

import java.net.MalformedURLException;
import java.net.URI;
import java.security.DrbgParameters.Capability;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import bsh.Capabilities;

public class RemoteTest {
	ChromeOptions options = new ChromeOptions();
	@Test
	public void remoteTest() throws MalformedURLException{
//		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setCapability(CapabilityType.BROWSER_NAME, "chrome"); 	
//		cap.setCapability(CapabilityType.BROWSER_VERSION,"121");
//		cap.setCapability(ChromeOptions.CAPABILITY, options);
		options.addArguments("--start-maximized");
		options.setBrowserVersion("120");
		WebDriver driver;
	
			driver= new RemoteWebDriver(URI.create("http://172.31.1.56:4444").toURL(),options);
		driver.get("https://www.google.com");
	}
	
	
}
