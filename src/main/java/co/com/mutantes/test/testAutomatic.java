package co.com.mutantes.test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import co.com.mutantes.util.ismutant;

public class testAutomatic {
	
	@Test
    public void testrestT() {
		String[] dna = {"ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"};
        boolean testres = ismutant.isMutant(dna);
        assertTrue(testres == true);
    }
	
	@Test
    public void testrestT1() {
		String[] dna = {"AAAA","TTTT","GTCA","GTGG"};
        boolean testres = ismutant.isMutant(dna);
        assertTrue(testres == true);
    }
	
	@Test
    public void testrestF() {
		String[] dna = {"AATA","TATT","GTCA","GTGG"};
        boolean testres = ismutant.isMutant(dna);
        assertTrue(testres == true);
    }
	
	@Test
    public void testrestF1() {
		String[] dna = {"AATE","TATT","GTCA","GTGG"};
        boolean testres = ismutant.isMutant(dna);
        assertTrue(testres == true);
    }

}
