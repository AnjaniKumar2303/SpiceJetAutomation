package com.spicejet;

import com.spicejet.pagefactory.DashboardPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;

public class TestSpicejetPageFactoryBasedTests {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void testSignUp() {
        driver.get("https://www.spicejet.com/");
        String mainWindow = driver.getWindowHandle();
        DashboardPage dashboardPage = new DashboardPage(driver);
    }


}
