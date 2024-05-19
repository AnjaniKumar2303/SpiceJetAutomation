package com.spicejet.pom;

import com.spicejet.utils.SpicejetPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpicejetDashboardPage {

    WebDriver driver;
    
    public SpicejetDashboardPage(WebDriver driver) {
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

    public void openHotelsPage() {
        driver.findElement(By.linkText("Hotels")).click();
    }
}
