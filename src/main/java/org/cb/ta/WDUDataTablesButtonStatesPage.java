package org.cb.ta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WDUDataTablesButtonStatesPage {
    private WebDriver driver;
    private final WebElement headerElement;
    private final List<WebElement> table1Rows;

    public WDUDataTablesButtonStatesPage(WebDriver driver) {
        this.driver = driver;
        this.driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");
//        System.out.println("WEB SIte Url : " + driver.getCurrentUrl());
//        System.out.println("second "+driver.getTitle());

        headerElement = driver.findElement(By.id("main-header"));
        table1Rows = driver.findElements(By.xpath("//table[@id='t01']/tbody/tr"));
    }

    public WebElement getHeaderElement() {
        return headerElement;
    }

    public List<WebElement> getTable1Rows() {
        return table1Rows;
    }

}
