package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import static com.codeborne.selenide.Browsers.FIREFOX;
import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;
import static general.Navigation.homePage;

public class Hooks {

    @Before
    public void launchBrowser(){
        System.out.println("---------LAUNCHING BROWSER---------");
        System.setProperty("selenide.browser", FIREFOX);
    }

    @Before
    public void openHomePage(){
        open(homePage);
    }

    @After
    public void closeBrowser(){
        System.out.println("---------CLOSE BROWSER---------");
        close();
    }
}
