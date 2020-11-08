package tut_by;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @Test
    public void checkMailService() {

        open("https://mail.tut.by/");
        $(By.id("Username")).setValue("testayqa");
        $(By.id("Password")).setValue("qwerty12345").pressTab().pressTab().pressEnter();

        $(By.xpath("//span[contains(text(),'Написать')]")).click();
        $(By.xpath("//div[@class='ComposePopup-Content']//[@class='ComposeRecipients']//[@class='composeYabbles']")).setValue("testayqa@tut.by");
        $(By.xpath("//div[@class='compose-LabelRow-Content ComposeSubject-Content']//input[@class='composeTextField ComposeSubject-TextField']")).setValue("testtesttest");
        $(By.xpath("//span[contains(text(),'Отправить')]")).click();

        Configuration.timeout = 10000;


        $(By.xpath("//div[@class='ns-view-messages-wrap ns-view-id81 js-Mail-MessageWrap']")).shouldHave(Condition.text("Test"));
    }
}
