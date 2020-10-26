package by.issoft.jira;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test extends JiraItem{

    List<Bug> bugs;
    Task parentTask;

    public Test(String name) {
        super(name);
        bugs = new ArrayList<>();
    }

    public void setParentTask(Task parentTask){
        this.parentTask = parentTask;
    }

    public void validate(){

        boolean result = new Random().nextBoolean();
        System.out.println("Test " + name + " result " + result);
        if(!result){
            int maxBug = new Random().nextInt(2)+1;
            for (int i = 0; i < maxBug; i++){
                Bug b = new Bug("this is a bug for test "+ name + " foruniquness " +i);
                bugs.add(b);
                parentTask.addBug(b);
            }
        }


    }

}
