package TF;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		System.out.println("Please enter 2 numbers");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		if(num1<num2) {
			System.out.println("The Number " + num1 + " is less than " + num2);
		} else {
			System.out.println("The Number " + num1 + " is greater than " + num2);
		}
		

	}

}
