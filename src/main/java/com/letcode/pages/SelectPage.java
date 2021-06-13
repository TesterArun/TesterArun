package com.letcode.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.letcode.base.Testbase;

public class SelectPage extends Testbase{
	
	@FindBy(xpath = "//button[@id='select']")
	WebElement select;
	
	 @FindBy(xpath = "//select[@id='fruits']")
	 WebElement fruits;
	
	@FindBy(xpath = "//select[@id='superheros']")
	WebElement superheors;
	
	@FindBy(xpath ="//select[@id='lang']")
	WebElement language;
	
	@FindBy(xpath ="//select[@id='country']/option")
	List <WebElement> country;
	
	
//initializing the page factory
	
	public SelectPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//action methods
	
	public void selectclick()
	{
		select.click();
		
	}
 
  public void selectfruit()
  {
	  //fruits.click();
	  Select fruit=new Select(fruits);
	  fruit.selectByValue("1");
  }
  
  public void superheros()
  {
	  //superheors.click();
	  Select sp=new Select(superheors);
	  sp.selectByVisibleText("Batman");
  }
  public void languageselect()
  {
	 // language.click();
	  
	  Select sp1=new Select(language);
	  sp1.selectByValue("java");
  }
  public void countryselect()
  {
	
	  for(int i=0;i<country.size();i++)
	  {
		  String dropdownvalue = country.get(i).getText();
		  if(dropdownvalue.equalsIgnoreCase("India")){
			  country.get(i).click();
		  }
	  }
	  
  }
  }
  
  
