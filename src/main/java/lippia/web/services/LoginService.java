package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.LoginConstants;

public class LoginService extends ActionManager {

    public static void clickAccountButton() {
        click(LoginConstants.ACCOUNT_BUTTON_NAME);
    }

    public static void enterEmailPass(String email,String password){
        setInput(LoginConstants.EMAIL_INPUT,email);
        setInput(LoginConstants.PASS_INPUT,password);
        click(LoginConstants.LOGIN_BUTTON);

    }
}
