package tut_by;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ComposeMessage {

    public void writeMessage(){
//
//        $(By.xpath("//span[contains(text(),'Написать')]"));
//
 }
   public void sendMessage(String email, String text){
       write.click();
       emailto.setValue(email);
       textbox.setValue(text);
       send.click();

   }

}
