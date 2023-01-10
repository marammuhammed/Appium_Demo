package Demo_Pages;

import actions.MobileActions;
import actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Views_Page {
    WebDriver driver;
    By Radio_Group =new AppiumBy.ByAccessibilityId("Radio Group");

    public Views_Page(WebDriver driver) {

        this.driver = driver;
    }
    public Views_Page ScrollingDown_choose_RadioGroup(){
        new MobileActions(driver);
        MobileActions.scrollDownToSpecificText("Radio Group");
        return this;
    }
    public RadioGroup_Page clickOn_RadioGroup_Btn() {
        driver.findElement(Radio_Group).click();
        return new RadioGroup_Page(driver);
    }
}
