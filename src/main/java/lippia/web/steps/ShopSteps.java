package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.ShopService;

public class ShopSteps extends PageSteps {

    @And("The client clicks on Read More")
    public void readMore(){
        ShopService.readButton();
    }

    @And("The client clicks on Product Category")
    public void filter(){
        ShopService.prodCategory();
    }
    @Then("The client sees Out of Stock message")
    public void outStock(){
        ShopService.outStockDisplayed();
    }
}
