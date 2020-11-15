package tut_by;

import lombok.Data;

import java.util.List;

@Data
public class EmailData {


    String userName;
    String password;
    List<Message> message;


}

