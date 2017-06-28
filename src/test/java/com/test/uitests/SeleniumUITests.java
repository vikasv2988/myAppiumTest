package com.test.uitests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.runner.Runner;

public class SeleniumUITests {
	
	WebDriver driver;
	
	
	  @BeforeTest
	  public void beforeTest() throws MalformedURLException {
		  System.setProperty("webdriver.chrome.driver","Resource\\chromedriver.exe");
		  driver=new ChromeDriver();
	  }
	  
	  @Test
	  public void f() throws InterruptedException 
		{
		  System.out.println("Test Executing for env="+Runner.env);
		  driver.get("http://www.google.com/xhtml");
		  Thread.sleep(5000);  // Let the user actually see something!
		  WebElement searchBox = driver.findElement(By.name("q"));
		  searchBox.sendKeys("ChromeDriver");
		  searchBox.submit();
		  Thread.sleep(5000);  // Let the user actually see something!
	  }
	  
	  
	  @AfterTest
	  public void afterTest() 
	  {
		  driver.quit();
	  }
	  
	  

}
