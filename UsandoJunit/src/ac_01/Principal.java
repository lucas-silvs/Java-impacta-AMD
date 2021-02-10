package ac_01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Principal {

	@Test
	void test() {
		Metodos met = new Metodos();
		
		assertEquals(510,met.menor(),"O menor deve ser 510");
		assertEquals(940,met.maior(),"O maior deve ser 940");
		assertEquals(7540,met.soma(),"A soma é 7040");
		assertEquals(0,met.contar(3),"o 3 não aparece");
		assertEquals(1,met.contar(790),"o 790 aparece 1 vezes");
		assertEquals(2,met.contar(940),"o 940 aparece 2 vezes");
		
		
		
		
	}

}
