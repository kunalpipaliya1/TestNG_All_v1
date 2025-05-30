// TestNG 3 types of report are generated
//1. Index.html
//2. emailable-report.html
//3. Customize report and message will be reflected on the "Reporter output"(index.html)

package com.example.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Reports {
	
	@Test
	public void Testcase01() {
		System.out.println("Test 1 pass");
		Reporter.log("Test 1 log");
		Reporter.log("Test 1 another log");
		Reporter.log("Test 1 another log");

	}
	
	@Test
	public void Testcase02() {
		System.out.println("Test 2 pass");
		Reporter.log("Test 2 log");

	}
	
	@Test
	public void Testcase03() {
		System.out.println("Test 3 pass");
		Reporter.log("Test 3 log");

	}

}
