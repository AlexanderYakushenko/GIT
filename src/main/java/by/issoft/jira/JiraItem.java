package by.issoft.jira;

import java.util.UUID;

public class JiraItem {

    String id;
    String name;

    public JiraItem(String name){

        this.name = name;
        this.id = UUID.randomUUID().toString();
    }



}
