package exos_methode_main_java;

public class Exo11 {

	public static void affichage(double a, double b) {
		double result = 0;
		int i = 2;
		int j;
		/**
		 	* <p> 
		 	* Je décompose l'opération suivante en cinq parties dans la boucle for :
		 	* 
		 	* 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
		 	* 
		 	* decomposition de l'operation dans le code :
		 	* 
		 	* 1) 2.6666666667 = 4.0 * (1 - (1.0/3);
		 	* 2) 2.8666666667 = 2.6666666667 + (1.0/5);
		 	* 3) 2.7238095238 = 2.8666666667 - (1.0/7);
		 	* 4) 2.8349206349 = 2.7238095238 + (1.0/9);
		 	* 5) 2.7440115440 = 2.8349206349 - (1.0/11));
		 	* 
		 	* </p>
		 	* 
		 */
		for (j = 1; j < 6; j++) {

			switch (j) {
				case 1:
					System.out.println(b+i*j);
					result = a * (b - (b/(b+i*j)));
					System.out.println("le resultat : " + result);
					break;
				case 2:
					System.out.println(b+i*j);
					result = result + (b/(b+i*j));
					System.out.println("le resultat : " + result);
					break;
				case 3:
					System.out.println(b+i*j);
					result = result - (b/(b+i*j));
					System.out.println("le resultat : " + result);
					break;
				case 4:
					System.out.println(b+i*j);
					result = result + (b/(b+i*j));
					System.out.println("le resultat : " + result);
					break;
				case 5:
					System.out.println(b+i*j);
					result = result - (b/(b+i*j));
					break;
				default:
					System.out.println("Abandon,erreur de calcul");
					break;
			}
		}
		System.out.println("le resultat : " + result);
	}
	
	public static void main(String[] args) {
		double a = 4;
		double b = 1;
		affichage(a, b);
	}
}
