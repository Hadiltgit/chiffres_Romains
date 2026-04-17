package chiffres_Romains;

public class ChiffresRomains {

	
	public String toChiffresRomains(int nombre) {
		if (nombre == 1) {
			return "I";
		}
		if(nombre <=0 || nombre >=3999) {
			throw new IllegalArgumentException("argument non valide");
		}
		return String.format("%d", nombre);
	}
	
}
