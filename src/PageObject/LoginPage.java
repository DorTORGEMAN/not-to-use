package PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
//------Web Elements-----//
public class LoginPage extends BasePage {
    public static By EmailLogin=By.cssSelector("input[placeholder='מייל']");
    public static By PasswordLogin=By.cssSelector("input[type='password']");
    public static By CloseLogin=By.cssSelector("span[alt='סגירה'][title='סגירה']");
    public static By LoginToUSER=By.cssSelector("button[type='submit'][gtm='כניסה ל-BUYME']");
    public static By RegisterLogin=By.cssSelector("span[class='text-link theme']");
    public static By MassageNullPasswordLogin=By.cssSelector("input[placeholder='סיסמה']+.parsley-errors-list");//if you put input something invalid you get some red error massage and elemant get tag ul .parsley-errors-list
    public static By MassageNullEmailLogin=By.cssSelector("input[placeholder='מייל']+.parsley-errors-list");//if you put input something invalid you get some red error massage and elemant get tag ul .parsley-errors-list
//------Methods-----//

    public LoginPage() {
        super();
    }

    public static void ClickSignUp() {
        Click(LoginPage.RegisterLogin);
    }

    public static void ClickOnConnectedToUSER(){
        Click(LoginPage.LoginToUSER);
    }
    public static void ClickOnClosePopLogin(){
        Click(CloseLogin);
    }
    public static LoginPage AssertErrorPassAndMail(){
        String emailErrorMessage = driver.findElement(MassageNullEmailLogin).getText();
        String passwordErrorMessage = driver.findElement(MassageNullPasswordLogin).getText();
        Assert.assertEquals(emailErrorMessage,"כל המתנות מחכות לך! אבל קודם צריך מייל וסיסמה");
        Boolean ErrorMail=driver.findElement(MassageNullEmailLogin).isDisplayed();
        System.out.println("Mail Error is Displayed:"+ErrorMail+"\nMail Error:"+emailErrorMessage);
        Assert.assertEquals(passwordErrorMessage,"כל המתנות מחכות לך! אבל קודם צריך מייל וסיסמה");
        Boolean ErrorPassword=driver.findElement(MassageNullPasswordLogin).isDisplayed();
        System.out.println("password Error is Displayed:"+ErrorPassword+"\npassword Error:"+passwordErrorMessage);
        return new LoginPage();}
    public static LoginPage SetUp_Email() throws Exception {
        final String EMAIL = Data.UserData.UserFromFile("email");
        SendKEY(EmailLogin,EMAIL);
        return new LoginPage();
    }

    public static LoginPage SetUp_Password() throws Exception {
        final String PASSWORD = Data.UserData.UserFromFile("password");
        SendKEY(PasswordLogin,PASSWORD);
        return new LoginPage();
    }
}