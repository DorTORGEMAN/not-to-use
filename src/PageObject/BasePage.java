package PageObject;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePage {
    public static WebDriver driver;

    public BasePage() {
    }


    public static void Browser(String Browser) {
        switch (Browser) {
            case "firefox": {
                System.setProperty("web-driver.gecko.driver", "C:/קורס אוטומציה/firefox_driver/geckodriver.exe");
                driver = new FirefoxDriver();
            }
            break;
            case "chrome": {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
                driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
            }
            break;
        }
    }

    public static void Click(By by) {
        WebElement SomeElement = driver.findElement(by);
        SomeElement.click();
    }

    public static void SendKEY(By by, String Text) {
        WebElement SomeElement = driver.findElement(by);
        SomeElement.sendKeys(Text);
    }

    public void SelectInList(By by, String text) {
        WebElement SelectedComboList = driver.findElement(by);
        Select Selectcombo = new Select(SelectedComboList);
        Selectcombo.selectByValue(text);
    }

    public static void SelectCheckBox(By by) {
        boolean CheckBox = driver.findElement(by).isSelected();
        if (!CheckBox)
            driver.findElement(by).click();
    }

    public void WaitSec20() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(20));
    }

}

