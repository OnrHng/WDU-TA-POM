package org.cb.ta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WDUHome {
    private WebDriver driver;

    private final By dataTablesButtonStatesLink = By.xpath("//a[@id='data-table']");

    public WDUHome(WebDriver driver) {
        this.driver = driver;
        this.driver.get("http://www.webdriveruniversity.com/");
    }


    public WebElement getDataTablesButtonStatesLink() {
        return driver.findElement(dataTablesButtonStatesLink);
    }


}
