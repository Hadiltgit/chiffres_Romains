package chiffres_Romains;

public class ChiffresRomains {

	private String[] magicKey= {"I","IV","V","V","V"};
	private int[] magicValues= { 1 , 4 , 5 , 6 , 8};
	
	public String toChiffresRomains(int nombre) {
		
		if(!nonValide(nombre)) {
			throw new IllegalArgumentException("argument non valide");
		}
		
		for(int i = 0 ; i < magicValues.length ; i++) {
			if(nombre == magicValues[i]) {
				return magicKey[i];
			}
		}
		
		return String.format("%d", nombre);
	}
	
	public boolean nonValide(int nbr) {
		if(nbr <=0 || nbr >=3999) { 
			return false;
		}
		return true;
	}
}
