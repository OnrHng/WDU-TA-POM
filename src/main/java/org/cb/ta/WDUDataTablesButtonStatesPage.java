package org.cb.ta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WDUDataTablesButtonStatesPage {
    private WebDriver driver;
    private final WebElement headerElement;

    public WDUDataTablesButtonStatesPage(WebDriver driver) {
        this.driver = driver;
        this.driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");

        headerElement = driver.findElement(By.id("main-header"));
    }

    public WebElement getHeaderElement() {
        return headerElement;
    }
}
