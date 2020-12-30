package org.cb.ta;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

public class WDUHomeTest extends BaseTest {

    private final WebElement dataTablesButtonStatesLinkElement;
    private final WDUHome wduHome;

    public WDUHomeTest() {
        super();
        wduHome = new WDUHome(driver);
        dataTablesButtonStatesLinkElement = wduHome.getDataTablesButtonStatesLink();
    }

    @Test
    public void checkIfDataTablesButtonStatesLinkExists() {
        assertNotNull(dataTablesButtonStatesLinkElement);
    }

    @Test
    public void checkIfDataTablesButtonStatesLinkIsEnabled() {
        assertTrue(dataTablesButtonStatesLinkElement.isEnabled());
    }

    @Test
    public void clickDataTablesButtonStatesLink() {
        dataTablesButtonStatesLinkElement.click();
    }



}
