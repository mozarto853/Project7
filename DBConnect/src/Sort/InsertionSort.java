package Sort;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String [] args){

        int[] book = {3, 5, 95, 4, 7, 11, 8, 10, 30, 15, 90, 40, 31};
        int temp = 0;
        for(int i=0; i<book.length; i++){
            for(int j=i; j>0; j--){
                if(book[j]<book[j-1]){
                    temp = book[j];
                    book[j] = book[j-1];
                    book[j-1] = temp;
                }
            }
        }

        for(int n=0; n<book.length; n++){
            System.out.println(book[n]);
        }

    }
}
