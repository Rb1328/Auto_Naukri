package com.naukri.testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.naukri.Utility.ExcelData;
import com.naukri.pageObject.Login;
import com.naukri.pageObject.Refresh;

public class testLogin extends BaseClass  {

		// TODO Auto-generated method stub


		@Test
		public static void Login_Naukri() throws InterruptedException {

			Login login=new Login(driver);
			Refresh rf=new Refresh(driver);
			Thread.sleep(2000);
		login.setUserName(username_base);
			System.out.println(username_base);
		
			
			login.setPass(pass);
			System.out.println(pass);
			Thread.sleep(2000);
			login.Submit();
			
			System.out.println("before log in pass");

		
		if(driver.getTitle().equals(driver.getTitle())) {
			System.out.println("Test Pass Successful Log in");
		}
		else {
			System.out.println("Login Fail");
		}
		}
	}

	

