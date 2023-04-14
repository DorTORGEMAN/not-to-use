package TEST;

import Flows.SignUpFlow;
import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.SignUpPage;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import static PageObject.BasePage.driver;
import static PageObject.BasePage.takeScreenShot;

public class TestSignUp extends TestBase{
    public TestSignUp() {
        super();
    }
    @Test
    public void Test01_Register_to_Buyme() throws Exception {
        MyTests = extent.startTest("Test01:Register_to_Buyme");
        MyTests.log(LogStatus.INFO, "Test started", "Details:Test01:Register_to_Buyme");
        PageFactory.initElements(driver,this);
        HomePage.ClickOnPopLogin(); ///OPEN Window of Login
        LoginPage.ClickSignUp();/// Click on signUp
        MyTests.log(LogStatus.INFO, "Step 2", "Fill in registration details");
        SignUpFlow.SignUpFlow(null,null,null,null);
        SignUpPage.verifyPasswords()
                .verifyFirstName("dor")
                .SignUp_ClickOnAgreeBOX()
                 .ClickOnCreateUser();
        MyTests.log(LogStatus.PASS, "Test is successful");
        takeScreenShot("C:/Users/power play/IdeaProjects/Final_Ex_AutomationCorse/TestScreenShots/Test01 Register to Buyme",true);

    }
}
