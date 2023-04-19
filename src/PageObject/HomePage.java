package PageObject;

import org.openqa.selenium.By;
//------Web Elements-----//
public class HomePage extends BasePage {
    public static By HomeLoginPopup= By.className("notSigned");
    public static By HomeSelectPrice= By.cssSelector("span.selected-text[title='סכום'][alt='סכום']");

    public static By HomeSelectLocation=By.cssSelector("span.selected-text[alt='אזור']");
    public static By HomeSelectCategory=By.cssSelector("span.selected-text[alt='קטגוריה']");

    public static By HomeFindGift=By.partialLinkText("תמצאו לי מתנה");

//------Methods-----//


    public HomePage() {
        super();
    }

    public static HomePage pickPrice(String price) throws InterruptedException {
        Click(HomeSelectPrice);
        switch (price){////select not work some reason So I think maybe switch work
            case "ils99":{
                Thread.sleep(25);
                Click(By.cssSelector("li[value='1'][uaindex='1']"));
            }break;
            case "ils200-299":{
                Thread.sleep(25);
                Click(By.cssSelector("li[value='3'][uaindex='3']"));
            }break;
            case "ils100-199":{Thread.sleep(12);
                Click(By.cssSelector("li[value='2'][uaindex='2']"));
            }break;
            case "ils300-399":{
                Thread.sleep(25);
                Click(By.cssSelector("li[value='4'][uaindex='4']"));}break;
            case "ils500-750":{
                Thread.sleep(25);
                Click(By.cssSelector("li[value='5'][uaindex='5']"));}break;
            case "ils750Up":{
                Thread.sleep(25);
                Click(By.cssSelector("li[value='6'][uaindex='6']"));}break;
        }return null;
    }
    public static HomePage pickLocation(String location) throws InterruptedException {
        Click(HomeSelectLocation);
        switch (location){
            case "Center":{
                Thread.sleep(12);
                Click(By.cssSelector("li[value='11'][uaindex='1']"));
            } break;
            case "Tel aviv":{
                Thread.sleep(12);
                Click(By.cssSelector("li[value='13'][uaindex='2']"));
            } break;
            case "North":{
                Thread.sleep(12);
                Click(By.cssSelector("li[value='9'][uaindex='3']"));
            } break;
            case "South":{
                Thread.sleep(12);
                Click(By.cssSelector("li[value='12'][uaindex='4']"));
            } break;
            case "Jerusalem":{
                Thread.sleep(12);
                Click(By.cssSelector("li[value='14'][uaindex='5']"));
            } break;
        }return null;
    }
    public static HomePage PickCategory(String PickCategory) throws InterruptedException {
        Click(HomeSelectCategory);
        switch (PickCategory) {

            case "giftCard restaurant chef": {
                Thread.sleep(12);
                Click(By.cssSelector("li[value='16'][uaindex='4']"));
            }break;
            case "hotels":{
                Thread.sleep(12);
                Click(By.cssSelector("li[value='315'][uaindex='11']"));
            }
        }return null;
    }


    public static HomePage ClickOnPopLogin(){
        Click(HomePage.HomeLoginPopup);
        return null;
    }
}
