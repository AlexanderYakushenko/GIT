package the_internet;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class IFramePage {


    SelenideElement fileButton = $(By.xpath("//span[contains(text(),'File')]"));
    SelenideElement newDocumentButton = $(By.xpath("//span[@id='mceu_37-text']"));
    SelenideElement inputField = $(By.id("tinymce"));

    public void iFrameInputText (String text){

        fileButton.click();
        newDocumentButton.click();
        inputField.setValue(text);
    }

    public String readIFrameText (){

        String result= inputField.getText();

    return result;
    }
}
