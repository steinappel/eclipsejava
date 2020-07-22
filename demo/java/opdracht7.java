package demo.java;

public class opdracht7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Ik programmeer Java!";

	    String reverse = "";
	    String reverse2="";

	    System.out.println(str);
	    
	    for(int i = str.length() -1 ; i>=0;  i--) {
	    	reverse = reverse+str.charAt(i);
	    	
	    }
	    
	    for(int i = 0 ; i<str.length();  i++) {
	    	reverse2 = reverse2+str.charAt(str.length()-(i+1));
	    }
	    	
	    
	    
	    
	    
	       
	       
	       
	       
	    System.out.println(reverse);
	    System.out.println(reverse2);


	       // reverse = omgekeerde van str
	    		   
	    		   

	    
	       // print reverse

	}

}
