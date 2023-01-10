package Demo_Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Activity_page {
    WebDriver driver;
    By CustomTitle=new AppiumBy.ByAccessibilityId("Custom Title");

    public Activity_page(WebDriver driver) {

        this.driver = driver;
    }

    public CustomTitle_page clickOn_CustomTitle_Btn() {
        driver.findElement(CustomTitle).click();
        return new CustomTitle_page(driver);
    }
}
