package com.letcode.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.letcode.base.Testbase;

public class IframePage extends Testbase {
	
	@FindBy(xpath="//button[@name='frames']")
	WebElement frames;
	@FindBy(xpath="//iframe[@id='firstFr']")
	WebElement frame;
	@FindBy(xpath="//input[@name='fname']")
	WebElement fname;
	@FindBy(xpath="//input[@name='lname']")
	WebElement lname;
	@FindBy(xpath="//iframe[@class='has-background-white']")
	WebElement innerframe;
	@FindBy(xpath="//input[@name='email']")
	WebElement emailid;

	
	
//Initialize the pagefactor
	
	public IframePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Switch to frame
	
	public void clickframe()
	{
		frames.click();
	}
	
	public void firstname(String firstname ,String lastname)
	{
		driver.switchTo().frame(frame);
		System.out.println("moved to the first frame");
		
		
		lname.sendKeys(lastname);
		fname.sendKeys(firstname);
	}
	public void email(String emailaddress)
	{
		driver.switchTo().frame(innerframe);
		System.out.println("moved to the inner frame");
		emailid.sendKeys(emailaddress);
}
}