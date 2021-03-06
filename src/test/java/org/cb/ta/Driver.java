package org.cb.ta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Driver {
    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver","webdriver\\chromedriver.exe");
        return new ChromeDriver();
    }
}
