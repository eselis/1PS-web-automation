package stepdefinitions;

import cucumber.api.java.en.Given;
import static com.codeborne.selenide.Selenide.open;


public class HomeSteps {

    @Given("I have started browser")
    public void iHaveStartedBrowser() {
        System.out.println("------------START BROWSER------------");
        open("https://www.phptravels.net/");
    }
}
