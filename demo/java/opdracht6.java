package demo.java;

import java.util.Scanner;

public class opdracht6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double lengte, gewicht, bmi;
		System.out.println("Lengte in meter: ");
		
		
		lengte = sc.nextDouble();
		System.out.println("Gewicht in kilogram: ");
		gewicht = sc.nextDouble();


	    bmi = gewicht/(lengte*lengte);
	    
	    if (bmi < 18) {
	    	
	    	System.out.println(bmi +" Geel");
	    }
	    else if (bmi > 25) {
	    	System.out.println(bmi +" Rood");
	    	
	    }
	    else {
	    	System.out.println(bmi + " Groen");
	    }
	    
	    


	    // vergelijk BMI met grenzen: <18, >25, of ertussen in en print kleur
		// TODO Auto-generated method stub

	}

}
