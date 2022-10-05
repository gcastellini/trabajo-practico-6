package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.GoogleHomeService;
import lippia.web.services.GoogleSearchResultService;

public class GoogleSearchSteps extends PageSteps {

    @Given("The client is in Practice page")
    public void home() {
        GoogleHomeService.navegarWeb();
    }

    @When("^The client search for word (.*)$")
    public void search(String criteria) {
        GoogleHomeService.enterSearchCriteria(criteria);
        GoogleHomeService.clickSearchButton();
    }
    @When("The client clicks on Shop Button")
            public void click() {
        GoogleHomeService.clickSearchButton();
    }
    @When("The client clicks on Arrival Image")
    public void clickArrival(){
        GoogleHomeService.clickArrivals();
    }
    @And("The client clicks on Home menu button")
    public void clickHome(){
        GoogleHomeService.clickHomeButton();
    }
    @And("The client clicks on Description tab")
    public void clickDescription(){
        GoogleHomeService.clickDescription();
    }
    @Then("The client verify that results are shown properly")
    public void statVerfication() {
        GoogleSearchResultService.verifyResults();

    }
    @Then("The client is in Product page")
    public void navigateProduct(){
        GoogleHomeService.navegarProducto();
    }

    @Then("The client sees a description")
    public void descriptionDisplayed(){
        GoogleSearchResultService.descDisplayed();
    }
}
