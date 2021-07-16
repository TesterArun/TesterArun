package com.letcode.tests;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.letcode.base.Testbase;
import com.letcode.pages.LoginPage;
import com.letcode.pages.TestingPage;

import customannotation.RetryCountIfFailed;

//@Listeners(CustomListener.class)
public class TestingPageTest extends Testbase {
       
 LoginPage loginpage;
 TestingPage testingpage;

Logger logger=Logger.getLogger("Log4J");

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
	
	//logger.info("Browser inti");
	}


//    @Test (retryAnalyzer =com.letcode.listener.Retryanalyzer.class )
    @Test
//    @RetryCountIfFailed(2)
     public void practiceclick() throws InterruptedException
     {
    	 testingpage=new TestingPage();
    	testingpage.Practiceclick();
     Assert.assertEquals(false, true);
     }
     
     @AfterMethod
 	public void browserclose() {
 		driver.quit();
 	 // logger.info("browser closed");
     }


	
}
