package the_internet;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class InternetPage {

    SelenideElement dropdownLink = $("a[href='/dropdown']");
    SelenideElement downloadLink = $("a[href='/download']");
    SelenideElement keyPressLink = $("a[href='/key_presses']");

    public void dropdownPage(){

        open("https://the-internet.herokuapp.com/");
        dropdownLink.click();
    }

    public void downloadPage(){
        open("https://the-internet.herokuapp.com/");
        downloadLink.click();
    }

    public void keyPressPage(){
        open("https://the-internet.herokuapp.com/");
        keyPressLink.click();
    }

}
