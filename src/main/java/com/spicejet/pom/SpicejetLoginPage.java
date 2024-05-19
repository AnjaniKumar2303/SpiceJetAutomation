package com.spicejet.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpicejetLoginPage {

    WebDriver driver;

    public SpicejetLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterMobileNumber() {
        driver.findElement(By.cssSelector("input[data-testid='user-mobileno-input-box']")).sendKeys();
    }

    public void enterPassword() {
        driver.findElement(By.cssSelector("input[data-testid='password-input-box-cta']")).sendKeys();
    }

    public void clickOnLogin() {
        driver.findElement(By.cssSelector("div[data-testid='login-cta']")).click();
    }
}
