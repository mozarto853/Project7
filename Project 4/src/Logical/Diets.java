package Logical;

import java.util.Scanner;

public class Diets {

	public static void main(String[] args) {
		System.out.println("How much calories does the food has?");
		Scanner sc = new Scanner(System.in);
		int calories =sc.nextInt();
		System.out.println("How many grams of protein does the food has?");
		int protein =sc.nextInt();
		sc.close();
		
		if((calories<300) && (protein<10)) {System.out.println("The meal is healthy");
		
		}else {System.out.println("The meal is NOT healthy");
		
		}
		if(calories>300) {System.out.println("The food has too much calories");
		
		
		}
		if(protein>10) {System.out.println("The food has a good amount of protein");
		
		}

	}
	

}
