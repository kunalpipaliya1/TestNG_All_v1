package com.example.tests;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Encode_Encrypt_Password {

	public static void main(String[] args) throws InterruptedException {
		
		// encode password
		String password = "admin@123";
		
//		byte[] encodeddpassword = Base64.encodeBase64(password.getBytes());
//		System.out.println(new String(encodeddpassword)); // encoded password: YWRtaW5AMTIz

		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
        
        byte[] dncodeddpassword  = Base64.decodeBase64(password.getBytes());
        
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys(new String(dncodeddpassword));
        driver.findElement(By.xpath("//button[@type='submit']")).submit();

        System.out.println("Page Title is: " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");

        driver.quit();		
	}
}
