package com.spicejet.pagefactory;

import com.spicejet.utils.SpicejetPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends SpicejetPageObject {

    public DashboardPage(WebDriver driver) {
        super(driver, By.cssSelector("div[data-testid='application-id']"));
    }

}
