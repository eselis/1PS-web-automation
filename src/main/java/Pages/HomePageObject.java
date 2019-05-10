package Pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Data
public class HomePageObject {

    private SelenideElement myAccountButton = $("nav li[id='li_myaccount']");
    private SelenideElement signUpButton = $x("//nav/descendant::a[contains(text(), 'Sign Up')]");
    private SelenideElement cookieButton = $x("//button[@id='cookyGotItBtn']");

}
