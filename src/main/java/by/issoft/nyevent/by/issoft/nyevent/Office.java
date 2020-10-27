package by.issoft.nyevent;

import java.util.ArrayList;
import java.util.List;

public class Office {

    String name;
    List<Integer> payments = new ArrayList<>();

    public Office(String name) {
        this.name = name;
    }
    public int totalMoney() {
        int allMoney = 0;
        for (Office m : offices) { //как посчитать общую сумму
            allMoney += m.payments;
        }
        return allMoney;
    }
    public void addMoney() {

        int payment = 0;
        String role = null;

        switch (role) {
            case "boss":
                payment = 600;
            case "bossAsistent":
                payment = 0;
            case "sysAdmin":
                payment = 20;
            case "buh":
                payment = 60;
            case "shopWorker":
                payment = 40;
        }
        payments.add(payment);
    }
}



