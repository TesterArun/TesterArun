package com.letcode.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.letcode.base.Testbase;

public class WindowsPage extends Testbase {
	
	//@FindBy(xpath ="//button[@name='windows']")
	@FindBy(id ="win")
     WebElement windows;
	@FindBy(xpath="//div[@class='container']")
     WebElement text;
	@FindBy(xpath="//button[text()='Open Home Page']")
	WebElement GotoHome;
	@FindBy(xpath="//button[@id='multi']")
	WebElement MultipleWindows;
	

	
//Actions
	public void windowsclick()
	{
		windows.click();
	}
	
	public void validatetextonthewindow()
	{
		String expected="Windows Handling Interact with different types of Windows";
		String actual=text.getText();
		Assert.assertEquals(actual, expected);
		
	}
	public void clickgotohome()
	{
		GotoHome.click();
	}
	
	public void handlewindow()
	{
		String childwindow=driver.getWindowHandle();
	    driver.switchTo().window(childwindow);
		
		}
    public  String verifychihldwindow()
    {
    	return driver.getTitle();
    	
    }
}
