package TEST;

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
        pickPrice("ils750Up");//it Works but still don't change it because only about it, I did test
        pickLocation("South");//it Works but still don't change it because only about it, I did test
        Thread.sleep(12);
        PickCategory("giftCard restaurant chef");//it Works but still don't change it because only about it, I did test
        Thread.sleep(12);
        Click(HomeFindGift);
        Thread.sleep(10);
        String ActualUrl= driver.getCurrentUrl();
        System.out.println(ActualUrl);
        String ExpectedUrl="https://buyme.co.il/search?budget=6&category=16&region=12";
        Assert.assertEquals(ExpectedUrl,ActualUrl);}
    @Test
    public void test_06_SelectBusinessAndHowMuchMoney() {
        PickBusinessGift("BuyME-KOSHER").
        InputMoneyAndSubmit("800");
    }
    @Test
    public void test_07_SelectWhoGetGiftAndEvent() {
        WhoGetAGift("Someone Else").///Select Who get a gift
        NameWhoGetAgift("Marsel")./// Name who get gift
        WhatHisAEvent("HappyBirthDay")./// Select Event for Gift
        BlessingText("מזל טוב 140 שיהיה מלא אושר ובריאות");///Field Text for Input Blessing

        //SelectInList(Gift_ForWhat,"יום נישואין"); Some reason it not work But I Going to DO some else
    }
    @Test
    public void test_08_MediaFile() {//Add Image and do Submit
        SendKEY(Gift_TakeSomeMediaFile, "C:\\Users\\power play\\IdeaProjects\\Final_Ex_AutomationCorse\\HappyBirthDay\\BirthdayMeme2.jpg");
        ClickONNextStageSubmit1();
    }
    @Test
    public void test_09_WhoASenderAGiftAndHow() throws Exception {
    final String emailFriend=UserFromFile("emailFriend");
    ClickSms("0515411111").
    ClickEmail(emailFriend).
    NameASender("dodo");
    final String yourPhoneNumber=UserFromFile("phonedemo");
    yourPhoneNumber(yourPhoneNumber).
            ClickONNextStagePay2();
    }


}

