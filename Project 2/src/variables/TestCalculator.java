package variables;

import java.util.Scanner;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your number: ");
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int input3 = sc.nextInt();
		int result = cal.addition(input1, input2,input3);
		System.out.println(result);
		sc.close();
		
		

	}

}
