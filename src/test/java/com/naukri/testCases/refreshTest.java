package com.naukri.testCases;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.naukri.Utility.ExcelData;
import com.naukri.pageObject.Refresh;

public class refreshTest extends BaseClass{

	@Test
	public void UpdateProfile() throws InterruptedException {
		Refresh rf=new Refresh(driver);
		
		
		
//		Thread.sleep(2000);
//		rf.viewProfile();
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//	  js.executeScript("window.scrollBy(0,500)");
//		Thread.sleep(2000);
//
//		rf.summary();
//
//		rf.refresh();
		System.out.println("Entered into Refresh Test");
//		 wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		testLogin.Login_Naukri();
	
       Thread.sleep(5000);
		rf.viewProfile();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,1300)");	
		  Thread.sleep(2000);
		rf.summary();
		
		System.out.println("before");
		 Thread.sleep(2000);
		rf.refresh(); 
		
		System.out.println("Test pass Sucessfull------------");

	
	}
	
}
