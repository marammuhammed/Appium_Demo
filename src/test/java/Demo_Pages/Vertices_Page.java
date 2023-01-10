package Demo_Pages;

import actions.MobileActions;
import actions.MobileActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Vertices_Page {
    WebDriver driver;
    By Graphics_Vertices=By.xpath("//android.view.View[@class='android.view.View']");
    public Vertices_Page(WebDriver driver) {

        this.driver = driver;
    }
    public Vertices_Page Swiping_left(){
        MobileActions.swipeLeftOnElement(Graphics_Vertices);
        return this;
    }
    public Vertices_Page Swiping_Right(){
        MobileActions.swipeRightOnElement(Graphics_Vertices,driver);
        return this;
    }
}
