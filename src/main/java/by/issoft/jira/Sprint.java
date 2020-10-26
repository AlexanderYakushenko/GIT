package by.issoft.jira;

import java.util.ArrayList;
import java.util.List;

public class Sprint {

    List<Task> tasks;

    public Sprint(String name) {
        super();
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void executeRegression() {
        for(Task t: tasks){
            t.doTest();
        }
        System.out.println("*******Sprint info*******");
        int bugsCount = 0;
        int testCount = 0;
        for(Task t: tasks){
            bugsCount += t.getBugs().size();
            testCount += t.getTests().size();
        }
        System.out.println( "Total tests " + testCount);
        System.out.println(" Total bugs " + bugsCount);
        System.out.println("______________");
        tasks.forEach(t -> t.getBugs().forEach(b -> System.out.println(b.name)));
    }
}
