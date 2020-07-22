package demo.java;

import java.util.Random;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		System.out.println("Relaxt opstarten");
		new test().programmabedienen();
		System.out.println("We zijn klaar met het programma");
		Random random = new Random();
	}
	
	void programmabedienen() {
		Kassa kassa = new Kassa();
		kassa.starten();
		System.out.println(kassa.a1.omzet +" omgezet door "+kassa.a1.naam);
		System.out.println(kassa.a2.omzet +" omgezet door "+kassa.a2.naam);
		System.out.println(kassa.a3.omzet +" omgezet door "+kassa.a3.naam);
	}
}
class Attractie{
	String naam;
	int prijs;
	int omzet;
	Attractie(String deNaam, int prijs){
		naam = deNaam;
		this.prijs=prijs;
	}
	void draaien() {
		omzet+=prijs;
		System.out.println("Ik ben aan het draaien, de attractie: "+naam);
	}
}

class Kassa {
	Scanner scanner = new Scanner(System.in);
	Attractie a1 = new Attractie("Botsauto's", 3);
	Attractie a2 = new Attractie("Hawaii", 6);
	Attractie a3 = new Attractie("Spiegelpaleis",9);
	void starten() {
		boolean doorgaan = true;
			while (doorgaan) {
				String deKeuze = vraagOmAttractieKeuze();
				if(deKeuze.equals("q")){
				doorgaan = false;
			}else {
				if(deKeuze.equals("1")) {
					a1.draaien();
				}
				if(deKeuze.equals("2")) {
					a2.draaien();
				}
				if(deKeuze.equals("3")) {
					a3.draaien();
				}
			
			}
		}
	}
	String vraagOmAttractieKeuze() {
		System.out.println("Welke attractie wilt u een kaartje voor hebben?");
		Scanner scanner = new Scanner(System.in);
		String invoer = scanner.nextLine();
		
		System.out.println("u heeft gekozen voor: "+invoer);
		return invoer;
	}
		
}
