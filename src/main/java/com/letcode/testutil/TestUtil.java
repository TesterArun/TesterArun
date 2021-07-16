package com.letcode.testutil;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.letcode.base.Testbase;

public class TestUtil extends Testbase {

	
	public void sendemail() throws EmailException
	{
		System.out.println("Test started==============>");
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("arun.pandiantester@gmail.com", "darlling"));
		email.setSSLOnConnect(true);
		email.setFrom("arun.pandiantester@gmail.com");
		email.setSubject("Selenium Report");
		email.setMsg("This is a test mail from selenium ... :-)");
		email.addTo("arungoodtester@gmail.com");
		email.send();
		System.out.println("Email sent==============>");
	}
	public void failed(String testMethodName) throws IOException
	{
		
		File Scrrenshotfile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(Scrrenshotfile, new File("C:\\Users\\Arun_P\\eclipse-workspace\\Project1\\screenshots\\"+ testMethodName +"-" +".png"));
	}catch (IOException e) {
		e.printStackTrace();
	}
	}
	public void passed(String testMethodName) throws IOException {
		File Screenshot1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
		FileUtils.copyFile(Screenshot1, new File("C:\\Users\\Arun_P\\eclipse-workspace\\Project1\\screenshots\\pass\\"+ testMethodName +"_" +".png"));
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}


}

