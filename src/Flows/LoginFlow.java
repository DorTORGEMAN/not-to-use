package Flows;

import static PageObject.LoginPage.*;

public class LoginFlow {
    public static void LoginFlow(String Email,String Password) throws Exception {
        if (Email == null){
            SetUp_Email();}
        if (Password == null){
            SetUp_Password();}
        ClickOnConnectedToUSER();}

    }
