package tut_by;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.testng.AssertJUnit.assertEquals;

public class MainTest {

    PageObject pageObject = new PageObject();



    @Test(dataProvider = "dataForLetterInput", dataProviderClass = DataManager.class)
    public void mailServisTest() {

        Configuration.timeout = 6000;

        pageObject.login("###","###");
        pageObject.createMessage("","","");
        pageObject.sendMessage();
        pageObject.checkNewMessages();
        pageObject.logOut();



//        inboxFolder.click();
//        String actualLetterTitle = $(By.xpath("//div[contains(@class,'ns-view-messages-wrap')]")).getText();
//        assertEquals(actualLetterTitle, letterTitle,"Title is not equals!!");


        // Open LetterCreation pop-up

      //  SelenideElement createLetter = $(By.xpath("//span[@class='compose-button__txt']"));
        //createLetter.click();

        // Set value form DataManagerMail

//        $(By.xpath("//div[@class='container--ItIg4 size_s--2eBQT size_s--3_M-_']//input[@class='container--H9L5q size_s--3_M-_']")).setValue(letterReceiver);
//        $(By.xpath("//input[@name='Subject']")).setValue(letterTitle);
//        $(By.xpath("//div[contains(normalize-space(@class), 'cke_editable cke_editable_inline cke_contents_true cke_show_borders')]/div")).setValue(letterBody);

        // Sent Letter

//        SelenideElement sentLetter = $(By.xpath("//span[@class='button2 button2_base button2_primary button2_hover-support js-shortcut']//span[@class='button2__txt']"));
//        sentLetter.click();

        //find sent letter theme in DOM by letter theme span class and theme value

//        String actualLetterTitle = $(By.xpath("//span[contains(normalize-space(@class), 'llc__subject llc__subject_unread')]//span[contains(normalize-space(@class), 'll-sj__normal')]"))
//                .getText();
//        assertEquals(actualLetterTitle, letterTitle, "Theme title is not equals");
//    }


//    @BeforeMethod
//    @Test(dataProvider = "dataForInput", dataProviderClass = DataManager.class)
//    protected void beforePrecondition(){
//        DataManager data = new DataManager();
//        data.dataForInput("******@tut.by", "******");
//    }
//
//    @AfterMethod
//    protected void afterTest(){
//        $(By.cssSelector("#PH_logoutLink"));
//    }
//
//    SelenideElement composeMessage = $(By.xpath("//span[contains(@class,'mail-ComposeButton-Text')]"));
//    SelenideElement mailToInput = $(By.xpath("//div[@class='ComposePopup-Content']//[@class='ComposeRecipients']//[@class='composeYabbles']"));
//    SelenideElement mailSubjectInput = $(By.xpath("//div[contains(@class, 'ComposeSubject-Content')]"));
//    SelenideElement sendMessageButton = $(By.xpath("//div[contains(@class,'ComposeSendButton')]//span[contains(@class,'button2__text')]"));
//    SelenideElement mailBodyInput = $(By.xpath("//div[contains(@role,'textbox')]"));
//    SelenideElement inboxFolder = $(By.xpath("//a[contains(@class,'mail-FolderList-Item_inbox')]"));
//
//
//    @Test(dataProvider = "textMessageParser", dataProviderClass = DataManager.class)
//    public void validateInput() throws IOException {
//        composeMessage.click();
//        mailToInput.click();
//
//        mailSubjectInput.click();
//        mailBodyInput.click();
//
//    @Test
//    public void checkMailService() {
//
//        open("https://mail.tut.by/");
//        $(By.id("Username")).setValue("testayqa");
//        $(By.id("Password")).setValue("qwerty12345").pressTab().pressTab().pressEnter();
//
//        composeMessage.click();
//        mailToInput.setValue("testayqa@tut.by");
//        mailSubjectInput.setValue("testtesttest");
//        sendMessageButton.click();
//
//        Configuration.timeout = 6000;
//
//
//        $(By.xpath("//div[@class='ns-view-messages-wrap ns-view-id81 js-Mail-MessageWrap']")).shouldHave(Condition.text("Test"));
//    }
}
