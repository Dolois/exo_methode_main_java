package exos_methode_main_java;

public class Exo2 {

	public static int Sum(int a, int b, int c, int d, int e, int f) {
		int result;
		result = (a + b + c + d + e + f);
		System.out.println("(" + a + " + " + b + " + " + c + " + " + d + " + " + e + " + " + f + ") = " + result);
		return result;
	}
	
	public static void main(String[] args) {
		int a = 74;
		int b = 36;
		int c = 5;
		int d = 10;
		int e = 15;
		int f = 10;
		
		int retour = Sum(a, b, c, d, e, f);
		System.out.println(retour);
		
	}
}
