package com.interview.shoppingcart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	protected WebDriver driver;
	protected WebDriverWait wait;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 30);
	}
	
	public String getBasePageTitle() {
		return driver.getTitle();
		
	}

}
