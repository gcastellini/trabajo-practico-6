package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.GoogleConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.util.List;
import java.util.Objects;


public class GoogleSearchResultService extends ActionManager {

    public static List<WebElement> stats() {
        List<WebElement> allElements = getElements(GoogleConstants.STATS_ID,String.valueOf(1));
        for (int i = 2; i <= 3; i++) {
            allElements.add(getElement(GoogleConstants.STATS_ID, String.valueOf(i)));
        }
        return allElements;
    }

    public static int getStats() {
        return stats().size();
    }

    public static void verifyResults(){
        Assert.assertEquals(getStats(), 3);
    }


}
