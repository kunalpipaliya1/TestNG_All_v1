package com.example.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_with_page_factory {

	WebDriver driver;
	
	// constructor
	public POM_with_page_factory(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(driver, this); // all web element will create, it's mandatory
	}
	
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginbutton;
	
	// Actions 
	public void enterUsername(String usr) {
		username.sendKeys(usr);
	}
			
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}
			
	public void Clickloginbutton() {
		loginbutton.click();;
	}	
}
