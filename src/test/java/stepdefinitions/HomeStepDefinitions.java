package stepdefinitions;

import cucumber.api.java.en.Then;


public class HomeStepDefinitions {

    @Then("homepage is opened")
    public void homepageIsOpened() {
        System.out.println("---------HOMEPAGE IS OPENED---------");
    }


}
