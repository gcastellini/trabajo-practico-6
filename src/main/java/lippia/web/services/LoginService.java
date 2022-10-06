package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.LoginConstants;

public class LoginService extends ActionManager {

    public static void clickAccountButton() {
        click(LoginConstants.ACCOUNT_BUTTON_NAME);
    }
}
