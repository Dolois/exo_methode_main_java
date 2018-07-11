package exos_methode_main_java;

public class Exo10 {
	
	public static void affichage(double a, double b, double c, double d) {
		double result;
		result = ((a * b - b * b) / (c - d));
		System.out.println("(( " + a + " * " + b + " - " + b + " * " + b + ") / (" + c + " - " + d + ")) = " + result);
	}

	public static void main(String[] args) {
		affichage(25.5, 3.5, 40.5, 4.5);
	}

}
