package demo.java;

import java.util.Scanner;

public class opdracht15 {

	public static void main(String[] args) {
		
		String[] dag = {"Maandag", "Dinsdag", "Woensdag", "Donderdag", "Vrijdag", "Zaterdag" , "Zondag"};
		String[] maand = {"Jan", "Feb", "Ma", "Ap", "Mei", "Juni", "Juli", "Aug", "Sept", "Okt", "Nov", "Dec"};
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welke weekdag is 1 januari?");
		String firstday = sc.nextLine();
		System.out.println("Welk jaar is het?");
		
		int waarde = 0;
		
		for (int l = 0; l < 7;l++) {
			if (firstday.equals(dag[l])){
				waarde = l;	
				break;
			}
			
		}
	
		
		int jaar = sc.nextInt();
		if (jaar % 4 == 0) {
			days[1] = 29;
		}
		
		int count = waarde;
		
		for(int i = 0; i< maand.length; i++) {
			System.out.println(maand[i]);
			System.out.println("");
			for(int j = 0 ; j < days[i]; j++) {
				
				
				if (count==7) {
					count = 0;
					System.out.println("");
				}
				
				System.out.print((dag[count]+" "+(j+1) +" "+maand[i]+", "+jaar+" "));
				count++;
			}
			System.out.println("");
			
			
		
		
			System.out.println("");
		}
		

		
		
		
	}

}
