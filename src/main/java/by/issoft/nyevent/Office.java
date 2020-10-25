package by.issoft.nyevent;

import java.util.ArrayList;
import java.util.List;

public class Office {

    String name;
    int payment;
    ArrayList<Integer> payments;

    public Office(String name) {

        this.name = name;
        this.payments = new ArrayList<Integer>();
    }

    public void addMoney(List<Employee> shopWorkerLevel) {
    }

    public void addTotalMoney(Office calcMoney) {
        payments.add(payment);
    }

    public int calcMoney() {
        int money = 0;
        for(Integer employee: this.payments){
            money += (int) Employee.payment();
        }
        return money;
    }
}
