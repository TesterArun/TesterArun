package com.letcode.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.letcode.base.Testbase;
import com.letcode.listener.CustomListener;
import com.letcode.pages.IframePage;
import com.letcode.pages.LoginPage;
import com.letcode.pages.TestingPage;
import com.letcode.pages.WindowsPage;

@Listeners(CustomListener.class)
public class WindowsPageTest extends Testbase {

	WindowsPage windowspage;
	LoginPage loginpage;
	TestingPage testingpage;
	TestingPageTest testingpagetest;


	
	public WindowsPageTest() {
		super();
	}


	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		testingpage = loginpage.loginaction(prop.getProperty("username"), prop.getProperty("password"));
		testingpage = new TestingPage();
		testingpage.Practiceclick();
		windowspage = new WindowsPage();
		

	}

	@Test (priority = 0)
	public void clickwindow() {
		windowspage.windowsclick();
	}

	@Test (priority = 1)
	public void validatethewindowspage() {
		windowspage.validatetextonthewindow();
	}

	@Test (priority = 2)
	public void homebuttonclic() {
		windowspage.clickgotohome();
	}

	@Test (priority = 3)
	public void childwindow() {
		windowspage.handlewindow();
	}

	@Test (priority = 4)
	public void verifychildwindow() {
		windowspage.validatetextonthewindow();
	}

	@AfterMethod
	public void printmethod() {
		//driver.quit();
		System.out.println("methodpass");
	}

}