package com.spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpicejetDashboardPage {

    WebDriver driver;
    
    SpicejetDashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    By signUp = By.linkText("Signup");

    public void clickOnSignUpButton() {
        driver.findElement(signUp).click();
    }




}
