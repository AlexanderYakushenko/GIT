package by.issoft.street;

import java.util.Arrays;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        Street street = new Street( "Masherova");

        List<Flat> manyFlatHouseFlatLIst = Arrays.asList(
                new Flat(1, 30, 2),
                new Flat(2, 50, 3),
                new Flat(3, 65, 4)
        );
        House manyFlatHouse = new House(1);
        manyFlatHouse.addFlats(manyFlatHouseFlatLIst);
        street.addHouse(manyFlatHouse);

        List<Flat> townHouseFlats = Arrays.asList(
                new Flat(1, 130, 4),
                new Flat(2, 150, 5)
        );
        House townHouse = new House(2);
        manyFlatHouse.addFlats(townHouseFlats);
        street.addHouse(townHouse);

        List<Flat> cottageFlats = Arrays.asList(
                new Flat(1, 230, 4)
        );
        House cottege = new House(3);
        manyFlatHouse.addFlats(cottageFlats);
        street.addHouse(cottege);

        System.out.println("Money from the strees: "
                + street.calculatePrice());
    }
}
