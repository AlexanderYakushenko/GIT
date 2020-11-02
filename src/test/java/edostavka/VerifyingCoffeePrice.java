package edostavka;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class VerifyingCoffeePrice {

    @BeforeMethod
    public  void precondition(){
        System.out.println("First lets check price of one item.");
    }

    @Test
    public void oneCoffeePriceVerifier() {

        String target = "Кофе молотый «Dallmayr» classic, 250 г.";

        open("https://e-dostavka.by/");
        $(By.xpath("//div[@class='main_menu__inner']//i[@class='fa fa-search']")).click();
        $(By.id("searchtext")).setValue(target).pressEnter();
        $(By.xpath("//a[contains(text(),'"+ target +"')]")).click();
        //String price = By.xpath("//span[contains(text(),'54.2')]").toString();
        $(By.xpath("//span[contains(text(),'54.2')]")).shouldHave(Condition.text("54.2"));
        //$(price).shouldHave(Condition.text("54.2"));
        System.out.println(Condition.text("1 KG of the coffee costs: 54.2"));
    }
    @AfterMethod
    public  void betweenTests(){
        System.out.println("Next lets check price of few items.");
    }

    @Test(dataProvider = "dataForInput", dataProviderClass = DataManager.class)
    public void fewCoffeePriceVerifier(String item, String price) {

        String target = item;


        open("https://e-dostavka.by/");
        $(By.xpath("//div[@class='main_menu__inner']//i[@class='fa fa-search']")).click();
        $(By.id("searchtext")).setValue(target).pressEnter();
        $(By.xpath("//a[contains(text(),'"+ target +"')]")).click();
        String itemPrice = By.xpath(price).toString();
        $(By.xpath(item)).shouldHave(Condition.text(itemPrice));


        //$(price).shouldHave(Condition.text("54.2"));
       // System.out.println(Condition.text("1 KG of the coffee costs: 54.2"));
    }

}
