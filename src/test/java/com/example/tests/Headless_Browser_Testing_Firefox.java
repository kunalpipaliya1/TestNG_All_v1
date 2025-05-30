package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headless_Browser_Testing_Firefox {

    public static void main(String[] args) throws InterruptedException {
        // 1. Setup FirefoxDriver automatically using WebDriverManager
        WebDriverManager.firefoxdriver().setup();

        // 2. Create FirefoxOptions and enable headless mode
        FirefoxOptions options = new FirefoxOptions();

        // Use standard headless argument for Firefox
        options.addArguments("--headless");  // Run Firefox in headless mode (no UI)

        // 3. Initialize WebDriver with FirefoxOptions
        WebDriver driver = new FirefoxDriver(options);

        // Navigate to the website
        driver.navigate().to("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        // Get and print page title
        String title = driver.getTitle();
        System.out.println("Page title : " + title);

        // Get and print current URL
        String currenturl = driver.getCurrentUrl();
        System.out.println("Get current URL : " + currenturl);

        // Perform login
        driver.findElement(By.xpath("//input[starts-with(@name,'user')]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password'][@name='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

        // Wait for 5 seconds
        Thread.sleep(5000);

        // Close the browser
        driver.quit();
        System.out.println("Code Executed Successfully...!!!");
    }
}
