package org.flipkart;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class task2 {
	
	public static void main(String []args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Redmi",Keys.ENTER);
//	driver.findElement(By.xpath("(//div[@class=\"KzDlHZ\"])[1]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("(//div[@class=\"KzDlHZ\"])[2]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("(//div[@class=\"KzDlHZ\"])[3]")).click();
//	Thread.sleep(3000);
     driver.findElement(By.xpath("//div[@class=\"KzDlHZ\"]"));
     
	Set<String>child =driver.getWindowHandles();

	List<String>l=new ArrayList<>();
	l.addAll(child);
	
	for(int i=0;i<=l.size();i++) {
			driver.switchTo().window(l.get(2));
			System.out.print("ok");
		
		}
	
	
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
//
//	    public static void main(String[] args) {
//	        // Set up WebDriver
//	        WebDriver driver = new ChromeDriver();
//	        driver.get("https://example.com/mobiles"); // Replace with your URL
//
//	        // Locate the elements containing mobile names (adjust locator as per your HTML structure)
//	        List<WebElement> mobileElements = driver.findElements(By.cssSelector("ul.mobile-list li"));
//
//	        // Create a list to store mobile names
//	        List<String> mobileNames = new ArrayList<>();
//
//	        // Extract mobile names
//	        for (WebElement element : mobileElements) {
//	            mobileNames.add(element.getText());
//	        }
//
//	        // Write data to Excel using Apache POI
//	        writeToExcel(mobileNames);
//
//	        // Close WebDriver
//	        driver.quit();
//	    }
//
//	    private static void writeToExcel(List<String> data) {
//	        String excelFilePath = "MobileList.xlsx"; // Output Excel file name
//
//	        try (Workbook workbook = new XSSFWorkbook();
//	             FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {
//
//	            Sheet sheet = workbook.createSheet("Mobiles");
//
//	            int rowNum = 0;
//	            for (String mobile : data) {
//	                Row row = sheet.createRow(rowNum++);
//	                Cell cell = row.createCell(0);
//	                cell.setCellValue(mobile);
//	            }
//
//	            workbook.write(outputStream);
//	            System.out.println("Mobile list successfully written to Excel file: " + excelFilePath);
//
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
//	    }
//	}
