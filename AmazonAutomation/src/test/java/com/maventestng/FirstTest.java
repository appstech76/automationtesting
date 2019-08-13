package com.maventestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {
	WebDriver driver;
		
	@BeforeMethod
	public void setBrowserEnvironment()
	{
		
     //	Browser Environmental setting
		System.setProperty("webdriver.gecko.driver","C:\\AutomationSoftwares\\BrowserDrivers\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
            driver.manage().window().maximize();
            String URL="https://www.Gmail.com";
    		
               driver.get(URL);
		
	}
	@Test
	public void login() throws Exception
	{
	 WebElement element=driver.findElement(By.id("identifierId"));
	       element.sendKeys("appstech76@gmail.com");
	       driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click(); 
		      Thread.sleep(1000);
	
		      driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("prasad@123");
		      		       		
		   driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click(); 
		    Thread.sleep(1000);
	       driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
			       		
	}
    @AfterMethod
    public void endup() {
    driver.quit();	
     }
   }  

