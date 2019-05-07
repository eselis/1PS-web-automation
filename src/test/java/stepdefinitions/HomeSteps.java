package stepdefinitions;

import cucumber.api.java.en.Given;

public class HomeSteps {

    @Given("Homepage is opened")
    public void homepageIsOpened() {
        System.out.println("VERIFY HOMEPAGE IS OPENED");
    }
}
