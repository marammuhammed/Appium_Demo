package Demo_Pages;

import actions.MobileActions;
import actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Graphics_Page {
    WebDriver driver;
    By Scaletofit =new AppiumBy.ByAccessibilityId("ScaleToFit");
    By Vertices =new AppiumBy.ByAccessibilityId("Vertices");
    public Graphics_Page(WebDriver driver){
        this.driver=driver;
    }
  public Graphics_Page ScrollingDown_choose_Scaletofit(){
      new MobileActions(driver);
      MobileActions.scrollDownToSpecificText("ScaleToFit");
      return this;
  }
    public ScaleToFit_Page clickOn_ScaleToFit_Btn() {
        driver.findElement(Scaletofit).click();
        return new ScaleToFit_Page(driver);
    }

    public Graphics_Page ScrollingDown_choose_Vertices(){
        new MobileActions(driver);
        MobileActions.scrollDownToSpecificText("ScaleToFit");
        return this;
    }
    public Vertices_Page clickOn_Vertices_Btn() {
        driver.findElement(Scaletofit).click();
        return new Vertices_Page(driver);
    }

}
