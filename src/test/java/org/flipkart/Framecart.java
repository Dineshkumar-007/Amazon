package org.flipkart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.github.dockerjava.api.model.Frame;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Framecart {
public static void main(String[] args) throws InterruptedException {


	WebDriverManager.edgedriver().setup();

//	WebDriver driver1 = new ChromeDriver();
//	driver.get("https://demo.automationtesting.in/Frames.html");
//	driver.manage().window().maximize();
//	
//	WebElement frame1 = driver.findElement(By.id("singleframe"));
//	driver.switchTo().frame(frame1);
//	driver.findElement(By.xpath("//input[@type='text']")).click();
//	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("dinesh");
//	driver.switchTo().parentFrame();
//	

	
	        WebDriver driver1 = new EdgeDriver();

	   
	        driver1.get("https://demo.automationtesting.in/Frames.html");
	        driver1.manage().window().maximize();

	       WebElement singleFrame = driver1.findElement(By.id("singleframe"));
	        driver1.switchTo().frame(singleFrame);

	        
	        WebElement textField = driver1.findElement(By.xpath("//input[@type='text']"));
	        textField.click(); 
	        textField.sendKeys("Dinesh"); 
	        Thread.sleep(3000);

	        driver1.switchTo().defaultContent();

	        WebElement frame2 = driver1.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
	        frame2.click();

	        Thread.sleep(3000);

	        WebElement newFrame = driver1.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
	        driver1.switchTo().frame(newFrame);
	        Thread.sleep(3000);

	        WebElement innerFrame = driver1.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\" and @style=\"float: left;height: 250px;width: 400px\"]"));
	        driver1.switchTo().frame(innerFrame);
	        Thread.sleep(3000);

	        WebElement innerTextField = driver1.findElement(By.xpath("//input[@type=\"text\"]"));
	        innerTextField.sendKeys("enter the"
	        		+ " frame");
	        List<WebElement>frames=driver1.findElements(By.tagName("iframe"));
	        System.out.println(frames.size());




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	driver.findElement(By.xpath("////img[@src=\"Jmeter720.png\"]")).click();
//	WebElement frames=driver.findElement(By.tagName("iframe"));
//	System.out.println(frames.size());
//	
	
	
}
}
