package tut_by;

import lombok.Data;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.nio.file.Paths;

@Data

public class DataManager {

    private static final String filePath = "src/main/resources/data.json";

    ObjectMapper mapper = new ObjectMapper();

    private EmailData getEmailData() throws IOException {

        EmailData emailData = mapper.readValue(Paths.get(filePath).toFile(), EmailData.class);
        return emailData;
    }

    @DataProvider
    public Object[][] dataForLogin() throws IOException {

        EmailData emailData = getEmailData();

        Object[][] loginData = new Object[1][2];
        loginData[0][0] = emailData.getUserName();
        loginData[0][1] = emailData.getPassword();

        return loginData;
    }

    @DataProvider
    public Object[][] message() throws IOException {

        EmailData emailData = getEmailData();

        Object[][] messageData = new Object[emailData.getMessage().size()][1];
        for (int i = 0; i < emailData.getMessage().size(); i++) {
            Message m = emailData.getMessage().get(i);
            messageData[i][0] = m;
        }

        return messageData;
    }

}


