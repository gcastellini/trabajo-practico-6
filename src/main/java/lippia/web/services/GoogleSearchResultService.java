package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.GoogleConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.List;


public class GoogleSearchResultService extends ActionManager {

    public static List<WebElement> elements() {
        List<WebElement> allElements = getElements(GoogleConstants.STATS_ID,String.valueOf(1));
        for (int i = 2; i <= 3; i++) {
            allElements.add(getElement(GoogleConstants.STATS_ID, String.valueOf(i)));
        }
        return allElements;
    }

    public static boolean secElements() {
        List<WebElement> allElements = getElements(GoogleConstants.STATS_ID,String.valueOf(1));
        try {
            for (int i = 2; i <= 4; i++) {
                allElements.add(getElement(GoogleConstants.STATS_ID, String.valueOf(i)));
            }
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    public static int getStats() {
        return elements().size();
    }

    public static void verifyResults(){
        Assert.assertEquals(getStats(), 3);
        Assert.assertFalse(secElements());
    }

    public static WebElement Description(){
       WebElement description =getElement(GoogleConstants.DESCRIPTION);
        return description;
    }

    public static void descDisplayed(){
        Assert.assertTrue(Description().isDisplayed());
    }


}
