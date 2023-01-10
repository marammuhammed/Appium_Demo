package Demo_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ScaleToFit_Page {
    WebDriver driver;
    By Graphics_ScaleToFit=By.xpath("//android.widget.TextView[@text='Graphics/ScaleToFit']");
    public ScaleToFit_Page(WebDriver driver){

        this.driver=driver;
    }
    public String get_Graphics_ScaleToFit_Text() {

       return driver.findElement(Graphics_ScaleToFit).getText();
    }
}
