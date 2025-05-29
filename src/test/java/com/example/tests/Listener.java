package com.example.tests;
import org.testng.*;

public class Listener implements ITestListener, ISuiteListener   {

	public void onStart(ISuite suite) {
		System.out.println("onStart Method Invoke..." + suite.getName());
	}
	
	public void onFinish(ISuite suite) {
		System.out.println("onFinish Method Invoke..." + suite.getName());
	}
	
	public void onTestStart(ITestListener result) {
		System.out.println("onTestStart Method Invoke..." + result.toString());
	}
	
	public void onTestSuccess(ITestListener Result) {
		System.out.println("onTestSuccess Method Invoke...");
	}
	
	
	public void onTestFailure(ITestListener Result) {
		System.out.println("onTestFailure Method Invoke...");
	}
	
	public void onTestSkipped(ITestListener Result) {
		System.out.println("onTestSkipped Method Invoke...");
	}
	
	
	

}
