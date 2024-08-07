package org.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class project1 {
	
public static void main(String[]args) {
	
	
	WebDriverManager.edgedriver().setup();
	DesiredCapabilities des = new DesiredCapabilities();
	des.setCapability("platform","windows10");
	des.setCapability("version","latest");
	des.setAcceptInsecureCerts(true);
	des.setBrowserName("chrome");
	des.setCapability("Takescreenshot", true);
	EdgeOptions option =new EdgeOptions();
	option.addArguments("start-maximized");
	
	WebDriver driver =new EdgeDriver(option);
	
	driver.get("https://www.google.com");
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
//	EdgeOptions option = new EdgeOptions();
//	option.addArguments("disable-popups");
//	option.addArguments("disable-notifications");
//	option.addArguments("start-maximized");
////	option.addArguments("--headless");
//	WebDriver driver=new EdgeDriver(option);
//	driver.get("https://best.aliexpress.com/?af=34745&dp=f04d3dcadedf4a75b21630e2c0986ed5&cn=102425&aff_fcid=1f76279b15ea4851b1dfb21fe9d8f8be-1722848324186-06890-_pJQpbgG&aff_fsk=_pJQpbgG&aff_platform=api-new-link-generate&sk=_pJQpbgG&aff_trace_key=1f76279b15ea4851b1dfb21fe9d8f8be-1722848324186-06890-_pJQpbgG&terminal_id=f9773261f8ac443aad3b62cb36a9441e");
//    driver.findElement(By.xpath("html/body/div/div[4]/div[1]/div[1]/div[2]/div/div[2]/div[2]"));


	
	
	
	
}
}
