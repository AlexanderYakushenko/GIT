package tut_by;

import lombok.Data;
import lombok.experimental.Accessors;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Data
@Accessors(chain = true)
public class DataManager {



    @DataProvider
    public Object[][] dataForLetterInput() {
        Object[][] data = new Object[1][3];

        data[0][0] = "testayqa@tut.by";
        data[0][1] = "TestTestTest";
        data[0][2] = "Hello world, I am email body";
        return data;
    }


//    @DataProvider
//    public Object[] dataForInput(String login, String pass) {
//        open("https://mail.tut.by/");
//        $(By.cssSelector("[name='login']")).setValue(login).pressEnter();
//        $(By.cssSelector("[name='password']")).setValue(password).pressEnter();
//        return new Object[0];
//    }
//
//
//    @DataProvider
//    public Object[] textMessageParser() throws IOException {
//        Path path = Paths.get("src/main/resources/text.txt");
//        List<String> data = Files.readAllLines(path);
//
//        Object[] message = new Object[2];
//        message[0] = data.get(1);
//        message[1] = data.get(2);
//
//        return message;
//    }
}

