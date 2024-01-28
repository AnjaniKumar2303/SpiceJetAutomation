package com.spicejet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class TestSpicejet {

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
        SpicejetDashboardPage dashboardPage = new SpicejetDashboardPage(driver);
        SpicejetSignUpPage spicejetSignUpPage = new SpicejetSignUpPage(driver);
        dashboardPage.clickOnSignUpButton();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> itr = windows.iterator();
        while (itr.hasNext()) {
            String childWindow = itr.next();
            if (!childWindow.equals(mainWindow)) {
                driver.switchTo().window(childWindow);
                break;
            }
        }
        spicejetSignUpPage.selectTitle();
        spicejetSignUpPage.enterFirstNameAndMiddleName();
        spicejetSignUpPage.enterLastName();
        spicejetSignUpPage.selectCountry();
        spicejetSignUpPage.enterDOB();
        spicejetSignUpPage.enterMobile();
        spicejetSignUpPage.enterEmail();
        spicejetSignUpPage.enterPassword();
        spicejetSignUpPage.enterConfirmPassword();
        spicejetSignUpPage.selectCheckbox();
        spicejetSignUpPage.submit();
    }

    @Test
    public void testSignIn() {


    }

}
