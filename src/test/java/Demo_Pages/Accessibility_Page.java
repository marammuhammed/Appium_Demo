package Demo_Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Accessibility_Page {
    WebDriver driver;
    By AccessNodePro=new AppiumBy.ByAccessibilityId("Accessibility Node Provider");
    By AccessNodeQuerying=new AppiumBy.ByAccessibilityId("Accessibility Node Querying");

    public Accessibility_Page(WebDriver driver) {

        this.driver = driver;
    }
    public Access_Nodeprovider_page clickOn_Accesssibility_NodeProvider_Btn() {
        driver.findElement(AccessNodePro).click();
        return new Access_Nodeprovider_page(driver);


    }
    public Access_NodeQuerying_page clickOn_Accesssibility_NodeQuerying_Btn() {
        driver.findElement(AccessNodeQuerying).click();
        return new Access_NodeQuerying_page(driver);

    }
    public void getAccessability_Text() {

        driver.findElement(AccessNodePro).getText();
    }

}
