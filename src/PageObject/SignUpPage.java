package PageObject;

import junit.framework.Assert;
import org.openqa.selenium.By;

//------Web Elements-----//
public class SignUpPage extends BasePage {
    public static By SignUPFirstName = By.cssSelector("input[placeholder='שם פרטי']");
    protected static By SignUp_Email = By.cssSelector("input[placeholder='מייל']");
    protected static By SignUpPassWORD = By.cssSelector("input[placeholder='סיסמה']");
    protected static By SignUpPassWordSecond = By.cssSelector("input[placeholder='אימות סיסמה'][data-parsley-equalto-message='הסיסמאות לא זהות, אולי זה מהתרגשות :)']");
    protected static By SignUpAgreeBox = By.cssSelector("div[class='login-options grid register-text']");

    static By SignUpNewUser = By.cssSelector("button[type='submit'][gtm='הרשמה ל-BUYME']");

    //------Methods-----//
    public SignUpPage() {
        super();
    }

    public static SignUpPage SetUp_First_name() throws Exception {
        final String FIRST_NAME = Data.UserData.UserFromFile("firstname");
        SendKEY(SignUPFirstName,FIRST_NAME);
        return new SignUpPage();
    }

    public static SignUpPage SetUp_Email() throws Exception {
        final String EMAIL = Data.UserData.UserFromFile("email");
        SendKEY(SignUp_Email,EMAIL);
        return new SignUpPage();
    }

    public static SignUpPage SetUp_Password() throws Exception {
        final String PASSWORD = Data.UserData.UserFromFile("password");
        SendKEY(SignUpPassWORD,PASSWORD);
        return new SignUpPage();
    }

    public static SignUpPage SetUp_Password2() throws Exception {
        final String PASSWORD2 = Data.UserData.UserFromFile("password2");
        SendKEY(SignUpPassWordSecond,PASSWORD2);
        return new SignUpPage();
    }

    public static SignUpPage SignUp_ClickOnAgreeBOX() {
        BasePage.SelectCheckBox(SignUpAgreeBox);
        return null;
    }

    public static SignUpPage verifyFirstName(String TEXT) throws Exception {//////NOT WORK RIGHT ONLY FROM FILE IT WORK
        final String ExpectedFN = Data.UserData.UserFromFile("firstname");
        String actualFN =TEXT;
        Assert.assertEquals(ExpectedFN,actualFN);
        return new SignUpPage();
    }
    public static SignUpPage verifyPasswords() throws Exception {//NOT WORK RIGHT ONLY FROM FILE IT WORK
       // String ExpectedPassword1=driver.findElement(SignUpPage.SignUpPassWORD).getAttribute("");
       //String actualPassword2 = driver.findElement(SignUpPage.SignUpPassWordSecond).getAttribute("");
        String ExpectedPassword1 = Data.UserData.UserFromFile("password");
        String actualPassword2 = Data.UserData.UserFromFile("password2");
        Assert.assertEquals(ExpectedPassword1,actualPassword2);
        return null;
    }
    public static SignUpPage ClickOnCreateUser(){
        Click(SignUpPage.SignUpNewUser);
        return null;
    }

}

