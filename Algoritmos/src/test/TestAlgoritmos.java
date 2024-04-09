package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.Algoritmos;

class TestAlgoritmos {

	@Test
	void sumatorio() {
		int sumaEsperada = 10;
		int sumaObtenida = Algoritmos.sumatorio(4);
		assertEquals(sumaEsperada, sumaObtenida);
	}

}
