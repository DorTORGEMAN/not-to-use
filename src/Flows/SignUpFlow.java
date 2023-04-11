package Flows;
import PageObject.SignUpPage;
public class SignUpFlow {
    public static SignUpFlow SignUpFlow(String FristName,String Email,String Password,String Password2) throws Exception {
        if (FristName == null) {
            SignUpPage.SetUp_First_name();

        }
        if (Email == null) {
            SignUpPage.SetUp_Email();
        }
        if (Password == null) {
            SignUpPage.SetUp_Password();
        }
        if (Password2 == null) {
            SignUpPage.SetUp_Password2();
        }

    return new SignUpFlow();}
    }



