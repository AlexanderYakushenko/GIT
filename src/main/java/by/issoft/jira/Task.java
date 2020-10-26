package by.issoft.jira;

import java.util.ArrayList;
import java.util.List;

public class Task extends JiraItem{

    List<Test> tests;
    List<Bug> bugs;

    public Task(String name) {
        super(name);
        tests = new ArrayList<>();
        bugs = new ArrayList<>();
    }
    public void addBug(Bug bug){
        bugs.add(bug);
    }

    public List<Test> getTests() {
        return tests;
    }

    public List<Bug> getBugs() {
        return bugs;
    }

    public void addTest(Test test) {
        tests.add(test);
        test.setParentTask(this);
    }
    public void doTest(){
        for (int i = 0; i < tests.size(); i++) {
            Test test = tests.get(i);
            test.validate();
        }
        //System.out.println(test);
    }
}
