package exos_methode_main_java;

public class Exo8 {
	
	public static void affichage(int a, int b) {
		int result;
		result = a % b;
		System.out.println(a + " mod " + b + " = " + result);
	}

	public static void main(String[] args) {
		affichage(125, 24);
	}
}
