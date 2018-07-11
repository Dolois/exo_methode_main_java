package exos_methode_main_java;

public class Exo4 {
	
	public static void affichage1(int a, int b, int c) {
		int result;
		result = a + b * c;
		System.out.println(result);
	}
	
	public static void affichage2(int a, int b, int c) {
		int result;
		result = (a + b) % c;
		System.out.println(result);
	}
	
	public static void affichage3(int a, int b, int c, int d) {
		int result;
		result = a + b * c / d;
		System.out.println(result);
	}

	public static void affichage4(int a, int b, int c, int d, int e, int f) {
		int result;
		result = a + b / c * d - e % f;
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		affichage1(-5, 8, 6);
		affichage2(55, 9, 9);
		affichage3(20, -3, 5, 8);
		affichage4(5, 15, 3, 2, 8, 3);
	}
}
