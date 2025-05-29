package com.example.tests;
import org.testng.annotations.*;
import org.testng.Assert;

public class Retry_testngfailed_xml_Testcases {
	
	@Test(retryAnalyzer = Retry_Analyser.class)

	public void Testcase01() {
		Assert.assertTrue(false); // Test case will be fail
		System.out.print("Testcase01 ...!!!");
	}
	
	@Test(retryAnalyzer = Retry_Analyser.class)
	public void Testcase02() {
		Assert.assertTrue(false); // Test case will be fail
		System.out.print("Testcase02 ...!!!");

	}
	
	@Test(retryAnalyzer = Retry_Analyser.class)
	public void Testcase03() {
		Assert.assertTrue(true); // Test case will be pass
		System.out.print("Testcase03 ...!!!");

	}

}
