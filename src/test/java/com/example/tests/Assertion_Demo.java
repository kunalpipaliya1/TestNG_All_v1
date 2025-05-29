
// Assert --- Hard Assert
// SoftAssert --- Soft Assert

package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion_Demo {

	@Test
	public void testmethod() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		SoftAssert softVerify = new SoftAssert(); 
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		String actualtitle = "Automation Testing Practicee";
		String expectedtitle = driver.getTitle();
		
//		Assert.assertEquals(actualtitle, expectedtitle, "Title Miss-match"); // Hard Assert
		softVerify.assertEquals(actualtitle, expectedtitle, "Title Miss-match"); // soft Assert

		
		System.out.println("Verifying wikipedia icon...!!");
		
		WebElement iconwikipedia = driver.findElement(By.className("wikipedia-icon"));
//		Assert.assertTrue(iconwikipedia.isDisplayed(), "Wikipedia logo found");
		softVerify.assertTrue(iconwikipedia.isDisplayed(), "Wikipedia logo found");

		System.out.println("Verifying Wikipedia logo icon...!!");

		
		WebElement iconsearch = driver.findElement(By.className("wikipedia-search-button"));
//		Assert.assertTrue(iconsearch.isDisplayed(), "Wikipedia search button found");
		softVerify.assertTrue(iconsearch.isDisplayed(), "Wikipedia search button found");

		System.out.println("Verifying search button icon...!!");

		driver.close();
		
		// Report all failure message
		softVerify.assertAll(); // This one report all failure case, If you do comment and not denfine then error not report 
		
	}
}
