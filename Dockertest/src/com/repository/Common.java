package com.repository;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.doit.Runner1;

public class Common{
	public void waitfor(WebElement element,WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	public void takeScreenshot(WebDriver driver, String filename) {
		try {
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
			FileUtils.copyFile(src, new File("C:\\Users\\h245253\\Music\\WS_0922\\Dockertest\\Screenshots\\"+this.createFolder()+"\\"+filename+"_"+System.currentTimeMillis()+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void drop(WebElement element,String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	public void mouseMove(WebDriver driver, WebElement target) {
		Actions action = new Actions(driver);
		action.moveToElement(target);
	}
	
	
	
	private LocalDate createFolder() {
		LocalDate date = LocalDate.now();  
		return date;
	}
}
