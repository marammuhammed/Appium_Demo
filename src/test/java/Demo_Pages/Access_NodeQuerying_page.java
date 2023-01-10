package Demo_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Access_NodeQuerying_page {
    WebDriver driver;
    By checkList = By.xpath("(//android.widget.CheckBox[@resource-id=\"io.appium.android.apis:id/tasklist_finished\"])[3]");

    public Access_NodeQuerying_page(WebDriver driver) {
        this.driver = driver;
    }
    public Access_NodeQuerying_page clickOn_Checkbox_Btn() {
        driver.findElement(checkList).click();
        return this;
    }
    public String getCheckBox_Text() {

      return   driver.findElement(checkList).getAttribute("checked");
    }

}
