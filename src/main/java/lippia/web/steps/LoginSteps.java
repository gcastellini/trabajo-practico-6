package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginResultService;
import lippia.web.services.LoginService;

public class LoginSteps extends PageSteps {


    @When("The client clicks on My Account button")
     public void clickAccount(){
        LoginService.clickAccountButton();
    }

    @And("^The client enters email (.*) and password (.*)$")
    public void enterEmailPass(String email,String password){
        LoginService.enterEmailPass(email,password);
    }

    @Then("The client is logged in successfully")
    public void loginSuccess(){
        LoginResultService.welcomeDisplayed();
    }

    @Then("The client sees error message")
    public void loginError(){
        LoginResultService.errorDisplayed();
    }
}
