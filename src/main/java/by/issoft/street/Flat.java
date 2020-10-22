package by.issoft.street;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Flat {

    int flatNumber;
    int square;
    int people;

    public Flat(int flatNumber, int square, int people) {
        this.flatNumber = flatNumber;
        this.square = square;
        this.people = people;

    }

    public double calculatePrice() {
        return square*people;
    }

}
