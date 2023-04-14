package PageObject;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import static TEST.TestBase.MyTests;
public class BasePage {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public BasePage() {}

    //------Methods-----//
    public static void Browser(String Browser) {
        switch (Browser) {
            case "firefox": {
                System.setProperty("web-driver.gecko.driver", "C:/קורס אוטומציה/firefox_driver/geckodriver.exe");
                driver = new FirefoxDriver();
            }break;
            case "chrome": {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
                driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
            } break;}}



    public static void Click(By by) {
        wait = new WebDriverWait(driver,Duration.ofSeconds(70));
        WebElement SomeElement = wait.until(ExpectedConditions.elementToBeClickable(by));
        SomeElement.click();}


    public static void SendKEY(By by,String Text) {
        WebElement SomeElement = driver.findElement(by);
        SomeElement.sendKeys(Text);}

    public static void ClearText(By by){
        WebElement CLEARtext=driver.findElement(by);
        CLEARtext.clear();}

    public static void SelectInList(By by, String text){
        WebElement SelectedComboList = driver.findElement(by);
        Select Selectcombo = new Select(SelectedComboList);
        Selectcombo.selectByVisibleText(text);}

    public static void SelectCheckBox(By by) {
        boolean CheckBox = driver.findElement(by).isSelected();
        if (!CheckBox)
            driver.findElement(by).click();}

    public static String takeScreenShot(String ImagePath, boolean testPassed){
        TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
        File screenShotFile=takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile=new File(ImagePath+ ".png");
            try{FileUtils.copyFile(screenShotFile,destinationFile);
            if(!testPassed){
                MyTests.log(LogStatus.FAIL,"Test Failed",MyTests.addScreenCapture(ImagePath+".png"));
            }else{
                MyTests.log(LogStatus.PASS,"Test Passed",MyTests.addScreenCapture(ImagePath+".png"));}
        }catch (ExceptionInInitializerError | IOException e) {
            System.out.println(e.getMessage());
        }return ImagePath+".png";}
}

