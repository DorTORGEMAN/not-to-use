package TEST;

import com.relevantcodes.extentreports.LogStatus;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static Data.UserData.UserFromFile;
import static PageObject.BasePage.Click;
import static PageObject.BasePage.driver;
import static PageObject.GiftPage.SendKEY;
import static PageObject.GiftPage.*;
import static PageObject.HomePage.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestGift extends TestBase{
    public TestGift() {
        super();
    }

   @Test
   public void test_05_AssertUrl() throws Exception {
        MyTests = extent.startTest(" test 05:AssertUrl");
        MyTests.log(LogStatus.INFO, "Test started", "Details:test 05:AssertUrl");
        pickPrice("ils750Up");//it Works but still don't change it because only about it, I did test
        pickLocation("South");//it Works but still don't change it because only about it, I did test
        Thread.sleep(12);
        PickCategory("giftCard restaurant chef");//it Works but still don't change it because only about it, I did test
        MyTests.log(LogStatus.INFO, "Step 1", "pick price\nand pick Location\n and pick Category and do submit");
        Thread.sleep(12);
        Click(HomeFindGift);
        Thread.sleep(10);
        MyTests.log(LogStatus.INFO, "Step 2", "Check if Url is change and do Assert to new Url");
        String ActualUrl= driver.getCurrentUrl();
        System.out.println(ActualUrl);
        String ExpectedUrl="https://buyme.co.il/search?budget=6&category=16&region=12";
        Assert.assertEquals(ExpectedUrl,ActualUrl);
        MyTests.log(LogStatus.PASS, "Test is successful");
        takeScreenShot("C:/Users/power play/IdeaProjects/Final_Ex_AutomationCorse/TestScreenShots/test 05 AssertUrl",true);}
    @Test
    public void test_06_SelectBusinessAndHowMuchMoney() {
        MyTests = extent.startTest(" test 06:Select Business And and put much money");
        MyTests.log(LogStatus.INFO, "Test started", "Details:test 06: Select Business and put much money ");
        PickBusinessGift("BuyME-KOSHER").
        InputMoneyAndSubmit("800");
        MyTests.log(LogStatus.PASS, "Test is successful");
        takeScreenShot("C:/Users/power play/IdeaProjects/Final_Ex_AutomationCorse/TestScreenShots/test 06 Select Business and put much money",true);
    }
    @Test
    public void test_07_SelectWhoGetGiftAndEvent() {
        MyTests = extent.startTest(" test 07:Select Who Get Gift And Event");
        MyTests.log(LogStatus.INFO, "Test started", "Details:test 07:Select Who Get Gift And What is Event " +
                "and enter Blessing");
        WhoGetAGift("Someone Else").///Select Who get a gift
        NameWhoGetAgift("Marsel")./// Name who get gift
        WhatHisAEvent("HappyBirthDay")./// Select Event for Gift
        BlessingText("מזל טוב 140 שיהיה מלא אושר ובריאות");///Field Text for Input Blessing
        MyTests.log(LogStatus.PASS, "Test is successful");
        takeScreenShot("C:/Users/power play/IdeaProjects/Final_Ex_AutomationCorse/TestScreenShots/test 07 Select Who Get Gift And Event",true);
        //SelectInList(Gift_ForWhat,"יום נישואין"); Some reason it not work But I Going to DO some else
    }
    @Test
    public void test_08_MediaFile() {//Add Image and do Submit
        MyTests = extent.startTest(" test 08: Media File");
        MyTests.log(LogStatus.INFO, "Test started", "Details:test 08:Select file Image in you computer and upload to website");
        SendKEY(Gift_TakeSomeMediaFile, "C:\\Users\\power play\\IdeaProjects\\Final_Ex_AutomationCorse\\HappyBirthDay\\BirthdayMeme2.jpg");
        takeScreenShot("C:/Users/power play/IdeaProjects/Final_Ex_AutomationCorse/TestScreenShots/test 08 Media File",true);
        ClickONNextStageSubmit1();
        MyTests.log(LogStatus.PASS, "Test is successful");
    }
    @Test
    public void test_09_WhoASenderAGiftAndHow() throws Exception {
    MyTests = extent.startTest(" test 09:Who A Sender A Gift And How");
    MyTests.log(LogStatus.INFO, "Test started", "Details:test 09:put in entered Name Who Sender Gift And Select A Way To Send gift  ");
    final String EMAILFRIEND=UserFromFile("emailFriend");
    ClickSms("0515411111").
    ClickEmail(EMAILFRIEND).
    NameASender("dodo");
    final String yourPhoneNumber=UserFromFile("phonedemo");
    yourPhoneNumber(yourPhoneNumber).
            ClickONNextStagePay2();
    MyTests.log(LogStatus.PASS, "Test is successful");
    takeScreenShot("C:/Users/power play/IdeaProjects/Final_Ex_AutomationCorse/TestScreenShots/test 09 Who A Sender A Gift And How",true);
    }


}

