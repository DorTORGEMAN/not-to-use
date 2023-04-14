package TEST;
import PageObject.HomePage;
import PageObject.LoginPage;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import static PageObject.BasePage.driver;
import static PageObject.BasePage.takeScreenShot;

public class TestLogin extends TestBase{
    public TestLogin() {
        super();
    }
    @Test
    public void test02_Assert_Null_EmailandPassword_Massager(){
        MyTests = extent.startTest("test02:Assert Null Email and Password Massager");
        MyTests.log(LogStatus.INFO, "Test started", "Details:Test02: Enters the login window Do not enter email or password ");
        PageFactory.initElements(driver,this);////find all element in website
        HomePage.ClickOnPopLogin();
        LoginPage.ClickOnConnectedToUSER();
        MyTests.log(LogStatus.INFO, "STEP 2","Check if you received error messages in red below the email and below the password " +
                "check if they are both the same and make an assert for them");
        LoginPage.AssertErrorPassAndMail();
        LoginPage.ClickOnClosePopLogin();
        MyTests.log(LogStatus.PASS, "Test is successful");
        takeScreenShot("C:/Users/power play/IdeaProjects/Final_Ex_AutomationCorse/TestScreenShots/test02 Assert Null Email and Password Massager",true);
    }


}
