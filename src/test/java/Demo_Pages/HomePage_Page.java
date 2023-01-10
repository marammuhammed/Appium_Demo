package Demo_Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage_Page {
    WebDriver driver;
    By Access = new AppiumBy.ByAccessibilityId("Access'ibility");
    By APP = new AppiumBy.ByAccessibilityId("App");
    By Graphics =new AppiumBy.ByAccessibilityId("Graphics");
    By Views =new AppiumBy.ByAccessibilityId("Views");

    public HomePage_Page(WebDriver driver) {

        this.driver = driver;
    }

    public Accessibility_Page clickOnAccesssibility_Btn() {
        driver.findElement(Access).click();
        return new Accessibility_Page(driver);

    }
    public void getAccessability_Text() {

        driver.findElement(Access).getText();

    }
    public APP_Page clickOn_APP_Btn() {
       driver.findElement(APP).click();
        return new APP_Page(driver);
    }
    public Graphics_Page clickOn_Graphics_Btn() {
        driver.findElement(Graphics).click();
        return new Graphics_Page(driver);
    }
    public Views_Page clickOn_Views_Btn() {
        driver.findElement(Views).click();
        return new Views_Page(driver);

    }

}
