package com.naukri.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.naukri.Utility.ExcelData;

public class Login  {
	
	By username=By.xpath("//input[@id='usernameField']");
	By pass=By.xpath("//input[@id='passwordField']");
	By submit=By.xpath("//button[contains(text(),'Login')]");

	static WebDriver ldriver;
	public Login(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	
//	@FindBy(how = How.ID,using="classname")
//	WebElement username;
//	
//	@FindBy(how = How.ID,using="classname")
//	WebElement PassFild;
//	
//	@FindBy(name="Contains(text()")
//	WebElement submit;
//	

	public void setUserName(String uname) {
		ldriver.findElement(username).sendKeys(uname);;
		
	}
	public void setPass(String password) {
		try {
			ldriver.findElement(pass).sendKeys(password);;

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Submit() {
		try {
			ldriver.findElement(submit).click();

		}
		catch(Exception e) {
			e.getCause();
		}
		
	}
	
	
	
	
}
