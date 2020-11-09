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

public class BaseTest {

    @BeforeMethod
    @Test(dataProvider = "dataForInput", dataProviderClass = DataManager.class)
    protected void beforePrecondition(){
        DataManager data = new DataManager();
        data.dataForInput("******@tut.by", "******");
    }

    @AfterMethod
    protected void afterTest(){
        $(By.cssSelector("#PH_logoutLink"));
    }

    SelenideElement composeMessage = $(By.xpath("//span[contains(@class,'mail-ComposeButton-Text')]"));
    SelenideElement mailToInput = $(By.xpath("//div[@class='ComposePopup-Content']//[@class='ComposeRecipients']//[@class='composeYabbles']"));
    SelenideElement mailSubjectInput = $(By.xpath("//div[contains(@class, 'ComposeSubject-Content')]"));
    SelenideElement sendMessageButton = $(By.xpath("//div[contains(@class,'ComposeSendButton')]//span[contains(@class,'button2__text')]"));
    SelenideElement mailBodyInput = $(By.xpath("//div[contains(@role,'textbox')]"));
    SelenideElement inbox = $(By.xpath("//a[contains(@class,'mail-FolderList-Item_inbox')]"));


    @Test(dataProvider = "textMessageParser", dataProviderClass = DataManager.class)
    public void validateInput() throws IOException {
        composeMessage.click();
        mailToInput.click();

        mailSubjectInput.click();
        mailBodyInput.click();

    @Test
    public void checkMailService() {

        open("https://mail.tut.by/");
        $(By.id("Username")).setValue("testayqa");
        $(By.id("Password")).setValue("qwerty12345").pressTab().pressTab().pressEnter();

        composeMessage.click();
        mailToInput.setValue("testayqa@tut.by");
        mailSubjectInput.setValue("testtesttest");
        sendMessageButton.click();

        Configuration.timeout = 6000;


        $(By.xpath("//div[@class='ns-view-messages-wrap ns-view-id81 js-Mail-MessageWrap']")).shouldHave(Condition.text("Test"));
    }
}
