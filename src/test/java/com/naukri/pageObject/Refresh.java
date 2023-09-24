package com.naukri.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.naukri.testCases.BaseClass;


public class Refresh{

	WebDriver ldriver;

	public Refresh (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	By view_profile=By.xpath("//div[@class='view-profile-wrapper']/a[@href='/mnjuser/profile']");
	By summary=By.xpath("//div[@id='lazyProfileSummary']//span[2]");
	
	By refresh_summary=By.xpath("//div[@class='action s12']/button[@type='submit' and @class='btn-dark-ot']");
	
	public void viewProfile() throws InterruptedException {
		
		ldriver.findElement(view_profile).click();;
	}
	
	public void summary() throws InterruptedException {
		ldriver.findElement(summary).click();;
	}
	
	public void refresh() throws InterruptedException  {
		
			ldriver.findElement(refresh_summary).click();
		
		System.out.println("Summary Updated");
	
	}
	
}
