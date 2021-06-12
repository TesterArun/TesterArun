package com.letcode.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.letcode.base.Testbase;
import com.letcode.pages.LoginPage;
import com.letcode.pages.TestingPage;

public class TestingPageTest extends Testbase {
       
 LoginPage loginpage;
 TestingPage testingpage;
	
	
	public TestingPageTest()
	{
		super();
	}

@BeforeMethod

public void setup()
{
	initialization();
	loginpage=new LoginPage();
	testingpage = loginpage.loginaction(prop.getProperty("username"), prop.getProperty("password"));
	
	}

     @Test
     
     public void practiceclick()
     {
    	testingpage.Practiceclick();
    	 
     }
     
     @AfterMethod
 	public void browserclose() {
 		driver.quit();
     }


	
}
