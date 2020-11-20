package Streams;

import java.util.Arrays;
import java.util.List;

public class UseStreams {
    public static void main(String[] args) {


        List<String> list = Arrays.asList("Strawberry", "Vanilla", "Chicken", "Waffles","Sour","Vinerial");

        System.out.println("Iterating using For each loop");
        for(String fruit:list){
            if(fruit.startsWith("S")){
                System.out.println(fruit);
            }
        }
        System.out.println("Iterating using Stream ");
        list.stream()
                .filter((fruit->fruit.startsWith("V")))
                .forEach(fruit->System.out.println(fruit));
    }
}