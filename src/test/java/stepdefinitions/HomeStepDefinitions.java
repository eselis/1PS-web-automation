package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Browsers.FIREFOX;
import static com.codeborne.selenide.Selenide.open;

public class HomeStepDefinitions {
    @Given("I have started browser")
    public void iHaveStartedBrowser() {
        System.out.println("---------LAUNCH BROWSER---------");
        System.setProperty("selenide.browser", FIREFOX);
    }

    @When("I navigate to homepage")
    public void iNavigateToHomepage() {
        System.out.println("---------VERIFY HOMEPAGE IS OPENED---------");
        open("https://www.phptravels.net/");
    }

    @Then("homepage is opened")
    public void homepageIsOpened() {
        System.out.println("---------HOMEPAGE IS OPENED---------");
    }
}
