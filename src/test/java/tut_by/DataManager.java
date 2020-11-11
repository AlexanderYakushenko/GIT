package tut_by;

import lombok.Data;
import lombok.experimental.Accessors;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
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

    public class DataManagerMail {


//        @DataProvider
//        public Object[] dataForInput(String login, String pass) {
//            open("https://mail.tut.by/");
//            $(By.cssSelector("[name='login']")).setValue(login).pressEnter();
//            $(By.cssSelector("[name='password']")).setValue(password).pressEnter();
//            return new Object[0];
//        }


        @DataProvider
        public Object[] textMessageParser() throws IOException {
            Path path = Paths.get("src/main/resources/text.txt");
            List<String> data = Files.readAllLines(path);

            Object[] message = new Object[2];
            message[0] = data.get(1);
            message[1] = data.get(2);

            return message;
        }
//        @DataProvider
//        public Iterator<Object[]> dataForLetterInput() throws IOException {
//            // Object[][] data = new Object[3][3];
//
//            return parseCsvData("src/test/resources/EmailTemplates.csv");
//
////        data[0][0] = "valerevna944@mail.ru";
////        data[0][1] = "My first email Test";
////        data[0][2] = "Hello, I am Valeria and I am writing to myself";
////        return data;
//        }
//
//        private Iterator<Object[]> parseCsvData(String fileName) throws IOException
//        {
//            BufferedReader input = null;
//            File file = new File(fileName);
//            input = new BufferedReader(new FileReader(file));
//            String line = null;
//            List<Object[]> data = new ArrayList<>();
//            while ((line = input.readLine()) != null)
//            {
//                String in = line.trim();
//                String[] temp = in.split(",");
//                List<Object> arrray = new ArrayList<>();
//                for(String s : temp)
//                {
//                    arrray.add(Integer.parseInt(s));
//                }
//                data.add(arrray.toArray());
//            }
//            input.close();
//            return data.iterator();
//        }














}

