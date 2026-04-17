package chiffres_Romains;

public class ChiffresRomains {

	
	public String toChiffresRomains(int nombre) {
		if (nombre == 1) {
			return "I";
		}
		return String.format("%d", nombre);
	}
	
}
