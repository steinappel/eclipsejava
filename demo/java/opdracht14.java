package demo.java;

import java.util.ArrayList;
import java.util.Collections;

public class opdracht14 {

	public static void main(String[] args) {
		
		String[] kleur = {"Harten ", "Schoppen ", "Klaveren ", "Ruiten "};
		ArrayList <String> deck = new ArrayList<String>();
		for (int i = 0; i < 4;i++) {
			for(int j = 1; j < 14; j++) {
				if (j==1) {
					System.out.println(kleur[i] + "Aas");
					deck.add(kleur[i]+"Aas");
				}
				else if(j == 11) {
					System.out.println(kleur[i] + "Boer");
					deck.add(kleur[i]+"Boer");
					
				}
				else if(j == 12) {
					System.out.println(kleur[i] + "Vrouw");
					deck.add(kleur[i]+"Vrouw");
					
				}
				else if(j == 13) {
					System.out.println(kleur[i] + "Koning");
					deck.add(kleur[i]+"Koning");
				}
				
				else {
					System.out.println(kleur[i] + j);
					deck.add(kleur[i]+j);
				}
			
			}
			
		}
		
		Collections.shuffle(deck);
		System.out.println(deck);
		
		
		
		// TODO Auto-generated method stub

	}

}
