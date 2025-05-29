package com.example.tests;
import org.testng.annotations.Test;
public class InvocationCount {

	@Test(invocationCount=3) // Test method run 3 time if invocationcount set 5 then 5 times run same code
	public void InvocationCountMethod1() {
		System.out.print("First Test Method...!!! \n");
	}
	
	@Test(invocationCount=0) // Test method not run in invocationcount set 0
	public void InvocationCountMethod2() {
		System.out.print("Second Test Method...!!! \n");
	}
	
	@Test // If we can not add any invocationcount then 1 time it's executed
	public void InvocationCountMethod3() {
		System.out.print("Third Test Method...!!! \n");
	}

}
