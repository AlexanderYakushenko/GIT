package by.issoft.jira;

public class MainClass {

    public static void main(String[] args) {
        Sprint sprint = new Sprint("sprin1");

        Task task1 = new Task("LoginTask");

        task1.addTest(new Test("validateCredential"));
        task1.addTest(new Test("inValidCreds"));
        task1.addTest(new Test("validErrorMessage"));
        sprint.addTask(task1);

        Task task2 = new Task("cartTest");
        task2.addTest(new Test("addProduct"));
        task2.addTest(new Test("chekPrice"));
        task2.addTest(new Test("shipingInfo"));
        sprint.addTask(task2);

        sprint.executeRegression();
    }
}
