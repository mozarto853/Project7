package Logical;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		System.out.println("Please enter a number to check if it is Even or Odd");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		if(num % 2==0) {System.out.println(num + " is even");

	} else {System.out.println(num + " is odd"); }

}
}
