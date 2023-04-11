package TEST;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import java.util.concurrent.TimeUnit;
import static PageObject.BasePage.Browser;
import static PageObject.BasePage.driver;


public class TestBase {
protected static ExtentReports extent;
protected static ExtentTest MyTests;
protected static String reportFilePath="C:/Users/power play/IdeaProjects/Final_Ex_AutomationCorse/extent-report.html";
    @BeforeClass
    public static void SetUp() throws Exception {
        extent =new ExtentReports(reportFilePath);
        MyTests = extent.startTest("Ready To start");
        Browser("firefox");
        final String URL_WEBSITE=Data.LoginData.BrowserFromFile("url");
        driver.get(URL_WEBSITE);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
    }

    @AfterClass
    public static void FinishTest(){
        extent.endTest(MyTests);
        extent.flush();


    }
}
