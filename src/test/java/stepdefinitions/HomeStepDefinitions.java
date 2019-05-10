package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class HomeStepDefinitions {

    @Then("homepage is opened")
    public void homepageIsOpened() {
        System.out.println("---------HOMEPAGE IS OPENED---------");
    }


    @When("I select My Acoount button")
    public void iSelectMyAcoountButton() {
    }
}
