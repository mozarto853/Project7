package ds;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UseArrayList {
    public static void main(String [] args){
        System.out.println("Please enter the limit of ArrayList: ");
        Scanner scLimit = new Scanner(System.in);
        int limit = scLimit.nextInt();
        System.out.println("Please enter some numbers: ");
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        for (int j = 0; j < limit; j++) {
                list.add(sc.nextInt());
            }



        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

}
