package org.flipkart;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autoit {
	public static void main (String []args) throws InterruptedException, IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=EAIaIQobChMI2Iqu87CPhwMVgs08Ah0tMQ3MEAAYASAAEgI1qvD_BwE&gclsrc=aw.ds");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//h2[contains(text(),'m experienced')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
	Thread.sleep(2000);

     Runtime.getRuntime().exec("E:\\Aui.exe");
	}
}
