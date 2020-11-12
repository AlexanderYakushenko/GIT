package tut_by;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.github.javafaker.Faker;
import com.google.gson.JsonArray;
import jdk.nashorn.internal.parser.JSONParser;
import org.testng.annotations.DataProvider;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;

//@Data

public class DataManager {

    Faker faker = new Faker();

    private static final String filePath = "src/resources/data.json";

    public Object[][] dataForLogin() {
        Object[][] loginData = new Object[0][];

        try {
            FileReader reader = new FileReader(filePath);
            JSONParser jsonParser = new JSONParser();
            JSONPObject jsonpObject = (JSONPObject) jsonParser.parse(reader);
            String userName = (String) jsonParser.get("userName");
            String password = (String) jsonParser.get("password");

            loginData = new Object[1][2];
            loginData[0][0] = userName;
            loginData[0][1] = password;
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
        return loginData;
    }

    @DataProvider
    public Object[][] dataForLetterInput() {

        Object[][] data = new Object[0][0];

        try {
            FileReader reader = new FileReader(filePath);
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

            JSONArray messageArray = (JSONArray) jsonObject.get("messages");
            int messageCount = messageArray.size();
            Iterator i = messageArray.iterator();

            message = new Object[messageCount][5];
            int a = 0;
            for (int b = 0; b < messageCount; b++) {
                JSONObject messagesObject = (JSONObject) i.next();
                message[a][0] = messagesObject.get("recipient");
                message[a][1] = messagesObject.get("subject");
                message[a][2] = messagesObject.get("body");
                a += 1;
            }
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
        return message;
    }
}

