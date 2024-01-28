package com.spicejet.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollUtils {

    public static void scrollToItem(WebElement webElement, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor)  driver;
        js.executeScript("arguments[0].scrollIntoView(true)", webElement);
    }
}
