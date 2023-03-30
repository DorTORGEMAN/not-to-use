package TEST;

import org.junit.BeforeClass;

import java.util.concurrent.TimeUnit;

import static PageObject.BasePage.Browser;
import static PageObject.BasePage.driver;

public class TestBase {
    @BeforeClass
    public static void SetUp() throws Exception {
        Browser("chrome");
        final String URL_WEBSITE=Data.LoginData.BrowserFromFile("url");
        driver.get(URL_WEBSITE);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
    }
}
