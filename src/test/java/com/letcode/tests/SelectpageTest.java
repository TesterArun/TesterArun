package com.letcode.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.letcode.base.Testbase;
import com.letcode.pages.LoginPage;
import com.letcode.pages.SelectPage;
import com.letcode.pages.TestingPage;

import customannotation.RetryCountIfFailed;

public class SelectpageTest extends Testbase{
	LoginPage loginpage;
	TestingPage testingpage;
	SelectPage selectpage;
   LoginTest logintest;
   TestingPageTest testingpagetest;
	
	
	public SelectpageTest()
	{
		super();
	}
	
	@BeforeMethod
	@RetryCountIfFailed(2)
	public void setup() throws InterruptedException
	{
		initialization();
		selectpage=new SelectPage();
		loginpage=new LoginPage();
		testingpagetest=new TestingPageTest();
		testingpage = loginpage.loginaction(prop.getProperty("username"), prop.getProperty("password"));
		testingpage.Practiceclick();

	}

 @Test(priority=0)
 
 public void selectoperations()
 {
	 selectpage.selectclick();
	 selectpage.selectfruit();
	 selectpage.superheros();
	 selectpage.languageselect();
	 selectpage.countryselect();
 }
 
// @AfterMethod
// public void broweserclose()
// {
//	 driver.quit();
// }
}
