package com.repository;

import org.openqa.selenium.WebDriver;

public class Wd {

	private WebDriver driver = null;
	
	public WebDriver setDriver(WebDriver driver) {
		return this.driver = driver;
	}
	
	public WebDriver getDriver() {
		return driver;
	}
}
