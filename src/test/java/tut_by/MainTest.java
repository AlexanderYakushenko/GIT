package tut_by;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import lombok.Data;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.testng.AssertJUnit.assertEquals;

@Data
public class MainTest {

    PageObject pageObject = new PageObject();
    Faker faker = new Faker();

    @BeforeMethod
    protected void beforeTest(EmailData emailData) {
        open("https://mail.tut.by");
        pageObject.login(emailData.getUserName(), emailData.getPassword());
    }

    @AfterMethod
    protected void afterTest() {
        pageObject.logOut();
    }

    @Test(dataProvider = "message", dataProviderClass = DataManager.class)
    public void mailServiceTest(Message message) {

        String funnyName = faker.funnyName().name();
        SoftAssert softAssert = new SoftAssert();
        String recipient = message.getRecipient();
        String subject = message.getSubject();
        String body = message.getBody();

        Configuration.timeout = 6000;

        pageObject.sentCreatedMessage(recipient, subject, body);
        Assert.assertTrue(pageObject.letterIsSent());
        pageObject.checkNewMessages(subject, body);
        String actualSubject = pageObject.inboxItemSubject.getText();
        String actualBody = pageObject.inboxItemBody.getText();
        String expectedSubject = subject;
        String expectedBody = body;
        softAssert.assertEquals(actualSubject, expectedSubject, "Title is not equals!!");
        softAssert.assertTrue(actualBody.contains(expectedBody), "Not equals!!");

        softAssert.assertAll();
    }
}
