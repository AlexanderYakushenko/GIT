package by.issoft.nyevent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {


    //private static Office offices;
    public List<Office> offices;

    public static void main(String[] args) {

        offices = new ArrayList<>();   // как правильно написать чтобы создался массив, куда мы будем запихивать все отделы ??

        List<Employee> shopWorkerLevel = Arrays.asList(
                new Employee("Vasya", "shopWorker"),
                new Employee("Petya", "shopWorker"),
                new Employee("Kostya", "shopWorker")
        );
        Office shopWorker = new Office("shop");
        shopWorker.addMoney();
        offices.addTotalMoney(shopWorker); //вопрос вытекающий из вопроса выше

        List<Employee> buhLevel = Arrays.asList(
                new Employee("Valya", "buh"),
                new Employee("Katya", "buh")
        );
        Office buh = new Office("buhgalteria");
        buh.addMoney();
        offices.addTotalMoney(buh);

        List<Employee> sysAdminLevel = Arrays.asList(
                new Employee("Boris", "sysAdmin")
        );
        Office sysAdmin = new Office("Servernaya");
        sysAdmin.addMoney();
        offices.addTotalMoney(sysAdmin);

        List<Employee> bossAsistentLevel = Arrays.asList(
                new Employee("Svetochka", "bossAsistent")
        );
        Office bossAsistent = new Office("Asistentskaya");
        bossAsistent.addMoney();
        offices.addTotalMoney(bossAsistent);

        List<Employee> bossLevel = Arrays.asList(
                new Employee("Veniamin", "boss")
        );
        Office boss = new Office("mainRoom");
        boss.addMoney();
        offices.addTotalMoney(boss);


        System.out.println("total sum of money: " + totalMoney); // что именно нужно писать в строку, чтобы распечаталась именно общая цифра
    }
}
