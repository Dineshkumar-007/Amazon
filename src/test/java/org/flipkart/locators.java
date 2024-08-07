package org.flipkart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		String url="https://www.facebook.com/";
		driver.get(url);
		driver.manage().window().maximize();
	
		WebElement user  =	driver.findElement(By.id("email"));
		if(user.isDisplayed()){
		user.sendKeys("seleneium")	;
		}
		WebElement login = driver.findElement(By.xpath("//button['@name=\"login\"']"));
		login.click();
		
//		List<WebElement> names = driver.findElements(By.tagName("a"));
//		for(int i=0;i<names.size();i++) {
//			WebElement webElement = names.get(i);
//			WebElement name = names.get(i);
//			String text = name.getText();
//			System.out.println(text);
//		}
//		WebElement password  =	driver.findElement(By.name("pass"));
//		password.sendKeys("1234567")	;
//		Thread.sleep(2000);
//		WebElement login  =	driver.findElement(By.linkText("Log in"));
//		login.click()	;
//		
//		WebElement login  =	driver.findElement(By.partialLinkText("Log"));
////		if(login.isDisplayed()){
//		if(login.isEnabled()) {
//			String text =login.getText();
//			login.click()	;
//			System.out.println("button is enable"+text);
//		}
		
		}
	}
	
//}
