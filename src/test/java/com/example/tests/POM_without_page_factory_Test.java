package com.example.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//without page factory

public class POM_without_page_factory_Test {
	
        @Test	
        public void testLoginFunctionality() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");

		// create object for login page
		
		POM_without_page_factory LoginPg = new POM_without_page_factory(driver);
		
		LoginPg.enterUsername("standard_user");
		LoginPg.enterPassword("secret_sauce");
		LoginPg.Clickloginbutton();
		
		Assert.assertTrue(true);
		
		driver.quit();
		System.out.println("POM_without_page_factory code executed...!!");
	}

}

