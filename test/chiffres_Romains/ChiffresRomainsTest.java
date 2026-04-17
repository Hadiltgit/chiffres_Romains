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
	void itr1Test() {
		assertEquals("I",chiffresRomains.toChiffresRomains(1));
	}
	
	@Test
	void itr2Test() {
		assertEquals("II",chiffresRomains.toChiffresRomains(2));
		assertEquals("III",chiffresRomains.toChiffresRomains(3));
	}

	
	@Test
	void itr3Test() {
		assertThrows(IllegalArgumentException.class, ()->chiffresRomains.toChiffresRomains(0));
		assertThrows(IllegalArgumentException.class, ()->chiffresRomains.toChiffresRomains(-1));
		assertThrows(IllegalArgumentException.class, ()->chiffresRomains.toChiffresRomains(3999));
	}
	
	@Test
	void itr4Test() {
		assertEquals("IV",chiffresRomains.toChiffresRomains(4));
	}

	@Test
	void itr5Test() {
		assertEquals("V",chiffresRomains.toChiffresRomains(5));
		assertEquals("VI",chiffresRomains.toChiffresRomains(6)); 
		assertEquals("VIII",chiffresRomains.toChiffresRomains(8)); 
	}
	
	@Test
	void itr6Test() {
		assertEquals("IX",chiffresRomains.toChiffresRomains(9));
	}

}
