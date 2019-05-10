package stepdefinitions;

import cucumber.api.java.Before;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Selenide.*;

public class Hooks {

    @Before
    public void launchBrowser(){
        System.out.println("---------LAUNCHING BROWSER---------");
        System.setProperty("selenide.browser", CHROME);
    }

    @Before
    public void openHomePage(){
        open("https://www.phptravels.net/");
    }
}
