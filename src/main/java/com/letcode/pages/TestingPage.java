package com.letcode.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.letcode.base.Testbase;

public class TestingPage extends Testbase {
 
	@FindBy(xpath = "//a[text()='Work Space']")
	
	WebElement practicebutton;
	
	public TestingPage()
	{
	PageFactory.initElements(driver, this);
	}
	
	public void Practiceclick() throws InterruptedException
	{
		Thread.sleep(2000);
		practicebutton.click();
	}
}
