package Pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$x;

@Data
public class AccountPageObject {
    private SelenideElement introductionText = $x("//h3[@class='RTL']");
}
