package demo.java;

import java.util.Scanner;


public class opdracht10 {

   public static void main(String[] args) {
	   
	   String Alpha = "abcdefghijklmnopqrstuwvxyz";
	   String invoer;
	   char letter;
	   
       for (int i = 0; i < Alpha.length(); i++) {
    	   Scanner sc = new Scanner(System.in);
    	   invoer = sc.nextLine();
    	   letter  = Alpha.charAt(i);
    	   String s = Character.toString(letter);
    	  
    	   
    	   if (s.equals(invoer)) {
    		  System.out.println("OK");
    		   
    	   }
    	   else {
    		  System.out.println("Fout");
    	   }  
    
       }
       
   }
}

       // Schrijf hier je code



