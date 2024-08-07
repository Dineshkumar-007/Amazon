package org.flipkart;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hadleWindow {
	public static void main(String []args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
	//	driver.findElement(By.xpath("//div[@class=\"textwrap\"]//following::p[@class=\"main-2\"][1]")).click();
	//Runtime.getRuntime().exec("")
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Redmi",Keys.ENTER);
	driver.findElement(By.xpath("(//div[@class=\"KzDlHZ\"])[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[@class=\"KzDlHZ\"])[2]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[@class=\"KzDlHZ\"])[3]")).click();
	Thread.sleep(3000);

//	String parent= driver.getWindowHandle();
//	System.out.println(parent);
	Set<String>child =driver.getWindowHandles();
//	System.out.println(child);
	List<String>l=new ArrayList<>();
	l.addAll(child);
	
	for(int i=0;i<=l.size();i++) {
			driver.switchTo().window(l.get(2));
			System.out.print("ok");
//			
		}
//	}
//	
	
	}

}
