package org.Maven.Maven_Project;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTask {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Hp 15\\eclipse-workspace\\Selenium_Sept_Concepts\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/text-box");
	
		Thread.sleep(3000);
		
		TakesScreenshot t = (TakesScreenshot) driver;
		
        File sc = t.getScreenshotAs(OutputType.FILE);
        
        File d = new File("C:\\Users\\Hp 15\\eclipse-workspace\\Selenium_Sept_Concepts\\screenshot\\tools.png");
        
        FileUtils.copyFile(sc, d);
        
		WebElement user = driver.findElement(By.id("userName"));
		
		user.sendKeys("Mohamed Fahim");
		
		WebElement mail = driver.findElement(By.id("userEmail"));
		mail.sendKeys("fahimmohammed16@gmail.com");
		
		WebElement address = driver.findElement(By.id("currentAddress"));
		address.sendKeys("No 1 first street villivakkam");
		
		WebElement p = driver.findElement(By.id("permanentAddress"));
	    p.sendKeys("No 1 first street villivakkam");
	    
	    Thread.sleep(3000);
	    
		TakesScreenshot ts = (TakesScreenshot) driver;
		
        File s = ts.getScreenshotAs(OutputType.FILE);
        
		
		File de = new File("C:\\Users\\Hp 15\\eclipse-workspace\\Selenium_Sept_Concepts\\screenshot\\tool.png");
		
		FileUtils.copyFile(s, de);
		
		
		
		
		
		
		
	}

}
