package PageObject;

import org.openqa.selenium.By;

public class HomePage extends BasePage {
   public static By HomeLoginPopup= By.className("notSigned");
   public By HomeSelectSUM= By.cssSelector("spin[alt='סכום']");
   public By HomeSelectLocation=By.cssSelector("span[alt='אזור']");
   public By HomeSelectCategory=By.cssSelector("span[alt='קטגוריה']");
   public By HomeTextZoneGift=By.cssSelector("input[aria-label='איזו מתנה תרצו לחפש?']");
  private  By HomeFindGift=By.className("ember-view bm-btn no-reverse main md ember-view");

    public HomePage() {
        super();
    }




    public static void ClickOnPopLogin(){
        Click(HomePage.HomeLoginPopup);
    }
}
