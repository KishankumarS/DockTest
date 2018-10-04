package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {

	private By addanitem = By.cssSelector(".btn");
	private By inputbox = By.xpath("//input[contains(@name,'item')]");
	private By special = By.linkText("Specia");
	
	
	public WebElement addItemInbox(WebDriver driver) {		 
		return driver.findElement(inputbox);
	}
	public WebElement addItemBtn(WebDriver driver) {		 
		return driver.findElement(addanitem);
	}
	
	public void clickSpecial(WebDriver driver) {		 
		driver.findElement(special).click();
	}
	
}