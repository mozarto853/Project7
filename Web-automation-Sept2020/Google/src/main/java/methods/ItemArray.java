package methods;

import java.util.ArrayList;
import java.util.List;

public class ItemArray {

    public static List<String> getComputerListArray(){
        List<String> computers = new java.util.ArrayList<>();
        computers.add("Apple Mac Mini");
        computers.add("Acer Aspire TC");
        computers.add("HP Pavilion 24");
        computers.add("Intel NUC 9");

        return computers;
    }

    public static List<String> getCandyListArray(){
        List<String> candy = new java.util.ArrayList<>();
        candy.add("Hershey");
        candy.add("Snickers");
        candy.add("Tootsie Rolls");
        candy.add("Candy Cane");
        candy.add("Butterscotch");

        return candy;
    }

    public static List<String> animalList(){
        List<String> animals = new java.util.ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Bear");
        animals.add("Chicken");
        animals.add("Wolf");
        animals.add("Hyena");

        return animals;
    }

    public static List<String> animeList(){
        List<String> anime = new java.util.ArrayList<>();
        anime.add("Naruto");
        anime.add("One Piece");
        anime.add("Dragon Ball Z");
        anime.add("Iwatobi Swim Club");

        return anime;
    }

    public static List<String> apiList(){
        List<String> api = new java.util.ArrayList<>();
        api.add("IntelliJ");
        api.add("Eclipse");
        api.add("Netbeans");

        return api;
    }

}
