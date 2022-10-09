package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.ShopConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;


public class ShopResultService extends ActionManager {

    public static WebElement outStock() {
        WebElement stock = getElement(ShopConstants.OUT_STOCK);
        return stock;
    }

    public static void outStockDisplayed() {
        Assert.assertTrue(outStock().isDisplayed());
    }

    public static String prodAndroid(){
       String android=getElement(ShopConstants.ANDROID_PROD).getAttribute("title");
       return android;
    }

    public static void verifyResults(){
        Assert.assertEquals(prodAndroid(), "Android Quick Start Guide");
    }


}