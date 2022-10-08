package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.LoginConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginResultService extends ActionManager {

    public static WebElement welcome(){
        return getElement(LoginConstants.WELCOME_MESSAGE);
    }

    public static WebElement errMessage(){
        return getElement(LoginConstants.ERROR_MESSAGE);
    }

    public static void welcomeDisplayed(){
        Assert.assertTrue(welcome().isDisplayed());}

    public static void errorDisplayed(){
        Assert.assertTrue(errMessage().isDisplayed());
    }
}
