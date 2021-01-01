package org.cb.ta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class DropDownCheckBoxRadioBtnsPageTest extends BaseTest{

  DropDownCheckBoxRadioBtnsPage dropDownCheckBoxRadioBtnsPage;

  public DropDownCheckBoxRadioBtnsPageTest() {
    this.dropDownCheckBoxRadioBtnsPage = new DropDownCheckBoxRadioBtnsPage(driver);
  }

  @Test
  public void testSelectAnOptionFromDropDownMenu() {
    WebElement selectedOption = dropDownCheckBoxRadioBtnsPage.selectAnOptionFromDropDownMenu("python");
    assertEquals(selectedOption.getAttribute("value"), "python");
  }

  @Test
  public void testSelectACheckBox() {
    List<WebElement> checkBoxes = dropDownCheckBoxRadioBtnsPage.selectACheckBox();

    for (WebElement element : checkBoxes) {
      if (element.isSelected()) continue;

      element.click();
      System.out.println(element.getText() + " is clicked!");
      assertTrue(element.isSelected());
    }
  }

  @Test(dependsOnMethods = "testSelectACheckBox")
  public void testdeSelectACheckBox() {
    List<WebElement> checkBoxes = dropDownCheckBoxRadioBtnsPage.selectACheckBox();

    for (WebElement element : checkBoxes) {
      //if (element.isSelected()) continue;

      element.click();
      System.out.println(element.getText() + " is deselected!");
      assertFalse(element.isSelected());
    }

  }

  @Test
  public void testGetRadioBtns() {
    List<WebElement> radioBtns = dropDownCheckBoxRadioBtnsPage.getRadioBtns();

    for (int i = 0; i < radioBtns.size(); i++) {
      List<WebElement> tmprList = radioBtns;
      radioBtns.get(i).click();
      assertTrue(radioBtns.get(i).isSelected());
      tmprList.remove(i);
      int j = i + 1;
      while(j < tmprList.size()) {
        assertFalse(tmprList.get(j).isSelected());
        j++;
      }
    }
  }
}











