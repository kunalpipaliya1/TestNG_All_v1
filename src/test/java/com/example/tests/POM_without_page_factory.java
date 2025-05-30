package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

// without page factory
public class POM_without_page_factory {
	
		
		WebDriver driver;

		// constructor
		public POM_without_page_factory(WebDriver d)
		{
			driver = d;
		}
		
		
		By username = By.id("user-name");
		By password = By.id("password");
		By clickbutton = By.id("login-button");
		
		@Test
		// Actions
		public void enterUsername(String usr) {
			driver.findElement(username).sendKeys(usr);
		}
		
		public void enterPassword(String pwd) {
			driver.findElement(password).sendKeys(pwd);
		}
		
		public void Clickloginbutton() {
			driver.findElement(clickbutton).click();;
		}	
	
}
