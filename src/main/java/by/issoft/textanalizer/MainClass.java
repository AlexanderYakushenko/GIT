package by.issoft.textanalizer;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class MainClass {

    @SneakyThrows
    public static void main(String[] args) {



        String text = String.valueOf(Files.readAllLines(Paths.get("src/main/resources/text.txt")));


        List<String> list = Arrays.asList(text.split(" "));
        text.replaceAll(",","");
        Set<String> words = new HashSet<String>(list);
        for (String word : words) {
            System.out.println(word + ": " + Collections.frequency(list, word));
        }
    }




}
