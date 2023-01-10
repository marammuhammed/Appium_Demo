package Demo_Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class APP_Page {
    WebDriver driver;
    By Activity = new AppiumBy.ByAccessibilityId("Activity");

    public APP_Page(WebDriver driver) {
        this.driver = driver;
    }

    public Activity_page clickOn_Activity_Btn() {
        driver.findElement(Activity).click();
        return new Activity_page(driver);
    }
}
