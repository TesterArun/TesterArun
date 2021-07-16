package com.letcode.listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import customannotation.RetryCountIfFailed;

public class Retryanalyzer implements IRetryAnalyzer {
	
	int counter=0;
	 int retryLimit = 2;

	public boolean retry(ITestResult result) {
		
		
		if(counter < retryLimit)
		 {
		 counter++;
		 return true;
		 }		 

//		RetryCountIfFailed annotation=result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(RetryCountIfFailed.class);
//			
//		if((annotation != null) && (counter<annotation.value()))
//		
//		{
//			counter++;
//			return true;
//	}
		
		return false;
	}
	
}
