package Pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Data
public class SignUpPageObject {

    private SelenideElement firstNameField = $("input[name='firstname']");
    private SelenideElement lastNameField = $("input[name='lastname']");
    private SelenideElement mobilePhoneNumber = $("input[name='phone']");
    private SelenideElement emailField = $("input[name='email']");
    private SelenideElement passwordField = $("input[name='password']");
    private SelenideElement confirmPasswordField = $("input[name='confirmpassword']");
    private SelenideElement signUpButton = $(".btn-lg");

}
