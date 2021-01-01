package org.cb.ta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class WDUDataTablesButtonStatesPageTest extends BaseTest {

    private WDUDataTablesButtonStatesPage wduDataTablesButtonStatesPage;
    private WriteDataToExcel writeDataToExcel = new WriteDataToExcel();

    public WDUDataTablesButtonStatesPageTest() {
        wduDataTablesButtonStatesPage = new WDUDataTablesButtonStatesPage(driver);
    }

    @Test
    public void simple() {
        String textOfHeader =  wduDataTablesButtonStatesPage.getHeaderElement().getText();
//        System.out.println(textOfHeader);
        assertEquals("Data, Tables & Button States", textOfHeader);
    }

    @Test
    public void testTable1() throws IOException {
        List<WebElement> rows = wduDataTablesButtonStatesPage.getTable1Rows();
//        String[] dataToWrite = new String[4];
        List<String[]> dataList = new ArrayList<>();
        for (WebElement row : rows) {
            String[] splittedRow = row.getText().split(" ");
//            ["Firstname", "Lastname", "Age"]
            dataList.add(splittedRow);
//            System.out.println(row.getText());
        }
        // [["Firstname", "Lastname", "Age"],["John", "Smith", "45"],["Jemma", "Jackson", "94"],["Michael", "Doe", "20"]]
        writeDataToExcel.writeExcel("src/test/java/org/cb/ta/resources/", "test01.xls", "Sayfa1", dataList );

        /*
        * Firstname lastname Age
        * sally     abc       20
        * john      xyz       30
        * */

       // writeDataToExcel.writeExcel("src/test/java/org/cb/ta/resources/", "test01.xls", "Table01",  );


    }
}
