package the_internet;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
@Data
public class MainTest {

   InternetPage internetPage = new InternetPage();
   DropDownTest dropdown = new DropDownTest();
   DownloadTest download = new DownloadTest();
   KeyPressTest keyPress = new KeyPressTest();

   @Test
   public void dropDownOptionTest(){
      internetPage.dropdownPage();
      Assert.assertEquals(dropdown.dropDownOptionTest(), "Option 2", "it's wrong option!");

   }

   @Test
   public void checkDownloadedFile() throws FileNotFoundException {
      internetPage.downloadPage();
      download.downloadFile();

   }

   @Test
   public void checkResultLineContainsEnteredValue(){
      internetPage.keyPressPage();
      keyPress.pressedKeyDisplayed("Enter");
   }



}
