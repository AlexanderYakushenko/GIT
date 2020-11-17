package the_internet;

import lombok.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertEquals;

@Data
public class MainTest {

   InternetPage internetPage = new InternetPage();
   DropDownPage dropdown = new DropDownPage();
   DownloadPage download = new DownloadPage();
   KeyPressPage keyPress = new KeyPressPage();
   //IFramePage iFramePage = new IFramePage();

   @Test
   public void dropDownOptionTest(){
      internetPage.dropdownPage();
      assertEquals(dropdown.dropDownOptionTest(), "Option 2", "it's wrong option!");

   }

   @Test
   public void iFrameTest(){

      IFramePage iFramePage = new IFramePage();

      String text = "some text for test";
      iFramePage.iFrameInputText(text);
      String inputtedText = iFramePage.readIFrameText();
      assertEquals(inputtedText, text, "there is some misstake!");
   }

   @Test
   public void downloadedFileTest() throws FileNotFoundException {
      internetPage.downloadPage();
      download.downloadFile();

   }

   @Test
   public void keyPressTest(){
      internetPage.keyPressPage();
      keyPress.pressedKeyDisplayed("Enter");
   }



}
