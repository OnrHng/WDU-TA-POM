package org.cb.ta;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public abstract class BaseTest {
    protected final WebDriver driver;

    public BaseTest() {
        this.driver = Driver.getDriver();
    }

    @AfterClass
    public void teardown() throws InterruptedException {
        driver.quit();
    }
}
