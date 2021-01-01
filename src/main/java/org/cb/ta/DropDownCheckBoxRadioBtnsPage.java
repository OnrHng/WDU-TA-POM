package org.cb.ta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownCheckBoxRadioBtnsPage {

  private final WebDriver driver;
  private final WebElement dropDownMenu;
  private final List<WebElement> checkBoxes;
  private final List<WebElement> radioBtns;

  public DropDownCheckBoxRadioBtnsPage(WebDriver driver) {
    this.driver = driver;
    driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

    this.dropDownMenu = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
    this.checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
    this.radioBtns = driver.findElements(By.xpath("//*[@id='radio-buttons']/input[@type='radio']"));
  }

  public WebElement selectAnOptionFromDropDownMenu(String optionName) {
    Select dropDownMenuSelectObj = new Select(dropDownMenu);
    dropDownMenuSelectObj.selectByValue(optionName);
    return dropDownMenuSelectObj.getFirstSelectedOption();
  }

  public List<WebElement> selectACheckBox() {
    return checkBoxes;
  }
  public List<WebElement> getRadioBtns() {
    return radioBtns;
  }

}
