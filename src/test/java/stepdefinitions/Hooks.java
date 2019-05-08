package stepdefinitions;

import cucumber.api.java.Before;

import static com.codeborne.selenide.Browsers.FIREFOX;

public class Hooks {

    @Before
    public void launchBrowser(){
        System.out.println("---------LAUNCHING BROWSER---------");
        System.setProperty("selenide.browser", FIREFOX);
    }
}
