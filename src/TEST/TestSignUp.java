package TEST;

import Flows.SignUpFlow;
import PageObject.*;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import static PageObject.BasePage.driver;


public class TestSignUp extends TestBase{

    @Test
    public void Test01_Register_to_Buyme() throws Exception {
        PageFactory.initElements(driver,this);
        HomePage.ClickOnPopLogin();
        LoginPage.ClickSignUp();
        SignUpFlow.SignUpFlow(null,null,null,null);
        SignUpPage.verifyPasswords().verifyFirstName("dor").SignUp_ClickOnAgreeBOX();


                 //.ClickOnCreateUser();

    }
}
