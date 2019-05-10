package general;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class Loading {
    public static void waitUntil(SelenideElement element, Condition condtion){
        element.waitUntil(condtion, 10000);
    }
}
