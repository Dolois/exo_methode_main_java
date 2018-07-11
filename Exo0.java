package exos_methode_main_java;

public class Exo0 {
	public static String w = "Hello";
	
	public static int addition(int a, int b) {
		int sum = 0;
		sum = a + b;
		return sum;
	}

	public static void affichage(String s) {
		System.out.println("Welcome " + s);
	}
	
	public static void main(String[] args) {
		String w1 = "Hello";	
		int var1 = 10;
		int var2 = 20;
		int somme;
		 
		somme = addition(var1, var2);
		System.out.println(somme);
		affichage(w1 + w);
	}
}
