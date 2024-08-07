package org.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javaScriptExecutor extends Framecart {
	public static void main (String []args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url="https://www.facebook.com/";
		driver.get(url);
		driver.manage().window().maximize();

	WebElement user = driver.findElement(By.id("email"));
	WebElement login = driver.findElement(By.xpath("//button[@value=\"1\"]"));
	WebElement down = driver.findElement(By.xpath("//a[text()='Create ad']"));
	//WebElement down1 = driver.findElement(By.xpath("//a[@'title=\"Visit our Help Centre.\"']"));
	//String attribute =user.getAttribute("name");
	//System.out.println(attribute);
		
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value','selenium')", user,login);
	Object script=js.executeScript(" return arguments[0].getAttribute('value','selenium')", user);
     System.out.println(script);
 	//js.executeScript("arguments[1].click()", user,login);
 	js.executeScript("arguments[0].setAttribute('style','background:green;border:2px solid red')", user,login);
 	js.executeScript("arguments[0].scrollIntoView(true)", down);
 	Thread.sleep(2000);
 	js.executeScript("arguments[0].scrollIntoView(false)", user);

	}
	
}