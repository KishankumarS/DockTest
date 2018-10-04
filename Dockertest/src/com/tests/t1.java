package com.tests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class t1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./External files/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.sha1-online.com/");
		ArrayList<String> list = new ArrayList<>();
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'Vivek##07'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= '123456aA'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'nishu1A'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= '12345 aA'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= '12345aA'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= '1234AA'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= '8IVTlAih'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'Nishi123$'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'Picklu!2'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= '0ZRCuQ79'");
		
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= '5IMzThEL'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= '123456'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= '7tP6iomQ'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'qWrvG7EQ'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'Am0fiG6O'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= '0sqzleiX'");
		
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= '9OaQWy6n'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'i3oQJWEB'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'Scantec123'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'nMW8CS0E'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'MohitMohal123'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'Raesystems30.'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'ct96Kli0'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'vSabr8zn'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'gSqJafyX'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'kpURLtNb'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'RpbgjGI6'");

		
		
		
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'i5WDATUc'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'Iju79nPg'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'F1yvgD3r'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= '5sJRXlIy'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'H4MmiUYI'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'oVxMSk86'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'MDJWjFCe'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'lMvaAEL0'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'RXKSI89m'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'ivxyelJR'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'aIbv5qHu'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'CJWbuNoO'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'm30RlSrF'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'Vbdh9PnF'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= '8PKFdEwU'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'wtYCkBbn'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'hB8ObFES'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'Vxmw6MzX'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'biMwAHm2'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'LkmCzvjf'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'SQG42l0Z'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'Yz2T9Z3v'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= '9McXKmlk'");
		
		
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'UVDT9frd'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'E1wCfDeN'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'qWERTY12#'");
		list.add("UPDATE `users` SET `Password`='624f1c47f95b904ef6d95a218cffff6c813b4f77' WHERE `Password`= 'Qwerty1234'");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		for(String a:list) {
			
		String ss = a.substring(92, a.length()-1).replace(" ", "");
		
		
				 WebElement email = driver.findElement(By.name("textToHash"));
				 email.clear();
				 email.sendKeys(ss);	
				
				email.submit();
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String result = driver.findElement(By.id("result-sha1")).getText();
				System.out.println(a.replace("624f1c47f95b904ef6d95a218cffff6c813b4f77", result)+";");
			}
		
		driver.close();
	}
			
	}

