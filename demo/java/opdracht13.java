package demo.java;

import java.util.ArrayList;
import java.util.Scanner;

public class opdracht13 {

	public static void main(String[] args) {
		ArrayList <String> woorden = new ArrayList<String>();
		System.out.println("Ik ga op vakantie en neem mee...");
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		woorden.add(input);
		System.out.println("Ik ga op vakantie en neem mee..." + woorden);
		
		char letter = input.charAt(input.length()-1);
		
		//System.out.println(input.charAt(input.length()-1));
		
		for (int i=0 ; i < 100; i++) {
			String input2 = sc.nextLine();
			if (letter == input2.charAt(0)) {
				woorden.add(input2);
				letter = input2.charAt(input2.length()-1);
				System.out.println("Ik ga op vakantie en neem mee..." + woorden);
			}
			else {
				System.out.println("try again");
			}
			
			
		}
		
		
		
		
		// TODO Auto-generated method stub

	}

}
