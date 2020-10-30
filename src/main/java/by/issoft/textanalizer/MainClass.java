package by.issoft.textanalizer;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.apache.commons.collections4.MultiSet;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class MainClass {

    @SneakyThrows
    public static void main(String[] args) {



        String text = String.valueOf(Files.readAllLines(Paths.get("src/main/resources/text.txt")));


        List<String> list = Arrays.asList(text.split(" "));
        text.replaceAll(",","");
        Set<String> words = new HashSet<String>(list);
     //   Set<String> mostRepeated = null;

        for (String word : words) {
            System.out.println(word + ": " + Collections.frequency(list, word));
        }
//        for (Set<String> e : text.entrySet(words)) {
//                if (mostRepeated == null || mostRepeated.getValue() < e.getValue())
//                    mostRepeated = e;
//            System.out.println(mostRepeated);
//            }
//            //return mostRepeated;


//        public static Entry<String, Integer> get10MostCommon(WordStream words) {
//
//            ArrayList<String> list = new ArrayList<String>();
//            Map<String, Integer> stringsCount = new HashMap<>();
//            Map.Entry<String, Integer> mostRepeated = null;

//            for (String i : words) {
//                list.add(i);
//            }
//
//            for (String s : list) {
//                Integer c = stringsCount.get(s);
//                if (c == null)
//                    c = new Integer(0);
//                c++;
//                stringsCount.put(s, c);
//            }
//
//            for (Map.Entry<String, Integer> e : stringsCount.entrySet()) {
//                if (mostRepeated == null || mostRepeated.getValue() < e.getValue())
//                    mostRepeated = e;
//            }
//            return mostRepeated;
//        }

        //____________________
//        Map<String, Long> map = list.strem()
//                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
//
//        List<Map.Entry<String, Long>> result = map.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//                .limit(10)
//                .collect(Collectors.toList());

    }




}
