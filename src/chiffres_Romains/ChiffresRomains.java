package chiffres_Romains;

public class ChiffresRomains {

	private String[] magicKey = { "I" , "IV" , "V" , "IX" };
	private int[] magicValues = { 1 , 4 , 5 , 9 };

	public String toChiffresRomains(int nombre) {

		if (!nonValide(nombre)) {
			throw new IllegalArgumentException("argument non valide");
		}

		int i;
		for (i = 0; i < magicValues.length && nombre >= magicValues[i] ; i++) {
			if (nombre == magicValues[i]) {
				return magicKey[i];
			}
		}
		int k = nombre - magicValues[i-1];
	    StringBuilder result = new StringBuilder(magicKey[i-1]);
	    while(k>0) {
	    	result.append("I");
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
