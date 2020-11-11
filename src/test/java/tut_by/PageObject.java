package tut_by;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PageObject {


    SelenideElement writeMessageButton = $(By.xpath("//span[contains(@class,'mail-ComposeButton-Text')]"));
    SelenideElement recipientField = $(By.xpath("//div[@class='ComposePopup-Content']//[@class='ComposeRecipients']//[@class='composeYabbles']"));
    SelenideElement emailSubjectField = $(By.xpath("//div[contains(@class, 'ComposeSubject-Content')]"));
    SelenideElement sendMessageButton = $(By.xpath("//div[contains(@class,'ComposeSendButton')]//span[contains(@class,'button2__text')]"));
    SelenideElement emailBodyInput = $(By.xpath("//div[contains(@role,'textbox')]"));
    SelenideElement logInButton = $(By.xpath("//input[contains(@class,'loginButton')]"));
    SelenideElement inboxFolder = $(By.xpath("//a[contains(@class,'mail-FolderList-Item_inbox')]"));
    SelenideElement userIconButton = $(By.xpath("//div[contains(@class,'user-account__pic')]//img[contains(@class,'user-pic__image')]"));
    SelenideElement logOutButton = $(By.xpath("//a[contains(@class,'legouser__menu-item_action_exit')]"));
    //SelenideElement passwordField = $(By.xpath("//input[@class='o-control']"));

   // DataManager dataManager = new DataManager();

    public void login(String userName, String password) {
        open("https://mail.tut.by");
        String userNameField = "Username";
        String passwordField = "Password";

        $(By.id(userNameField)).setValue(userName);
        $(By.id(passwordField)).setValue(password);
        logInButton.click();
    }
    public void createMessage(String letterReceiver, String letterTitle, String letterBody){

        writeMessageButton.click();
        recipientField.setValue(letterReceiver);
        emailSubjectField.setValue(letterTitle);
        emailBodyInput.setValue(letterBody);

    }

    public void sendMessage(){
        sendMessageButton.click();
    }

    public void checkNewMessages(){
        SoftAssert softAssert = new SoftAssert();

        inboxFolder.click();
        String actualLetterTitle = $(By.xpath("//div[contains(@class,'ns-view-messages-wrap')]")).getText();
        softAssert.assertEquals(actualLetterTitle, letterTitle,"Title is not equals!!");
        softAssert.assertAll(actualLetterTitle, actualLetterBody, "Not equals!!");
    }

    public void logOut (){
        userIconButton.click();
        logOutButton.click();
    }

}
