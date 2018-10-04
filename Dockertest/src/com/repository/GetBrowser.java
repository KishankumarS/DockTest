package com.repository;

import java.time.LocalTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetBrowser {
	private Wd command = new Wd();	
	private WebDriver driver = command.getDriver();

	public WebDriver getBrowser(String browser) {

		if("Chrome".equalsIgnoreCase(browser)) {
			System.setProperty("webdriver.chrome.driver", "./External files/chromedriver.exe");
			driver = new ChromeDriver();		
			driver.get("https://kishankumars.github.io/ng5/");			
		}else if("firefox".equalsIgnoreCase(browser)) {
			System.setProperty("webdriver.gecko.driver", "./External files/geckodriver.exe");
			driver = new FirefoxDriver();		
			driver.get("https://kishankumars.github.io/ng5/");			
		}
		return driver;
	}
	
}
