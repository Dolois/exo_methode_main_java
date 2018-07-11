package exos_methode_main_java;

public class Exo13 {
	
	public static void affichage(double a, double b) {
		double tempo;
		System.out.println("avant number a : " + a);
		System.out.println("avant number b : " + b);
		tempo = a;
		a = b;
		b = tempo;
		System.out.println("apres number a : " + a);
		System.out.println("apres number b : " + b);
	}

	public static void main(String[] args) {
		affichage(45.87, 122.44);
	}
}
