package exos_methode_main_java;

public class Exo9 {
	
	public static void affichage(int a) {
		for (int i = 1; i < 11; i++) {
			int result = 0; 
			result = 8 * i;
			System.out.println(a + " x " + i + " = " + result);
		}
	}

	public static void main(String[] args) {
		affichage(8);
	}
}
