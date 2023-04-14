package TEST;
import Flows.LoginFlow;
import PageObject.HomePage;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.support.PageFactory;
import static PageObject.BasePage.Click;
import static PageObject.BasePage.driver;
import static PageObject.HomePage.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestHome extends TestBase {
    public TestHome() {
        super();
    }
    @Test
    public void test03_Login_to_USER() throws Exception {
        MyTests = extent.startTest(" test03_Login_to_USER");
        MyTests.log(LogStatus.INFO, "Test started", "Details:test03:Login to USER");
        PageFactory.initElements(driver,this);////find all element in website
        HomePage.ClickOnPopLogin();
        MyTests.log(LogStatus.INFO, "Step 2", "Fill in login details");
        LoginFlow.LoginFlow(null,null);////Fill in login details
        MyTests.log(LogStatus.PASS, "Test is successful");
        takeScreenShot("C:/Users/power play/IdeaProjects/Final_Ex_AutomationCorse/TestScreenShots/test03 Login to USER",true);
    }
    @Test
    public void test04_Pick_GIFT() throws InterruptedException {
        MyTests = extent.startTest(" test04_Pick_GIFT");
        MyTests.log(LogStatus.INFO, "Test started", "Details:test04:Pick GIFT");
        PageFactory.initElements(driver,this);////find all element in website
        MyTests.log(LogStatus.INFO, "Step 2", "pick price");
        pickPrice("ils750Up");//it Works but still don't change it because only about it, I did test
        MyTests.log(LogStatus.INFO, "Step 3", "pick Location");
        pickLocation("South");//it Works but still don't change it because only about it, I did test
        MyTests.log(LogStatus.INFO, "Step 4", "pick Category and click on search");
        PickCategory("giftCard restaurant chef");//it Works but still don't change it because only about it, I did test
        Click(HomeFindGift);
        MyTests.log(LogStatus.PASS, "Test is successful");
        takeScreenShot("C:/Users/power play/IdeaProjects/Final_Ex_AutomationCorse/TestScreenShots/test04 Pick GIFT",true);
    }

}

