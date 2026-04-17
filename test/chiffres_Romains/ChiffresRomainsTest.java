package chiffres_Romains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChiffresRomainsTest {
    
	ChiffresRomains chiffresRomains ;
	
	@BeforeEach
	void setUp() throws Exception {
		chiffresRomains = new ChiffresRomains() ;
	}

	@Test
	void toChiffresRomainsTest() {
		assertEquals("I",chiffresRomains.toChiffresRomains(1));
	}

}
