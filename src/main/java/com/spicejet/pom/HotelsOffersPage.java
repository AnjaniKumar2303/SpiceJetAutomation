package com.spicejet.pom;

import com.spicejet.utils.SpicejetPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HotelsOffersPage extends SpicejetPageObject {

    HotelsOffersPage(WebDriver driver) {
        super(driver, By.className("page-title2-container"));
    }

}
