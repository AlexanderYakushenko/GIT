package the_internet;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class InternetPage {

    SelenideElement dropdownLink = $("a[href='/dropdown']");
    SelenideElement downloadLink = $("a[href='/download']");
    SelenideElement keyPressLink = $("a[href='/key_presses']");
    SelenideElement framesLink = $("a[href='/frames']");
    SelenideElement iFrameLink = $("a[href='/iframe']");
    SelenideElement iFrameOkButton= $(By.xpath("//button[contains(text(),'Ok')]"));

    public void dropdownPage(){

        open("https://the-internet.herokuapp.com/");
        dropdownLink.click();
    }

    public void iFramePage(){
        open("https://the-internet.herokuapp.com/");
        framesLink.click();
        iFrameLink.click();
        iFrameOkButton.pressEnter();
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
