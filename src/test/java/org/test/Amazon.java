package org.test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.pom.HomePageLocators;

public class Amazon extends LibGlobal {

	public static void main(String[] args) throws InterruptedException {
		chromeDriverLaunch();
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		HomePageLocators loc = new HomePageLocators();
		WebElement searchbox = loc.getSearchbox();
		searchbox.sendKeys("iphone");
		loc.getSearchButton().click();

		Thread.sleep(3000);

		List<WebElement> allPhone = loc.getAllPhone();
		for (int i = 0; i < 3; i++) {
			System.out.println(allPhone.get(i).getText());
			String title = driver.getTitle();
			System.out.println(title);
			allPhone.get(i).click();
		}
		
		System.out.println("----------------------------------------------------");
		
		Set<String> allWindow = driver.getWindowHandles();
		
		for (String s : allWindow) {
			List<WebElement> findAll = loc.getFind();
			if (isElemnetVisible(findAll)) {
				System.out.println(driver.getTitle());
			}
		}
		
		
		

	}

}
