package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.ArrivalsService;
import lippia.web.services.ArrivalsResultService;

public class ArrivalsSteps extends PageSteps {

    @Given("The client is in Practice page")
    public void home() {
        ArrivalsService.navegarWeb();
    }

    @When("^The client search for word (.*)$")
    public void search(String criteria) {
        ArrivalsService.enterSearchCriteria(criteria);
        ArrivalsService.clickSearchButton();
    }
    @When("The client clicks on Shop Button")
            public void click() {
        ArrivalsService.clickSearchButton();
    }
    @And("The client clicks on Arrival Image")
    public void clickArrival(){
        ArrivalsService.clickArrivals();
    }
    @And("The client checks that results are shown properly")
    public void statVerification() {
        ArrivalsResultService.verifyResults();

    }

    @And("The client clicks on Home menu button")
    public void clickHome(){
        ArrivalsService.clickHomeButton();
    }
    @And("The client clicks on Description tab")
    public void clickDescription(){
        ArrivalsService.clickDescription();
    }

    @And("The client is in Product page")
    public void navigateProduct(){
        ArrivalsService.navegarProducto();
    }
    @Then("The client verify that results are shown properly")
    public void statVerification2() {
        ArrivalsResultService.verifyResults();

    }


    @Then("The client sees a description")
    public void descriptionDisplayed(){
        ArrivalsResultService.descDisplayed();
    }
}
