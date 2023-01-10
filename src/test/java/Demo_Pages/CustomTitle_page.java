package Demo_Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomTitle_page {
    WebDriver driver;
  By  Left_Field =new By.ByXPath("//android.widget.EditText[@content-desc=\"Left is best\"]");
  By Change_Left_btn=new AppiumBy.ByAccessibilityId("Change Left");

    public CustomTitle_page(WebDriver driver) {

        this.driver = driver;
    }


    public CustomTitle_page Delete_leftFieldText() {

        driver.findElement(Left_Field).clear();
        return this;
    }
    public CustomTitle_page enterAppium(){
        driver.findElement(Left_Field).sendKeys("Appium");
        return this;

    }
    public CustomTitle_page ClickON_ChangeLeft_Btn() {

        driver.findElement(Change_Left_btn).click();
        return this;
    }
    public String getLeftfield_Text() {

       return driver.findElement(Left_Field).getText();
    }

}
