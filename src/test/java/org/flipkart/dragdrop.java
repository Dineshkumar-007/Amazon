package org.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dragdrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		String url="https://demo.guru99.com/test/drag_drop.html";
		driver.get(url);
		driver.manage().window().maximize();
		
		
		
		
//	 	WebElement From2=driver.findElement(By.xpath("//*[@id='credit1']/a"));	
//	 	WebElement To2=driver.findElement(By.xpath("//*[@id='loan']/li"));							
//	    WebElement From3=driver.findElement(By.xpath("//*[@id='fourth']/a"));						
//	 	WebElement To3=driver.findElement(By.xpath("//*[@id='amt7']/li"));						
//	    WebElement From4=driver.findElement(By.xpath("//*[@id='fourth']/a"));					
	    

//	 	WebElement To4=driver.findElement(By.xpath("//*[@id='amt8']/li"));					
	  
		
	 	Actions A=new Actions(driver);					
	 	WebElement From1=driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));		
	 	WebElement To1=driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[1]"));
	 	

	 	Thread.sleep(4000);
		WebElement drag = driver.findElement(By.xpath("(//a[contains(text(),'5000')])[2]"));
		WebElement drop = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[2]"));
		
//	 	A.dragAndDrop(From2, To2).build().perform();
//	 	A.dragAndDrop(From3, To3).build().perform();		
//	 	A.dragAndDrop(From4, To4).build().perform();		
	 	A.dragAndDrop(drag, drop).build().perform();

	}

}
