package com.naukri.testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.naukri.Utility.ExcelData;

public class BaseClass  extends ExcelData{
	
	   static WebDriver driver;
	  protected static Wait wait;
	  static  String username_base="bhavarrahul1313@gmail.com";
	  static String pass="Experience@rp1328";
	static String url="https://www.naukri.com/nlogin/login";
	
	

	@BeforeTest
	public static void launchChrome() {
		System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"//Drivers//msedgedriver.exe");
		 driver=new EdgeDriver();
		 
		
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("launched Browser");
				}
	
	@AfterTest
	public static void tearDown() {
		
		driver.close();
		
	}
	
}
