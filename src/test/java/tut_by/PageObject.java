package tut_by;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Data
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
    SelenideElement inboxItemSubject = $(By.xpath("//div[contains(@Class,'mail-MessageSnippet-Item_content-row')]"));
    SelenideElement inboxItemBody = $(By.xpath("//span[contains(@Class,'mail-MessageSnippet-Item_body')]"));
    SelenideElement sentNotification = $(By.xpath("//div[@class = 'ComposeDoneScreen-Title']"));


    public void login(String userName, String password) {

        // open("https://mail.tut.by");
        String userNameField = "Username";
        String passwordField = "Password";

        $(By.id(userNameField)).setValue(userName);
        $(By.id(passwordField)).setValue(password);
        logInButton.click();
    }

    public void sentCreatedMessage(String recipient, String subject, String body) {
        createMessage(recipient, subject, body);
        sendMessageButton.click();

    }

    public void createMessage(String recipient, String subject, String body) {

        writeMessageButton.click();
        recipientField.setValue(recipient);
        emailSubjectField.setValue(subject);
        emailBodyInput.setValue(body);
    }

    public void checkNewMessages(String subject, String body) {
        SoftAssert softAssert = new SoftAssert();

        inboxFolder.click();
//        String actualLetterSubject = inboxItemSubject.getText();
//        String actualLetterBody = inboxItemBody.getText();
//        String expectedSubject = letterSubject;
//        String expectedBody = letterBody;
//        softAssert.assertEquals(actualLetterSubject, expectedSubject,"Title is not equals!!");
//        softAssert.assertTrue(actualLetterBody.contains(expectedBody), "Not equals!!");
//
//        softAssert.assertAll();

    }

    public boolean letterIsSent() {
        return sentNotification.isDisplayed();
    }

    public void logOut() {
        userIconButton.click();
        logOutButton.click();
    }

}
