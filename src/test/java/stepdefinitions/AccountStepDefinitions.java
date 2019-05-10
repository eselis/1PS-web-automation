package stepdefinitions;

import Pages.AccountPageObject;
import cucumber.api.java.en.Then;
import general.User;

import static com.codeborne.selenide.Condition.*;
import static general.Loading.waitUntil;

public class AccountStepDefinitions {

    private AccountPageObject account = new AccountPageObject();

    @Then("new account is created")
    public void newAccountIsCreated() {
        waitUntil(account.getIntroductionText(), visible);
        account.getIntroductionText().shouldHave(and("User name is correct",
                text("Hi, " + User.getSavedFirstName() + " " + User.getSavedLastName())));
    }
}
