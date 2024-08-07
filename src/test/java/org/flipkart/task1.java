package org.flipkart;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task1 {
	public static void main(String []args) throws InterruptedException {

		  WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			WebElement inputTxtBox = driver.findElement(By.xpath("//*[@class='Pke_EE']"));
			
			if (inputTxtBox.isEnabled()) {
				System.out.println("Search box is enabled");
				
				inputTxtBox.sendKeys("remdi mobiles",Keys.ENTER);
				Thread.sleep(5000);
				
				WebElement frteElemet = driver.findElement(By.xpath("(//*[@class='KzDlHZ'])[1]"));
				frteElemet.click();
				
				Thread.sleep(2000);
				
				String parent = driver.getWindowHandle();
				Set<String> child = driver.getWindowHandles();
				
				for(String x : child) {
					driver.switchTo().window(x);
					
					if (!parent.equals(x)) {
						WebElement AddToCartBtn = driver.findElement(By.xpath("//*[@class='QqFHMw vslbG+ In9uk2']"));
						AddToCartBtn.click();
						
						
					}
				}
				
				
				
	}
	}

}
