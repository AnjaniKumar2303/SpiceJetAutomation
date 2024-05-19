package com.spicejet.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SpicejetPageObject {

    WebDriver browser;

    By pageLocator;

    public SpicejetPageObject(WebDriver browser, By pageLocator) {
        this.browser = browser;
        this.pageLocator = pageLocator;
    }

    public static <T extends SpicejetPageObject> T createPage(WebDriver driver, Class<T> type) {
        T pageObject = null;
        try {
            pageObject = PageFactory.initElements(driver, type);
        } catch (Exception e) {
            System.out.println(e);
        }
        pageObject.waitForPageToLoad();
        return pageObject;
    }

    public void waitForPageToLoad() {
        getPageRoot();
    }

    public WebElement getPageRoot() {
        return browser.findElement(pageLocator);
    }
}
