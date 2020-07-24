package demo.java;

public class opdracht9 {

	public static void main(String[] args) {

	       String org = "Bruine";
	       String klinkers = "aeiou";
	       
	       
	       for (int i = 0  ; i <org.length(); i++ ){
	    	   
	    	   System.out.print(org.charAt(i));
	    	   
	    	   
	    	   for (int j = 0; j < klinkers.length(); j++) {
	    		   
	    		   
	    		   //System.out.println(org.charAt(i)+">>"+klinkers.charAt(j));
	    		   
	    		   if( org.charAt(i) == klinkers.charAt(j)) {
	    			   
	    			   System.out.print("*");
	    			   
	    		   }
	    		   
	    		   //else {
	    			 //  System.out.println(org.charAt(i));
	    			   //break;
	    		   //}
	    	
	    		   
	    	   }
	    	  
	    	   System.out.println("");
	    	   
	    	   
	       }
	       


	       // Print String org met een letter per regel

	       // De karakters a, o, i, u, e worden gevolgd door een *


	   }
	

}
