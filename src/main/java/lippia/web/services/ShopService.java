package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.ShopConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class ShopService extends ActionManager {
   
        public static void readButton() {click(ShopConstants.READ_MORE);}
        public static WebElement outStock(){
                WebElement stock = getElement(ShopConstants.OUT_STOCK);
                return stock;
        }
        public static void outStockDisplayed(){
                Assert.assertTrue(outStock().isDisplayed());
        }

        public static void prodCategory(){click(ShopConstants.PROD_CAT);}
}
