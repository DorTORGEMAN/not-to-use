package TEST;
import PageObject.HomePage;
import PageObject.LoginPage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import static PageObject.BasePage.driver;
public class TestLogin extends TestBase{
    public TestLogin() {
        super();
    }
    @Test
    public void test02_Assert_Null_EmailandPassword_Massager(){
        PageFactory.initElements(driver,this);////find all element in website
        HomePage.ClickOnPopLogin();
        LoginPage.ClickOnConnectedToUSER();
        LoginPage.AssertErrorPassAndMail();
        LoginPage.ClickOnClosePopLogin();
    }



}
