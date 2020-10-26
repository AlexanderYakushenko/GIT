package by.issoft.nyevent;
import java.util.ArrayList;
import java.util.List;
public class Office {

    String name;
    //employee.payment;
    ArrayList<Employee> payments;

    public Office(String name) {

        this.name = name;
        payments = new ArrayList<>();
    }
    public void addMoney() {
    }
    public void addTotalMoney(Office calcMoney) {
        payments.add(money);
    }

    public int calcMoney() {
        int money = 0;
        for(List<Employee> : payments){
            money += Employee.payment();
        }
        return money;
    }


}
