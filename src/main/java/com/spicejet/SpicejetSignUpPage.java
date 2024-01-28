package com.spicejet;

import com.spicejet.utils.ScrollUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SpicejetSignUpPage {

    WebDriver driver;

    SpicejetSignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectTitle() {
        WebElement dropdownElement = driver.findElement(By.className("form-control"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByValue("MR");
    }

    public void enterFirstNameAndMiddleName() {
        driver.findElement(By.id("first_name")).sendKeys("Aman");
    }

    public void enterLastName() {
        driver.findElement(By.id("last_name")).sendKeys("Kumar");
    }

    public void selectCountry() {
        WebElement element = driver.findElement(By.xpath("//label[text()='Country/Territory of Residence']/parent::div"));
        ScrollUtils.scrollToItem(element, driver);
        WebElement dropdownWebElement = element.findElement(By.className("form-control"));
        Select dropdown = new Select(dropdownWebElement);
        dropdown.selectByValue("IN");
    }

    public void enterDOB() {
        driver.findElement(By.id("dobDate")).sendKeys("24/07/1995");
    }

    public void enterMobile() {
        driver.findElement(By.cssSelector("input[type='tel]")).sendKeys("0123456789");
    }

    public void enterEmail() {
        driver.findElement(By.id("email_id")).sendKeys("amankumar@gmail.com");
    }

    public void enterPassword() {
        driver.findElement(By.id("new-password")).sendKeys("AmanKumar@1234");
    }

    public void enterConfirmPassword() {
        driver.findElement(By.id("c-password")).sendKeys("AmanKumar@1234");
    }

    public void selectCheckbox() {
        driver.findElement(By.id("defaultCheck1")).click();
    }

    public void submit() {
        driver.findElement(By.tagName("button"));
    }
}
