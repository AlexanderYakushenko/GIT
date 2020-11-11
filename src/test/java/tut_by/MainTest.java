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
    public void mailServisTest(String recipient, String subject, String body) {

        Configuration.timeout = 6000;

        pageObject.login("###", "###");
        pageObject.createMessage("", "", "");
        pageObject.checkNewMessages("", "");
        pageObject.logOut();


    }
}
