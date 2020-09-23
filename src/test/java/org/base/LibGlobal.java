package org.base;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LibGlobal {
	public static WebDriver driver;

	public static void chromeDriverLaunch() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void fireFoxDriver() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	public static void ieDriver() {
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}

	public static boolean isElemnetVisible(List<WebElement> listElement) {	
		boolean isFound = false;
		if(listElement.size()!=0) {
			isFound = true;
		}
		return false;

	}
	
	public void tearBrowser() {
		driver.close();
		
	}
	
	
	
	
}
