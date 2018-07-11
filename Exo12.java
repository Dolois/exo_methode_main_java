package exos_methode_main_java;

public class Exo12 {

	public static void affichage(double a, double b, double c, int d) {
		double result;
		result = (a + b + c) / d;
		System.out.println("(" + a + " + " + b + " + " + c + ") / " + d + " = " + result);
	}
	
	public static void main(String[] args) {
		affichage(85.50, 103.75, 56.11, 3);
	}
}
