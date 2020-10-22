package by.issoft.groupautoqa;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.ListUtils;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;

import static by.issoft.groupautoqa.Operations.symmetric;
import static org.apache.commons.collections4.ListUtils.*;
public class MainClass {

    public static void main(String[] args) {

        List<String> first = new ArrayList();
        first.addAll(Arrays.asList("Artem", "Olga", "Nastya", "Alex", "Varvara"));
        System.out.println("First group: " + first);
        List<String> second = new ArrayList();
        second.addAll(Arrays.asList("Alex", "Marina", "Artem", "Lera", "Varvara"));
        System.out.println("Second group: " + second);

        List<String> intersecResult = intersection(first, second);
        System.out.println("Intersection: " + intersecResult);

        List<String> symmetrResult = symmetric(first, second);
        System.out.println("Symmetric: " + symmetrResult);

        List<String> unionResult = Operations.union(first, second);
        System.out.println("Union: " + unionResult);

        List<String> substrResult = subtract(first, second);
        System.out.println("Substract: " + substrResult);

        List<Integer> group1 = Arrays.asList(2,34,46,7,9,22,123);
        List<Integer> group2 = Arrays.asList(5,123,56,6,10,22,12);

        System.out.println("____________________");
        System.out.println(CollectionUtils.subtract(group2, group1));
        System.out.println(CollectionUtils.union(group1, group2));
        System.out.println(CollectionUtils.intersection(group1, group2));
        System.out.println(CollectionUtils.disjunction(group1, group2));
        System.out.println("____________________");
    }
//    public static List<String> symmetric(List<String> first, List<String> second) {
//        List<String> result = new ArrayList<>(first);
//        //for (String item : first) {
//
//        for (String item2 : second) {
//            boolean contains;
//            if (result.contains(item2)) {
//                result.remove(item2);
//            } else {
//                result.add(item2);
//            }
//        }
//        return result;
//    }
}