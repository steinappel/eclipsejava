package demo.java;

import java.util.Scanner;

public class opdracht3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Scanner scanner = new Scanner(System.in);
       int cijfer = scanner.nextInt();
       
       if (cijfer > 6){
    	   System.out.println("hoger");
    	   
       }
       else if( cijfer == 6) {
    	   System.out.println("gelijk");
       }
       else {
    	   System.out.println("lager");
       }


       // Vergelijk cijfer met 6

	}

}
