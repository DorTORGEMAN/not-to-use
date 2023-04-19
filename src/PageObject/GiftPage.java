package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
//------Web Elements-----//
public class GiftPage extends BasePage {
    protected static By Gift_BUYME_CHEF = By.cssSelector("a[href='https://buyme.co.il/supplier/752649?budget=6&category=16&query=&region=12']");
    protected static By Gift_BUYME_KOSHER = By.cssSelector("a[href='https://buyme.co.il/supplier/4299680?budget=6&category=16&query=&region=12']");
    public static By Gift_chose = By.cssSelector("button[type='submit'][gtm='בחירה']");
    public static By Gift_InputMONEY = By.cssSelector("input[placeholder='הכנס סכום']");
    public static By WhoGet_Else = By.cssSelector("div.button-forSomeone");
    public static By WhoGet_ME = By.cssSelector("div.button-forMyself");
    public static By Gift_NameWhoGet = By.cssSelector("input[data-parsley-required-message='מי הזוכה המאושר? יש להשלים את שם המקבל/ת']");
    public static By Gift_ForWhat = By.cssSelector("span[alt='לאיזה אירוע?'][aria-label='לאיזה אירוע?']");
    public static By Gift_BlessingText=By.cssSelector("textarea[data-parsley-group='voucher-greeting']");
    public static By Gift_TakeSomeMediaFile=By.cssSelector("input[accept='image/png,image/jpeg,video/quicktime,video/mp4,.mov,.qt']");
    public static By Gift_SubmitToNextStage1=By.cssSelector("button[type='submit'][gtm='המשך']");
    public static By Gift_NameAGiverGift=By.cssSelector("input[placeholder='שם שולח המתנה'][required][type='text']");
    public static By Gift_WayEmail=By.cssSelector("div.toggle-icon > div.circle-area > svg.method-icon[gtm='method-email']");
    public static By Gift_WaySMS=By.cssSelector("div.toggle-icon > div.circle-area > svg.method-icon[gtm='method-sms']");
    public static By Gift_InputEmail=By.id("email");
    public static By Gift_InputSms=By.id("sms");
    public static By Gift_InputYouPhone=By.cssSelector("input[placeholder='מספר נייד'][data-parsley-mobile='mobile']");
    public static By Gift_SubmitToNextStage2=By.cssSelector("button[type='submit'][gtm='המשך לתשלום']");

    public GiftPage() {
        super();
    }
    //------Methods-----//
    public static GiftPage PickBusinessGift(String GIFT) {
        switch (GIFT) {
            case "BuyME-CHEF": {
                Click(Gift_BUYME_CHEF);
                // driver.get("https://buyme.co.il/supplier/752649?budget=6&category=16&query=&region=12");
            }
            break;
            case "BuyME-KOSHER": {
                Click(Gift_BUYME_KOSHER);
                //driver.get("https://buyme.co.il/supplier/4299680?budget=6&category=16&query=&region=12");
            }
        }
    return null;
    }

    public static GiftPage InputMoneyAndSubmit(String MONEY) {
        SendKEY(Gift_InputMONEY,MONEY);
        Click(Gift_chose);
        return new GiftPage();
    }

    public static GiftPage WhoGetAGift(String somebody) {
        switch (somebody) {
            case "Myself": {
                SelectCheckBox(WhoGet_ME);
            }
            break;
            case "Someone Else": {
                SelectCheckBox(WhoGet_Else);
            }
        }
        return null;
    }

    public static GiftPage NameWhoGetAgift(String somebody) {
        ClearText(Gift_NameWhoGet);
        SendKEY(Gift_NameWhoGet, somebody);
        return new GiftPage();
    }

    public static GiftPage WhatHisAEvent(String EVENT) {
        Click(Gift_ForWhat);
        switch (EVENT) {
            case "HappyBirthDay": {
                Click(By.cssSelector("li[uaindex='1'][value='10']"));
            }
            break;
            case "marriage": {
                Click(By.cssSelector("li[uaindex='7'][value='13']"));
            }
    }return null;}
    public static GiftPage BlessingText(String BlessingText){
        ClearText(Gift_BlessingText);
        SendKEY(Gift_BlessingText,BlessingText);
        return new GiftPage();
    }
    public static GiftPage ClickONNextStageSubmit1(){
        WebElement elementToClick = driver.findElement(Gift_SubmitToNextStage1);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", elementToClick);
        return null;}
    public static GiftPage NameASender(String name){
    SendKEY(Gift_NameAGiverGift,name);
        return new GiftPage();
    }
    public static GiftPage ClickSms(String PhoneNumber){
    Click(Gift_WaySMS);
    SendKEY(Gift_InputSms,PhoneNumber);
    return new GiftPage();
    }
    public static GiftPage ClickEmail(String Email){
        Click(Gift_WayEmail);
        SendKEY(Gift_InputEmail,Email);
        return new GiftPage();
    }
    public static GiftPage yourPhoneNumber(String Phone){
    SendKEY(Gift_InputYouPhone,Phone);
        return new GiftPage();
    }
    public static GiftPage ClickONNextStagePay2(){
        WebElement elementToClick = driver.findElement(Gift_SubmitToNextStage2);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", elementToClick);
        return null;}
}

