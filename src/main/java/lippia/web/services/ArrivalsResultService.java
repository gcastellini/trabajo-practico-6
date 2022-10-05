package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.ArrivalsConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.List;


public class ArrivalsResultService extends ActionManager {

    public static List<WebElement> elements() {
        List<WebElement> allElements = getElements(ArrivalsConstants.STATS_ID,String.valueOf(1));
        for (int i = 2; i <= 3; i++) {
            allElements.add(getElement(ArrivalsConstants.STATS_ID, String.valueOf(i)));
        }
        return allElements;
    }

    public static boolean secElements() {
        List<WebElement> allElements = getElements(ArrivalsConstants.STATS_ID,String.valueOf(1));
        try {
            for (int i = 2; i <= 4; i++) {
                allElements.add(getElement(ArrivalsConstants.STATS_ID, String.valueOf(i)));
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
       WebElement description =getElement(ArrivalsConstants.DESCRIPTION);
        return description;
    }

    public static void descDisplayed(){
        Assert.assertTrue(Description().isDisplayed());
    }


}
