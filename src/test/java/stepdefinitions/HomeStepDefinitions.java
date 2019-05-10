package stepdefinitions;

import Pages.HomePageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class HomeStepDefinitions {

    private HomePageObject home = new HomePageObject();

    @Then("homepage is opened")
    public void homepageIsOpened() {
        System.out.println("---------HOMEPAGE IS OPENED---------");
    }


    @When("I select My Acoount button")
    public void iSelectMyAcoountButton() {
        home.getMyAccountButton().click();
    }

    @And("I select Sign Up button")
    public void iSelectSignUpButton() {
        home.getSignUpButton().click();
    }
}
