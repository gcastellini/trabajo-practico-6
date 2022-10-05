package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.ArrivalsConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class ArrivalsService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void enterSearchCriteria(String text) {
        setInput(ArrivalsConstants.INPUT_SEARCH_XPATH, text);
    }

    public static void clickSearchButton() {
        click(ArrivalsConstants.SEARCH_BUTTON_NAME);
    }

    public static void clickHomeButton(){click(ArrivalsConstants.HOME_BUTTON_NAME);}

    public static void clickArrivals(){click(ArrivalsConstants.ARRIVAL_IMAGE);}

    public static void navegarProducto(){
        navigateTo(ArrivalsConstants.PRODUCT_PAGE);
    }

    public static void clickDescription(){click(ArrivalsConstants.DESCRIPTION_BUTTON);}

}
