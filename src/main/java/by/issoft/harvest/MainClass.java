package by.issoft.harvest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {


    //private static java.util.List<Tree> List;
    //public List<Tree> List;

    public static void main(String[] args) {

        int allHarvest = 0;

        List<Orchard> harvests = new ArrayList<>();

        Orchard plumOrchard = new Orchard("PlumOrchard", 11);
        List<Tree> plumTrees = new ArrayList<>();
        plumTrees.add(new Tree("Plum", 3));
        plumOrchard.collectFruts(plumTrees);
        harvests.add(plumOrchard);

        //Orchard plum = new Orchard("PlumOrchard", 300);

        //plumTrees.addAll(plum);
        Orchard appleOrchard = new Orchard("AppleOrchard", 5);
        List<Tree> appleTrees = new ArrayList<>();
        appleTrees.add(new Tree("Apple", 6));
        appleOrchard.collectFruts(plumTrees);
        harvests.add(appleOrchard);

        Orchard pearOrchard = new Orchard("PearOrchard", 12);
        List<Tree> pearTrees = new ArrayList<>();
        pearTrees.add(new Tree("Pear", 6));
        pearOrchard.collectFruts(pearTrees);
        harvests.add(pearOrchard);

        for (Orchard o : harvests) {
           
           // allHarvest = o.collectFruts(harvests);

           allHarvest += o.collectFruts(appleTrees);
           // allHarvest += o.collectFruts(plumTrees);
          //  allHarvest += o.collectFruts(pearTrees);
        }

        System.out.println("Total amount of harvest is: " + allHarvest);
        //System.out.println("There are " + totalApples + " apples, " + totalPlums  + " plums and " + totalPear + " pears.");
    }
}
