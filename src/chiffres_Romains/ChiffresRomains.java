package chiffres_Romains;

public class ChiffresRomains {

	private static final String[] SYMBOLES = { "I" , "IV" , "V" , "IX" , "X" , "XL" , "L" , "XC" , "C" , "CD" , "D" , "CM" , "M" };
	private static final int[] VALEURS = { 1 , 4 , 5 , 9 , 10 , 40 , 50 , 90 , 100 , 400 , 500 , 900 , 1000};

	public String toChiffresRomains(int nombre) {

		if (!nonValide(nombre)) {
			throw new IllegalArgumentException("argument non valide");
		}

		StringBuilder result = new StringBuilder();

	    for (int i = VALEURS.length - 1; i >= 0; i--) {
	        while (nombre >= VALEURS[i]) {
	            result.append(SYMBOLES[i]);
	            nombre -= VALEURS[i];
	        }
	    }

	    return result.toString();
	}

	public boolean nonValide(int nbr) {
		if (nbr <= 0 || nbr > 3999) {
			return false;
		}
		return true;
	}
}
