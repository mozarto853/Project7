package ds;

public class UseArray {


    public static void main(String[] args) {
    int [] number = new int[5];
    number[0]=5;
    number[1]=10;
    number[2]=30;
    number[3]=100;
    number[4]=350;

    System.out.println(number[4]);
    System.out.println(number[3] + number[1]);
    for(int i=0; i<number.length; i++){System.out.println(number[i]);}

    char [] letters = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
    for(int j=0; j<letters.length; j++){System.out.println(letters[j]);}
    }
}