package by.issoft.nyevent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

    //private static Office offices;
//    public List<Office> offices;

    public static void main(String[] args) {

        List<Office> offices = new ArrayList<>();

        List<Employee> shopWorkerLevel = Arrays.asList(
                new Employee("Vasya", "shopWorker"),
                new Employee("Petya", "shopWorker"),
                new Employee("Kostya", "shopWorker")
        );

        Office shopWorker = new Office("shop");
        shopWorker.addEmployees(shopWorkerLevel);
        offices.add(shopWorker);

        List<Employee> buhLevel = Arrays.asList(
                new Employee("Valya", "buh"),
                new Employee("Katya", "buh")
        );
        Office buh = new Office("buhgalteria");
        buh.addEmployees(buhLevel);
        offices.add(buh);

        int totalMoney = 0;
        for(Office o: offices){
            totalMoney += o.getMoney();
        }

        System.out.println("total sum of money: " + totalMoney);
    }
}
