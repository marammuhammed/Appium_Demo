package Demo_Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Access_Nodeprovider_page {
    WebDriver driver;

    By AccessNodePro=By.xpath("//android.widget.TextView[@text='Accessibility/Accessibility Node Provider']");
    public Access_Nodeprovider_page(WebDriver driver) {

        this.driver = driver;
    }

    public String getAccessability_Text() {

      return   driver.findElement(AccessNodePro).getText();

    }

}
