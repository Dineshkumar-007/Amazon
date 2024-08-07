import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excell {
	
	

	public static void main (String []args) throws Throwable {
    	

    
    
    File f = new File ("D:\\class task\\task3.xlsx");
    Workbook wb = new XSSFWorkbook();
    Sheet sheet = wb.createSheet("sheet1");
    
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	
	WebElement inputTxtBox = driver.findElement(By.xpath("//*[@class='Pke_EE']"));
	
	if (inputTxtBox.isEnabled()) {
		System.out.println("Search box is enabled");
		
		inputTxtBox.sendKeys("remdi mobiles",Keys.ENTER);
		Thread.sleep(5000);
		
		List<WebElement> listOfMobiles = driver.findElements(By.xpath("//*[@class=\'KzDlHZ\']"));
		List<WebElement> priceTag = driver.findElements(By.xpath("//*[@class='Nx9bqj _4b5DiR']"));
		String totalMobilesName = ""  ;
		String totalMobilesprice = "" ;
		
		for (int i = 0; i < listOfMobiles.size(); i++) {
			WebElement totalListOfMobiles = listOfMobiles.get(i);
			totalMobilesName = totalListOfMobiles.getText();
			

		for (int j = 0; j < priceTag.size(); j++) {
			WebElement mobilePrice = priceTag.get(j);
			totalMobilesprice = mobilePrice.getText();
		
			
			Row createRow = sheet.createRow(i+1 );
			createRow.createCell(0).setCellValue(totalMobilesName);
			createRow.createCell(1).setCellValue(totalMobilesprice);
			
			System.out.println(totalMobilesName);
			System.out.println(totalMobilesprice);
			System.out.println(totalMobilesName + " " + totalMobilesprice);
		}}
		
		
		

		FileOutputStream fileOutput = new FileOutputStream(f);
		wb.write(fileOutput);
		fileOutput.close();
		}
		
		
		
	}
	}
    



