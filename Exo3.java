package exos_methode_main_java;

public class Exo3 {
	
	/**
	 * cette methode retourne le resultat de type double d'une division
	 * @param dbl1
	 * @param dbl2
	 * @return result
	 */
	public static double division(double dbl1, double dbl2) {
		double result = dbl1 / dbl2;
	 	return result;
	}

	public static void main(String[] args) {
		double dbl1 = 50;
		double dbl2 = 3;
		
		/* appel la methode division en passant deux arguments de type double
		 * et recupere le resulat de type double de la methode division 
		 */
		double resultat = division(dbl1, dbl2);
		
		/* affiche de deux façons le resultat de la methode division */
		System.out.println(dbl1 + " / " + dbl2 + " = " + resultat);
		System.out.println(resultat);
	}

}
