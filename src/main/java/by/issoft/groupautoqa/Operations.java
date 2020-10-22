package by.issoft.groupautoqa;
import java.util.ArrayList;
import java.util.List;

public class Operations {

    public static List<String> intersection(List<String> first, List<String> second) {
        List<String> result = new ArrayList<>();
        for (String item : first) {
            for (String item2 : second) {
                if (item.equals(item2)) {
                    result.add(item);
                }
            }
        }
        return result;
    }
    public static List<String> symmetric(List<String> first, List<String> second) {
        List<String> result = new ArrayList<>(first);
        //for (String item : first) {

        for (String item2 : second) {
            boolean contains;
            if (result.contains(item2)) {
                result.remove(item2);
            } else {
                result.add(item2);
            }
        }
        return result;
    }
    public static List<String> union(List<String> first, List<String> second) {
        List<String> result = new ArrayList<>(first);
        for (String item2 : second) {
            if (!result.contains(item2)) {
                result.add(item2);
            }
        }
        return result;
    }
    public static List<String> substract(List<String> first, List<String> second) {
        List<String> result = new ArrayList<>();
        for (String item2 : second) {
            if (first.contains(item2)) {
                first.remove(item2);
            }
        }
        return result;
    }
}
