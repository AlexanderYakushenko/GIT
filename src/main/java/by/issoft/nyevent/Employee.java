package by.issoft.nyevent;
import java.util.List;
public class Employee {

    String name;
    String role;
    //int people;

    public Employee(String name, String role){
        this.name = name;
        this.role = role;
    }
//    public Employee() {
//
//    }
    public int payment(){

        int payment = 0;
        String role = null;

        switch (role){
            case "boss" : payment = 600;
            case "bossAsistent": payment = 0;
            case "sysAdmin" : payment = 20;
            case "buh" : payment = 60;
            case "shopWorker" : payment = 40;
        }
        return payment;
//        public static int calcMoney() {
//            int money = 0;
//            for(Integer employee: payments){
//                money +=this.payment();
//            }
//            return money;
//        }
    }

}
