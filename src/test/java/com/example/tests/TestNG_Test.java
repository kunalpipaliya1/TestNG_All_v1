package com.example.tests;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.*;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(com.example.tests.Listener.class)
public class TestNG_Test {
    
	
	// WebDriver driver;
    @Test
    public void TestNG_VerifyTitle() throws InterruptedException  {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        	
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).submit();
        
        System.out.println("Page Title is: " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");

        driver.quit();
    }
    
    @Test
    public void Test_Fail() {
    	System.out.println("Test Failed");
    	Assert.assertTrue(true);
    }
    
    @Test
    public void Test_skip()  {
    	System.out.println("Test skip");
    	throw new SkipException("Skip Exception..........!!!!!");
    }

}