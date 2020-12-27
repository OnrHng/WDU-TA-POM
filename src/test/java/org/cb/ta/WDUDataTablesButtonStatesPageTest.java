package org.cb.ta;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

public class WDUDataTablesButtonStatesPageTest extends BaseTest {

    private WDUDataTablesButtonStatesPage wduDataTablesButtonStatesPage;

    public WDUDataTablesButtonStatesPageTest() {
        wduDataTablesButtonStatesPage = new WDUDataTablesButtonStatesPage(driver);
    }

    @Test
    public void simple() {
        assertNotNull(wduDataTablesButtonStatesPage.getHeaderElement());
    }
}
