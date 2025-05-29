package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class One_statement_fill_form {
	@Test
	public void main() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);

        Actions actions = new Actions(driver);
        Action seriesOfAction = actions.moveToElement(driver.findElement(By.xpath("//*[@name='username']")))
        		.click()
        		.sendKeys("Admin", Keys.TAB)
        		.sendKeys("admin123", Keys.ENTER).build();
        seriesOfAction.perform();
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");

        driver.quit();		
	}
}
