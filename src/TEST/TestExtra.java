package TEST;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static PageObject.BasePage.driver;
import static PageObject.GiftPage.*;

public class TestExtra extends TestBase{
    public TestExtra() {
        super();
    }

    @Test
    public void test00_dotEXTRA(){////for catch dot you must refresh Page 3x-4 times before it open website
        WebElement spinner = driver.findElement(By.cssSelector(".spinner > div"));
        int height = spinner.getSize().getHeight();
        int width = spinner.getSize().getWidth();
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
    }

    @Test
    public void test01_ColorToWhoSEND() {
        driver.get("https://buyme.co.il/money/4299680?price=800");
        PageFactory.initElements(driver,this);////find all element in website
        WebElement ToWhoSend = driver.findElement(By.cssSelector("div.label.bottom-xs"));
        String color = ToWhoSend.getCssValue("color");
        Assert.assertEquals("rgb(255, 161, 38)", color);
        String Text = ToWhoSend.getText();
        System.out.println(Text+" Color is:"+color);
    }
    @Test
    public void test02() {//Some reason every input is null But still all work
        PageFactory.initElements(driver,this);////find all element in website
                NameWhoGetAgift("Marsel").
                WhatHisAEvent("HappyBirthDay").
                NameWhoGetAgift("Marsel").
                BlessingText("מזל טוב 140 שיהיה מלא אושר ובריאות");
                String WhoGet=driver.findElement(Gift_NameWhoGet).getAttribute("Value");
                String Blessing=driver.findElement(Gift_BlessingText).getAttribute("Value");
                ClickONNextStageSubmit1();
                NameASender("dodo");
                String Sender=driver.findElement(Gift_NameAGiverGift).getAttribute("Value");
                System.out.println("WHO GET:"+WhoGet+"\nBlessing:"+Blessing+"\nNameASender:"+Sender);
    }



}
