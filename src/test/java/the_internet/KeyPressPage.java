package the_internet;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class KeyPressPage {


    SelenideElement input = $("#target");
    SelenideElement keyName = $("#result");

    public boolean pressedKeyDisplayed(String value){

        input.pressEnter();
        return keyName.getText().contains(value);
    }

}
