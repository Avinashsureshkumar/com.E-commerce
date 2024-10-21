package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	protected WebDriver driver;

	public BasePage(WebDriver driver) {
		if (driver == null) {
			throw new IllegalArgumentException("Driver cannot be null when initializing page objects.");
		}
		this.driver = driver;
		PageFactory.initElements(driver, this); // Initialize web elements with PageFactory
	}

}
