package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public static By EmailLogin = By.cssSelector("input[placeholder='מייל']");
    public static By PasswordLogin = By.cssSelector("input[required type='password']");
    public static By ForgetPasswordLogin = By.cssSelector("u [class='bm-body-2 text-link theme db']+ u:contains('שכחתי את הסיסמה') ");
    public static By FaceBookLogin = By.cssSelector("div [aria-label='התחבר באמצעות facebook']");
    public static By GoogleLogin = By.cssSelector("div [aria-label='התחבר באמצעות google']");
    public static By CloseLogin = By.cssSelector("span [alt='סגירה' title='סגירה']");
    public static By RememberMeLogin = By.cssSelector("div [aria-labelledby='זכור אותי']span[class='circle']");
    public static By LoginToUSER = By.cssSelector("button [gtm='כניסה ל-BUYME']");
    public static By RegisterLogin = By.cssSelector("span[class='text-link theme']");

    public LoginPage(WebDriver driver) {
        super();
    }

    public static void ClickSignUp() {
        Click(LoginPage.RegisterLogin);
    }
}