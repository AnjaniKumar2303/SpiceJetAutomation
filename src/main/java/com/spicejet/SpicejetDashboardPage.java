package com.spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpicejetDashboardPage {

    WebDriver driver;
    
    SpicejetDashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    By signUp = By.linkText("Signup");
    By signIn = By.linkText("Login");

    public void openSignUpWindow() {
        driver.findElement(signUp).click();
    }

    public void openSignInWindow() {
        driver.findElement(signUp).click();
    }
}
