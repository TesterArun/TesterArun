package com.letcode.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.letcode.base.Testbase;

public class TestingPage extends Testbase {
 
	@FindBy(xpath="//button[@id='testing']")
	WebElement practicebutton;
	
	
	public TestingPage()
	{
	PageFactory.initElements(driver, this);
	}
	
	public void Practiceclick()
	{
		practicebutton.click();
	}
}
