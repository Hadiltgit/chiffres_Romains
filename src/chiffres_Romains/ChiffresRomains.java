package chiffres_Romains;

public class ChiffresRomains {

	private String[] magicKey= {"I","IV"};
	private int[] magicValues= { 1 , 4};
	
	public String toChiffresRomains(int nombre) {
		
		if(nombre <=0 || nombre >=3999) {
			throw new IllegalArgumentException("argument non valide");
		}
		
		for(int i = 0 ; i < magicValues.length ; i++) {
			if(nombre == magicValues[i]) {
				return magicKey[i];
			}
		}
		
		return String.format("%d", nombre);
	}
	
}
