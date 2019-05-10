package stepdefinitions;

import Pages.HomePageObject;
import Pages.SignUpPageObject;
import com.codeborne.selenide.Condition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import general.User;

import static general.Loading.waitUntil;

public class SignUpStepDefinitions {

    private SignUpPageObject signup = new SignUpPageObject();
    private User user = new User();
    private HomePageObject home = new HomePageObject();

    @And("I enter first name")
    public void iEnterFirstName() {
        signup.getFirstNameField().sendKeys(user.getFirstName());
        User.setSavedFirstName(user.getFirstName());
    }

    @And("I enter last name")
    public void iEnterLastName() {
        signup.getLastNameField().sendKeys(user.getLastName());
        User.setSavedLastName(user.getLastName());
    }

    @And("I enter mobile number")
    public void iEnterMobileNumber() {
        signup.getMobilePhoneNumber().sendKeys(user.getMobileNumber());
    }

    @And("I enter password")
    public void iEnterPassword() {
        signup.getPasswordField().sendKeys(user.getPassword());
    }

    @And("I enter password again")
    public void iEnterPasswordAgain() {
        signup.getConfirmPasswordField().sendKeys(user.getPassword());
    }

    @And("I select Sign up button")
    public void iSelectSignUpButton() {
        signup.getSignUpButton().click();
    }

    @And("I accept cookies")
    public void iAcceptCookies() {
        waitUntil(home.getCookieButton(), Condition.visible);
        home.getCookieButton().click();
    }

    @And("I enter Email")
    public void iEnterEmail() {
        signup.getEmailField().sendKeys(user.getEmail());
    }
}
