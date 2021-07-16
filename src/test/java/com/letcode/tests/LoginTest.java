package com.letcode.tests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
import com.letcode.base.Testbase;
import com.letcode.listener.CustomListener;
import com.letcode.pages.LoginPage;
import com.letcode.pages.TestingPage;

@Listeners(CustomListener.class)
public class LoginTest extends Testbase {
	LoginPage loginpage;
	TestingPage testingpage;

	public LoginTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		// object creation
		loginpage = new LoginPage();
		testingpage =new TestingPage();

	}

	@Test(priority=1)
	
	public void titlevalidation()
	{
		String title=loginpage.loginpagevalidation();
		System.out.println(title);
	}
	
	@Test (priority=2)
	public void loginclicktest()
	{
		testingpage = loginpage.loginaction(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod
	public void browserclose() {
		driver.quit();
	}

}
