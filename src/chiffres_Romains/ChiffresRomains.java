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
		 StringBuilder result = new StringBuilder();
		if(nombre<=10) {
			int k = nombre - VALEURS[i-1];
		    result.append(SYMBOLES[i-1]);
		    while(k>0) {
		    	result.append("I");
		    	k=k-1;
		    }
		    return result.toString();
		}else {
			while(nombre>10) {
				nombre = nombre-10;
				result.append("X");
			}
			if(nombre == 0) {
				return result.toString();
			}else {
				result.append(toChiffresRomains(nombre));
			}
		    return result.toString();
		}
		
	}

	public boolean nonValide(int nbr) {
		if (nbr <= 0 || nbr >= 3999) {
			return false;
		}
		return true;
	}
}
