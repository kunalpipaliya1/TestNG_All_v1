package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headless_Browser_Testing_Chrome {
	
	public static void main(String[] args) throws InterruptedException {
        // 1. Setup ChromeDriver automatically using WebDriverManager
		WebDriverManager.chromedriver().setup();
		
        // 2. Create ChromeOptions and enable headless mode
		ChromeOptions options = new ChromeOptions();
		
		// Use the new headless mode argument instead of deprecated method
		options.addArguments("--headless=new"); // Run Chrome in headless mode (no UI)
        
		// 3. Initialize WebDriver with ChromeOptions
		WebDriver driver = new ChromeDriver(options); // Use for chrome
		
        // WebDriver driver = new FirefoxDriver(); // Use for Mozila

        driver.navigate().to("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        // Thread.sleep(5000); // Wait for 5 seconds
        String title = driver.getTitle();
        System.out.println("Page title : " + title);

        String currenturl = driver.getCurrentUrl();
        System.out.println("Get current URL : " + currenturl);

        driver.findElement(By.xpath("//input[starts-with(@name,'user')]")).sendKeys("standard_user");

        driver.findElement(By.xpath("//input[@id='password'][@name='password']")).sendKeys("secret_sauce");

        driver.findElement(By.xpath("//input[@id='login-button']")).click();

        // Sleep time in milli seconds
        Thread.sleep(5000);

        driver.quit(); // Close the browser
        System.out.println("Code Executed Successfully...!!!");
    }
}
