package Streams;

import java.util.Arrays;
import java.util.List;

public class IterateList {
    public static void main(String[] args) {

        List<String> electronicsList = Arrays.asList("Laptop", "Tablet", "Monitor", "Television");
        electronicsList.forEach(System.out::println);
        electronicsList.forEach(Electronics::countWordLength);

    }
}
