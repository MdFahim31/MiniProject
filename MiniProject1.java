package com.selenium.task;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MiniProject1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				 "C:\\Users\\Hp 15\\eclipse-workspace\\Selenium_Sept_Concepts\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://automationpractice.com/index.php");
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[@class='login']")).click();
	
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("fahimmohammed15@gmail.com");
	
	
	driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//input[@name='id_gender'])[1]")).click();
	

	
	driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Mohammed");
	
	driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Fahim");
	
	
	driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Immrpsycho");
	
	Thread.sleep(3000);
	
	WebElement date = driver.findElement(By.xpath("//select[@id='days']"));
	date.click();
	
    Select d = new Select(date);
    d.selectByValue("31");
    
    Thread.sleep(3000);
    
    WebElement month = driver.findElement(By.xpath("//select[@id='months']"));
    month.click();
    
    Select m = new Select(month);
    m.selectByValue("8");
    Thread.sleep(3000);
    
    WebElement year = driver.findElement(By.xpath("//select[@id='years']"));
    year.click();
   
  
	Select y = new Select(year);
    y.selectByValue("1996");
    
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Sima Foundation");
    
    driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("No3872,Groove Street");
    
    driver.findElement(By.xpath("(//input[@class='form-control'])[5]")).sendKeys("CJ Apartments,3rd Floor");
    
    driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Los Angeles");
    
    Thread.sleep(3000);
    
    
    WebElement state = driver.findElement(By.xpath("//select[@id='id_state']"));
    state.click();
    Select s = new Select(state);
    s.selectByValue("5");
    
    Thread.sleep(3000);

    driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("90001");
    
    driver.findElement(By.xpath("//textarea[@id='other']")).sendKeys("Happy to be here");

    driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("7401440646");
    
    driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("636987327");
    
    driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("No 1 Agathiyar nagar");
    
    driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
    Thread.sleep(2000);

    
    TakesScreenshot ts =  (TakesScreenshot) driver;
    File sc = ts.getScreenshotAs(OutputType.FILE);
    File ds = new File("C:\\Users\\Hp 15\\eclipse-workspace\\Selenium_Sept_Concepts\\screenshot\\MP2.png");
    FileUtils.copyFile(sc, ds);
    

    driver.navigate().back();
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("fahimmohammed15@gmail.com");
    driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Immrpsycho");
    
    TakesScreenshot t =  (TakesScreenshot) driver;
    File src = t.getScreenshotAs(OutputType.FILE);
    File dst = new File("C:\\Users\\Hp 15\\eclipse-workspace\\Selenium_Sept_Concepts\\screenshot\\MP1.png");
    FileUtils.copyFile(src, dst);   
    Thread.sleep(2000);
  
   // driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
   
  
    
    
    
    
    
    
    
    
    
    

		
		
		
		
		
	}

}
