package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.ShopConstants;



public class ShopService extends ActionManager {

        public static void readButton() {click(ShopConstants.READ_MORE);}



        public static void prodCategory(){click(ShopConstants.PROD_CAT);}
}
