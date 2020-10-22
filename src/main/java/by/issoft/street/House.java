package by.issoft.street;

import java.util.ArrayList;
import java.util.List;

public class House {

    int houseNumber;
    List<Flat> flats;

    public House(int houseNumber) {
        this.houseNumber = houseNumber;
    }
    public void addFlats(List<Flat> flats) {
        this.flats = flats;
    }
    public double calculatePrice() {
        double price = 0;
        for (Flat flat : flats){
            price += flat.calculatePrice();
        }
        return price;
    }
}
