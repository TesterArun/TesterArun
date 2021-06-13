package com.letcode.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.letcode.base.Testbase;

public class LoginPage extends Testbase {
	//page factor - Object Repository
	
	@FindBy(xpath= "//input[@name='email']")
	WebElement email;
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	@FindBy(xpath="//button[text()='LOGIN']")
	WebElement login;
	
	//intialize the Pageobject
	
	public  LoginPage() {
	  PageFactory.initElements(driver, this);
	}

	//Actions
	
	public String loginpagevalidation()
	{
		return driver.getTitle();
	}
	public TestingPage loginaction(String un,String pwd )

	{
		email.clear();
		email.sendKeys(un);
		password.clear();
		password.sendKeys(pwd);
		login.click();
		
		return new TestingPage();
	}
	
	
	
	
}
