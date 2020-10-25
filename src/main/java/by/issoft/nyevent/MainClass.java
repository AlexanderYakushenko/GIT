package by.issoft.nyevent;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MainClass {

    //static int payment;

    public static void main(String[] args) {
        Office office = new Office("Roga-Kopita");


        List<Employee> shopWorkerLevel = Arrays.asList(
                new Employee("Vasya", "shopWorker"),
                new Employee("Petya", "shopWorker"),
                new Employee("Kostya", "shopWorker")
        );
        Office shopWorker = new Office ("shop");
        shopWorker.addMoney(shopWorkerLevel);
        office.addTotalMoney(shopWorker);


        List<Employee> buhLevel = Arrays.asList(
                new Employee("Valya", "buh"),
                new Employee("Katya", "buh")
        );
        Office buh = new Office ("buhgalteria");
        buh.addMoney(buhLevel);
        office.addTotalMoney(buh);


        List<Employee> sysAdminLevel = Arrays.asList(
                new Employee("Boris", "sysAdmin")
        );
        Office sysAdmin = new Office ("Servernaya");
        sysAdmin.addMoney(sysAdminLevel);
        office.addTotalMoney(sysAdmin);

        List<Employee> bossAsistentLevel = Arrays.asList(
                new Employee("Svetochka", "bossAsistent")
        );
        Office bossAsistent = new Office ("Asistentskaya");
        bossAsistent.addMoney(bossAsistentLevel);
        office.addTotalMoney(bossAsistent);


        List<Employee> bossLevel = Arrays.asList(
                new Employee("Veniamin", "boss")
        );
        Office boss = new Office ("mainRoom");
        boss.addMoney(bossLevel);
        office.addTotalMoney(boss);


        System.out.println("total sum of money: " + Office.calcMoney());
    }
}
