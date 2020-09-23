package org.pom;

import java.util.List;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageLocators extends LibGlobal {

	public HomePageLocators() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//*[@id='twotabsearchtextbox']")
	private WebElement searchbox;
	
	@FindBy(xpath="//*[@type='submit']")
	private WebElement searchButton;
	
	@FindBy(xpath="//*[@class='a-link-normal a-text-normal']")
	private List<WebElement> allPhone;
	
	@FindBy(xpath="//span[contains(text(),'Apple iPhone 11 (64GB) - Black')]")
	private List<WebElement> find;

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	

	public List<WebElement> getAllPhone() {
		return allPhone;
	}

	public List<WebElement> getFind() {
		return find;
	}

}
