package org.openqa.selenium.firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriver {
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\shilpip\\Desktop\\New folder (2)\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	 driver.get("http://www.toolsqa.com");
	 
	 Thread.sleep(5000);
	 driver.quit();
	 
}
