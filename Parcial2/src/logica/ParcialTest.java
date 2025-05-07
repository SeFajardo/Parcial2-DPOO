package logica;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParcialTest {
	private Parcial parcial;

	@BeforeEach
	void setUp() {
		this.parcial = new Parcial();
		System.out.println("Se ejecutó setUp, parcial inicializado.");
	}


	@Test
	void testPotencia() throws IllegalArgumentException {
		assertNotNull(parcial, "Parcial no debería ser null después de setUp");
		assertEquals(1728, parcial.potencia(12, 3), "El resultado para 12^3 no es correcto.");
	}
}


