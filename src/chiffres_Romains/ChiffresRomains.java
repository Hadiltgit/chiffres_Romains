package chiffres_Romains;

public class ChiffresRomains {

	private static final String[] SYMBOLES = { "I" , "IV" , "V" , "IX" , "X" , "XL" , "L" , "XC" , "C" , "CD" , "D" , "CM" , "M" };
	private static final int[] VALEURS = { 1 , 4 , 5 , 9 , 10 , 40 , 50 , 90 , 100 , 400 , 500 , 900 , 1000};

	public String toChiffresRomains(int nombre) {

		if (!nonValide(nombre)) {
			throw new IllegalArgumentException("argument non valide");
		}

		int i;
		for (i = 0; i < VALEURS.length && nombre >= VALEURS[i] ; i++) {
			if (nombre == VALEURS[i]) {
				return SYMBOLES[i];
			}
		}
		int k = nombre - VALEURS[i-1];
		StringBuilder result = new StringBuilder(SYMBOLES[i-1]);
		String c;
		if(nombre<10) {
			c = "I";
		}else {
			k = k/10;
			c = "X";
		}
	    while(k>0) {
		    	result.append(c);
		    	k=k-1;
		}
		return result.toString();
		
	}

	public boolean nonValide(int nbr) {
		if (nbr <= 0 || nbr >= 3999) {
			return false;
		}
		return true;
	}
}
