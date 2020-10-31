package edostavka;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class VerifyingCoffePrice {

    @Test
    public void userCanLoginByUsername() {
        open("https://e-dostavka.by/");
       // $(By.name("user.name")).setValue("johny");
        $(By.xpath("//body/div[@id='body']/div[1]/div[3]/div[2]/div[1]/nav[1]/ul[1]/li[9]/a[1]/i[1]")).click();
        $(By.id("searchtext")).setValue("Кофе молотый «Dallmayr» classic, 250 г.").pressEnter();
        $(By.xpath("//body/div[@id='body']/div[1]/div[3]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/a[1]/img[1]")).click();
        $(By.xpath("//span[contains(text(),'54.2')]")).shouldHave(Condition.text("54.2"));


    }



}
