package com.letcode.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.letcode.base.Testbase;
import com.letcode.listener.CustomListener;
import com.letcode.pages.IframePage;
import com.letcode.pages.LoginPage;
import com.letcode.pages.TestingPage;

@Listeners(CustomListener.class)
public class IframeTest extends Testbase {

	LoginPage loginpage;
	TestingPage testingpage;
	IframePage iframepage;

	public IframeTest() {
		super();
	}

	@BeforeMethod

	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		testingpage = new TestingPage();
		testingpage = loginpage.loginaction(prop.getProperty("username"), prop.getProperty("password"));
		testingpage.Practiceclick();
		iframepage = new IframePage();
		iframepage.clickframe();
		System.out.println(driver.getTitle());
	}

	@Test(priority = 1)
	public void switchtofirstframe() {
		iframepage.firstname("arun", "pandian");

	}

	@Test(priority = 2)
	public void switchtoinnerframe() {

		iframepage.firstname("arun", "pandian");
		iframepage.email("arundarll007@gmail.com");

		//Assert.assertEquals(false, true);
	}

	@AfterMethod
	public void browserclose() {
		driver.close();
	}
}
