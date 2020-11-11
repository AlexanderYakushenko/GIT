package tut_by;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

//public class LoginPage {
//
//    @Test
//    public void checkLogin() {
//
//        loginPage.login("testayqa", "qwerty12345");
//        Assert.assertTrue(loginPage.isLoginCorrectly());
//        loginPage.sendMessage("testayqa@tut.by", "test");
//        loginPage.openMessage();
//    }
//
//    public void login(String u, String p) {
//        open("https://mail.tut.by/");
//        openlogin.click();
//        login.setValue(u);
//        enter.click();
//        pass.setValue(p);
//        submit.click();
//    }
//
//
//    public boolean isLoginCorrectly() {
//            return login.isDisplayed();
//    }
//
//        open("https://mail.tut.by/");
//        $(By.id("Username")).setValue("testayqa");
//        $(By.id("Password")).setValue("qwerty12345").pressTab().pressTab().pressEnter();
//       // $(By.xpath("//div[@class='wrap loginWrap']//i[@class='button%']/[contains(text(Войти))]")).click();
//
// }



