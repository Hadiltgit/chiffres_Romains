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
		assertEquals("2",chiffresRomains.toChiffresRomains(2));
		assertEquals("3",chiffresRomains.toChiffresRomains(3));
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
		assertEquals("V",chiffresRomains.toChiffresRomains(6));
		assertEquals("V",chiffresRomains.toChiffresRomains(8));
	}

}
