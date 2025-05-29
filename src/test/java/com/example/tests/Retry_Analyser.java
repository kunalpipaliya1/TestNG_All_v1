package com.example.tests;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Analyser implements IRetryAnalyzer {
	
	// IRetryAnalyzer -- this will retry for failed testcases.
	
	// counter to keep track to failed retry attempt
	int counter_retry_attepmt = 0; // 0 to initialize
	
	// set max time for retry
	int set_max_Limit_retry = 3;

	// method to retry failed test cases
//	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(counter_retry_attepmt < set_max_Limit_retry ) {
			counter_retry_attepmt++;
			return true;
		}
		return false;
	}
}
