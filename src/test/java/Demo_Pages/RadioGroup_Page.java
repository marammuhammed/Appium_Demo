package Demo_Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioGroup_Page {
    WebDriver driver;
    By Breakfast_button =new AppiumBy.ByAccessibilityId("Breakfast");
    public RadioGroup_Page(WebDriver driver) {

        this.driver = driver;
    }

    public RadioGroup_Page clickOn_Breakfast_Checkbox() {
        driver.findElement(Breakfast_button).click();
        return this;
    }
    public String getBreakfast_Checkbox_Text() {

        return   driver.findElement(Breakfast_button).getAttribute("checked");
    }
}
