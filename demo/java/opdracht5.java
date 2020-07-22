package demo.java;
import java.util.Scanner;

public class opdracht5 {
	
   public static void main(String[] args) {

       String wachtwoord = "java";


       // define Scanner

       Scanner sc = new Scanner(System.in);


       // read input

       String input;

       input = sc.nextLine();
       
       if(wachtwoord.equals(input)) {
    	   System.out.println("Wachtwoord is OK: "+input);
       }
       else {
    	   System.out.println("Wachtwoord is fout: "+input);
       }
      


       // check wachtwoord


   }

}

