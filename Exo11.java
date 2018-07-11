package exos_methode_main_java;

public class Exo11 {

	public static void affichage(double a, double b) {
		double result = 0;
		int i = 2;
		int j;
		
		for (j = 1; j < 6; j++) {
			
			switch (j) {
				case 1:
					result = 4.0 * (b - (b / (b + (i*j))));
					break;
				case 2:
					result = result + (b / (b + (b + (i*j))));
					break;
				case 3:
					result = result - (b / (b + (b + (i*j))));
					break;
				case 4:
					result = result + (b / (b + (b + (i*j))));
					break;
				case 5:
					result = result - (b / (b + (b + (i*j))));
					System.out.println(result);
					break;
				default:
					result = 0;
					break;
			}
		}
	}
	
	public static void main(String[] args) {
		affichage(4, 1);
	}
}
