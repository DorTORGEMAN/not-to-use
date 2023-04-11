package TEST;
import Flows.LoginFlow;
import PageObject.HomePage;
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
        PageFactory.initElements(driver,this);////find all element in website
        HomePage.ClickOnPopLogin();
        LoginFlow.LoginFlow(null,null);
    }
    @Test
    public void test04_Pick_GIFT() throws InterruptedException {
        PageFactory.initElements(driver,this);////find all element in website
        pickPrice("ils750Up");//it Works but still don't change it because only about it, I did test
        pickLocation("South");//it Works but still don't change it because only about it, I did test
        PickCategory("giftCard restaurant chef");//it Works but still don't change it because only about it, I did test
        Click(HomeFindGift);
    }

    }

