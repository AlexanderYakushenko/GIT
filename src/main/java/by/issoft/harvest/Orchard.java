package by.issoft.harvest;

import java.util.ArrayList;
import java.util.List;

public class Orchard {

    String name;
    List<Tree> trees = new ArrayList<>();
    int orchardCapacity;


    public Orchard(String name, int orchardCapacity) {
        this.name = name;
        this.orchardCapacity = orchardCapacity;
    }

    public int collectFruts(List<Tree> trees) {

        int sum = 0;
        for (Tree t : trees) {
            sum = t.treeCapacity * orchardCapacity;
        }
        return sum;
    }


//            List<Good> cart = new ArrayList<>();
//        for (int i = 0; i < goods.size(); i++) {
//            Good g = goods.get(i);
//            if(g.getName().equals(name)){
//                cart.add(g);
//            }
//            if(cart.size()==count){
//                break;
//            }
//        }
    }



