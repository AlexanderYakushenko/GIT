package by.issoft.street;
import java.util.ArrayList;
import java.util.List;

public class Street {

     String name;
     List<House> houses;

     public Street(String name) {
          this.name = name;
          this.houses = new ArrayList<>();
     }
    public void addHouse(House house) {
          houses.add(house);
     }
     public double calculatePrice() {
          double price = 0;
          for (House house : houses){
               price += house.calculatePrice();
          }
          return price;
     }
}
