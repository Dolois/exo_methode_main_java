package exos_methode_main_java;

public class Exo2 {

	public static void Sum(int a, int b, int c, int d, int e, int f) {
		int result;
		result = (a + b + c + d + e + f);
		System.out.println("(" + a + " + " + b + " + " + c + " + " + d + " + " + e + " + " + f + ") = " + result);
	}
	
	public static void main(String[] args) {
		Sum(74, 36, 5, 10, 15, 10);
	}
}
