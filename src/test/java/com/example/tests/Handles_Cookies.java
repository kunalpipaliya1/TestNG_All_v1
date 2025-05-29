package com.example.tests;
import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Handles_Cookies {

    @Test
    public void handleCookiesTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/");

        // ✅ Get all cookies
        Set<Cookie> initialCookies = driver.manage().getCookies();
        System.out.println("Total cookies BEFORE add: " + initialCookies.size());

        for (Cookie ck : initialCookies) {
            System.out.println(ck.getName() + " = " + ck.getValue());
        }

        // ✅ Get cookie by name
        System.out.println("Cookie 'fonts-loaded': " + driver.manage().getCookieNamed("fonts-loaded"));

        // ✅ Add a new cookie
        Cookie newCookie = new Cookie("Kunal", "800088");
        driver.manage().addCookie(newCookie);
        System.out.println("Cookie 'Kunal' added: " + driver.manage().getCookieNamed("Kunal"));
        System.out.println("Total cookies AFTER add: " + driver.manage().getCookies().size());

        // ✅ Delete by object
        Cookie kunalCookie = driver.manage().getCookieNamed("Kunal");
        driver.manage().deleteCookie(kunalCookie);
        System.out.println("Cookie 'Kunal' after delete by object: " + driver.manage().getCookieNamed("Kunal"));
        System.out.println("Total cookies AFTER delete by object: " + driver.manage().getCookies().size());

        // ✅ Delete by name
        driver.manage().deleteCookieNamed("dpr");
        System.out.println("Cookie 'dpr' deleted.");
        System.out.println("Total cookies AFTER delete by name: " + driver.manage().getCookies().size());

        // ✅ Delete all cookies
        driver.manage().deleteAllCookies();
        System.out.println("All cookies deleted.");
        System.out.println("Total cookies AFTER delete all: " + driver.manage().getCookies().size());

        driver.quit();
    }
}
