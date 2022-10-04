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
    @And("The client clicks on Home menu button")
    public void clickHome(){
        GoogleHomeService.clickHomeButton();
    }
    @Then("The client verify that results are shown properly")
    public void statVerfication() {
        GoogleSearchResultService.verifyResults();

    }

}
