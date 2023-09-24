package com.naukri.testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class temp extends BaseClass{
	
	@Test
    public void temp() throws InterruptedException

 {
    

		  Thread.sleep(2000);
      //to perform Scroll on application using Selenium
      JavascriptExecutor js = (JavascriptExecutor) driver;
      Thread.sleep(2000);
      js.executeScript("window.scrollBy(0,5000)");
      Thread.sleep(2000);
  }
}
