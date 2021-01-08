package datasupply;

import java.util.ArrayList;
import java.util.List;

public class ItemArray {
    public static List<String> getComputerListArray(){
        List<String> computers = new ArrayList<>();
        computers.add("Apple Mac Mini");
        computers.add("Acer Aspire TC");
        computers.add("HP Pavilion 24");
        computers.add("Intel NUC 9");

        return computers;
    }

    public static List<String> getCandyListArray(){
        List<String> candy = new ArrayList<>();
        candy.add("Hershey");
        candy.add("Snickers");
        candy.add("Tootsie Rolls");
        candy.add("Candy Cane");
        candy.add("Butterscotch");

        return candy;
    }
}
