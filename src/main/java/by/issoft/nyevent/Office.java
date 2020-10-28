package by.issoft.nyevent;

import java.util.ArrayList;
import java.util.List;

public class Office {

    //List<Office>
    String name;
    List<Integer> payments = new ArrayList<>();
    List<Employee> employees;

    public Office(String name) {
        this.name = name;
    }
//    public int totalMoney() {
//        int allMoney = 0;
//        for (Office m : offices) { //как посчитать общую сумму
//            allMoney += m.payments;
//        }
//        return allMoney;
//    }


    public void addEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public int getMoney() {
        int envelope = 0;

        for (Employee e : employees) {
            switch (e.role) {
                case "buh": {
                    envelope += 60;
                    break;
                }
                case "shopWorker": {
                    envelope += 40;
                    break;
                }
            }
        }
        return envelope;
    }

}

