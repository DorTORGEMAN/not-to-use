package TEST;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import static PageObject.BasePage.driver;
import static PageObject.GiftPage.*;

public class TestExtra extends TestBase{
    public TestExtra() {
        super();
    }

    @Test
    public void test00_dotEXTRA(){////for catch dot you must refresh before it open website
        MyTests = extent.startTest(" test00:dot EXTRA");
        MyTests.log(LogStatus.INFO, "Test started", "Details:test00 Loading dot EXTRA");
        WebElement spinner=driver.findElement(By.cssSelector(".spinner > div"));
        int height=spinner.getSize().getHeight();
        int width=spinner.getSize().getWidth();
        System.out.println("Height:"+height);
        System.out.println("Width:"+width);
        MyTests.log(LogStatus.PASS, "Test is successful");
        takeScreenShot("C:/Users/power play/IdeaProjects/Final_Ex_AutomationCorse/TestScreenShots/test00 Loading dot EXTRA",true);}


    @Test
    public void test01_ColorToWhoSENDExtra() throws InterruptedException {
        MyTests = extent.startTest(" test01:Color To Who SEND Extra");
        MyTests.log(LogStatus.INFO, "Test started", "Details:test01:Color To Who SEND Extra");
        driver.get("https://buyme.co.il/money/4299680?price=800");
        PageFactory.initElements(driver,this);////find all element in website
        Thread.sleep(Duration.ofSeconds(25,1));
        WebElement ToWhoSend = driver.findElement(By.cssSelector("div.label.bottom-xs"));
        String color = ToWhoSend.getCssValue("color");
        Assert.assertEquals("rgb(255, 161, 38)",color);
        String Text = ToWhoSend.getText();
        System.out.println(Text+" Color is:"+color);
        MyTests.log(LogStatus.PASS, "Test is successful");
        takeScreenShot("C:/Users/power play/IdeaProjects/Final_Ex_AutomationCorse/TestScreenShots/test01 Color To Who SEND Extra",true);}

    @Test
    public void test02Extra () {//Some reason every input is null
        MyTests = extent.startTest(" test02 Extra");
        MyTests.log(LogStatus.INFO, "Test started", "Details:test02");
        PageFactory.initElements(driver, this);////find all element in website
        NameWhoGetAgift("Marsel").
                WhatHisAEvent("HappyBirthDay").
                NameWhoGetAgift("Marsel").
                BlessingText("מזל טוב 140 שיהיה מלא אושר ובריאות");
        String WhoGet = driver.findElement(Gift_NameWhoGet).getAttribute("Value");
        String Blessing = driver.findElement(Gift_BlessingText).getAttribute("Value");
        ClickONNextStageSubmit1();
        NameASender("dodo");
        String Sender = driver.findElement(Gift_NameAGiverGift).getAttribute("Value");
        System.out.println("WHO GET:"+WhoGet+"\nBlessing:"+Blessing+"\nNameASender:"+Sender);
        MyTests.log(LogStatus.PASS, "Test is successful");
        takeScreenShot("C:/Users/power play/IdeaProjects/Final_Ex_AutomationCorse/TestScreenShots/test02",true);}

    protected static String reportFilePath = "C:/Users/power play/IdeaProjects/Final_Ex_AutomationCorse/extent-report.html";
}

