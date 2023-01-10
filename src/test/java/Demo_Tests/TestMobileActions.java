package Demo_Tests;

import Demo_Pages.Access_Nodeprovider_page;
import Demo_Pages.Accessibility_Page;
import Demo_Pages.HomePage_Page;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class TestMobileActions {
    WebDriver driver;

    @BeforeMethod
    public void setupDevice() throws MalformedURLException {
        //String AppName = System.getProperty("user.dir") + "\\src\\test\\resources\\TestDataFiles\\ApiDemos-debug.apk";
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:deviceName", "OPPO A53");
        caps.setCapability("appium:app", "C:\\Users\\khailm\\OneDrive - Vodafone Group\\Desktop\\ApiDemos-debug.apk");
        caps.setCapability("appium:platformVersion", "11");
        caps.setCapability("appium:automationName", "UiAutomator2");
        driver = new AndroidDriver(new URL("http://localhost:4723/"), caps);
    }

    @Test
    public void testClickAction() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String Text =  new HomePage_Page(driver)
                .clickOnAccesssibility_Btn()
                .clickOn_Accesssibility_NodeProvider_Btn()
                .getAccessability_Text();
        Assert.assertEquals(Text,"Accessibility/Accessibility Node Provider");
    }

    @Test
    public void testTyping() {
        // Navigate to APP ,activity , custom title , type "Appium" and check If the text written or not
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String TextTyping =new HomePage_Page(driver)
                .clickOn_APP_Btn()
                .clickOn_Activity_Btn()
                .clickOn_CustomTitle_Btn()
                .Delete_leftFieldText()
                .enterAppium()
                .ClickON_ChangeLeft_Btn()
                .getLeftfield_Text();
        Assert.assertEquals(TextTyping, "Appium");
    }

    @Test
    public void testCheckBox() {
        // Navigate to Access'ibility , Accessibility Node Querying , click on any checkbox and validate that the checkbox is checked
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String CheckBox= new HomePage_Page(driver)
                .clickOnAccesssibility_Btn()
                .clickOn_Accesssibility_NodeQuerying_Btn()
                .clickOn_Checkbox_Btn()
                .getCheckBox_Text();
        Assert.assertEquals(CheckBox,"true");

    }

    @Test
    public void testScrolling() {
        // Navigate to Graphics , scaleToFit and click on it and check If it's scrolled and clicked or not
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String Scale_To_Test= new HomePage_Page(driver)
                .clickOn_Graphics_Btn()
                .ScrollingDown_choose_Scaletofit()
                .clickOn_ScaleToFit_Btn()
                .get_Graphics_ScaleToFit_Text();
        Assert.assertEquals(Scale_To_Test,"Graphics/ScaleToFit");

    }

    @Test
    public void testSwiping() {
        // Navigate to Graphics , Vertices , Swipe right on the photo and then swipe left
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        new HomePage_Page(driver)
                .clickOn_Graphics_Btn()
                .ScrollingDown_choose_Vertices()
                .clickOn_Vertices_Btn()
                .Swiping_left()
                .Swiping_Right();
    }

    @Test
    public void testRadioButton() {
        // Navigate to Views , Radio Group , click on any radio button and check If it's selected or not
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String BreakFast_RadioButton =  new HomePage_Page(driver)
                .clickOn_Views_Btn()
                .ScrollingDown_choose_RadioGroup()
                .clickOn_RadioGroup_Btn()
                .clickOn_Breakfast_Checkbox()
                .getBreakfast_Checkbox_Text();
        Assert.assertEquals(BreakFast_RadioButton,"true");
    }


    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
