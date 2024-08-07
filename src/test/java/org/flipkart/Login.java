package org.flipkart;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Login {
public static void main(String[] args) throws Throwable {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	String url="https://theautomationzone.blogspot.com/2020/07/basic-dropdown.html";
	driver.get(url);
	driver.manage().window().maximize();
	
	WebElement drop =driver.findElement(By.tagName("select"));
	Select s = new Select (drop);
	s.selectByIndex(0);
	s.selectByIndex(1);
	s.selectByIndex(2);
	s.selectByIndex(3);
	List<WebElement> allselect=s.getAllSelectedOptions();
	for(int i=0;i<allselect.size();i++) {
		String text=allselect.get(i).getText();
		Thread.sleep(2000);
		System.out.println(text);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	s.selectByIndex(23);
//	s.selectByValue("IND");
//	s.selectByVisibleText("India");
//	
//	boolean multiple = s.isMultiple();
//	System.out.println(multiple);
//	List<WebElement> options =s.getOptions();
//	for(int i=options.size();i>=0;i--) {
//		WebElement option = options.get(i);
//		String text = option.getText();
//		System.out.println(text);
//		
//	}
//
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//	driver.findElement(By.xpath("//button[@onclick=\"alertbox()\"]")).click();
//	Alert simple =driver.switchTo().alert();
//	simple.accept();
//	
//	driver.findElement(By.xpath("//a[@data-toggle=\"tab()\"])[2]")).click();
//	driver.findElement(By.xpath("//button[@onclick=\"confirmbox()\"]")).click();
//	Alert simple1 =driver.switchTo().alert();
//	simple1.accept();
//    driver.switchTo().alert().dismiss();
//	
//	driver.findElement(By.xpath("//a[@class=\"analystic\"])[3]")).click();
//	driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]")).click();
//	Alert prompt=driver.switchTo().alert();
//	String text =prompt.getText();
//	System.out.println(text);
//	prompt.accept();
//	
//	
	
	
	
	
	
	
	
//	TakesScreenshot As =(TakesScreenshot)driver;
//	File src = As.getScreenshotAs(OutputType.FILE);
//	File des = new File("C:\\Users\\Sk_sathish\\eclipse-workspace\\Amazon\\target\\screen.png");
//	FileUtils.copyFile(src, des);
//	
	
	
	
	
//	WebElement drag = driver.findElement(By.xpath("//a[text()='5000']"));
//	WebElement drop = driver.findElement(By.xpath("//li[@class='placeholder'])[4]"));
//
//	
//	WebElement From1=driver.findElement(By.xpath("//*[@id='credit2']/a"));		
// 	WebElement To1=driver.findElement(By.xpath("//*[@id='bank']/li"));						
// 	WebElement From2=driver.findElement(By.xpath("//*[@id='credit1']/a"));	
// 	WebElement To2=driver.findElement(By.xpath("//*[@id='loan']/li"));							
//    WebElement From3=driver.findElement(By.xpath("//*[@id='fourth']/a"));						
// 	WebElement To3=driver.findElement(By.xpath("//*[@id='amt7']/li"));						
//    WebElement From4=driver.findElement(By.xpath("//*[@id='fourth']/a"));					
//    
//
// 	WebElement To4=driver.findElement(By.xpath("//*[@id='amt8']/li"));					
//  
//	
// 	Actions A=new Actions(driver);					
//	
// 	A.dragAndDrop(From1, To1).build().perform();
// 	A.dragAndDrop(From2, To2).build().perform();
// 	A.dragAndDrop(From3, To3).build().perform();		
// 	A.dragAndDrop(From4, To4).build().perform();		
// 	A.dragAndDrop(drag, drop).build().perform();
//
////if(driver.findElement(By.xpath("//a[contains(text(),'Perfect')]")).isDisplayed()
//
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
////	WebElement user = driver.findElement(By.id("email"));
////	user.sendKeys("selenium");	
//	//WebElement log= driver.findElement(By.xpath("//span[text()='Login']"));
//	//Actions action = new Actions(driver);
////    action.dragAndDrop(drag, drop).build().perform();
//	
//	//action.moveToElement(log).click().perform();
////	action.doubleClick(user).perform();
////	action.contextClick(user).build().perform();
//
//
//	
//	
//	
//	
//	
//	
//	
////	Robot r = new Robot();
////	r.keyPress(KeyEvent.VK_DOWN);
////	r.keyRelease(KeyEvent.VK_DOWN);
////	r.keyPress(KeyEvent.VK_DOWN);
////	r.keyRelease(KeyEvent.VK_DOWN);
////	r.keyPress(KeyEvent.VK_ENTER);
////	r.keyRelease(KeyEvent.VK_ENTER);
////	r.keyPress(KeyEvent.VK_TAB);
////	r.keyRelease(KeyEvent.VK_TAB);
////	r.keyPress(KeyEvent.VK_CONTROL);
////	r.keyRelease(KeyEvent.VK_V);
////	r.keyRelease(KeyEvent.VK_CONTROL);
////	r.keyRelease(KeyEvent.VK_V);
////	
////	
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	Thread.sleep(2000);
//	//driver.manage().window().minimize();
//	
//	Thread.sleep(2000);
//	WebElement inputBox = driver.findElement(By.id("email"));
//	boolean enabled = inputBox.isEnabled();
//	System.out.println(enabled);
//	inputBox.sendKeys("dinesh");
//	Thread.sleep(2000);
//	inputBox.clear();
//	
//	
//	
//	
//	Thread.sleep(2000);
//	WebElement passWord = driver.findElement(By.name("pass"));
//	passWord.sendKeys("12345678");
//	
//	WebElement loginButton  = driver.findElement(By.xpath("//button[@type='submit']"));
//	loginButton.click();
//
//
//	//driver.navigate().to("https://www.facebook.com/");
}
}
