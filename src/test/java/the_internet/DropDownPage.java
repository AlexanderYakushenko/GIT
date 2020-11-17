package the_internet;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
@Data
public class DropDownPage {


    public String dropDownOptionTest(){

        SelenideElement dropDown = $(By.id("dropdown"));
        SelenideElement dropdownOption2 = $x("//option[.='Option 2']");

        //$(By.xpath("//a[contains(text(),'Dropdown')]")).click();
        dropDown.shouldHave(Condition.text("Please select an option"));
        dropDown.click();
        dropdownOption2.click();

        String selectedOption = dropDown.getText();
        //selectedOption.shouldHave(Condition.text("Option 2"));
        return selectedOption;

    }
}
