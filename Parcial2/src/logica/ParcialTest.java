package logica;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ParcialTest {

    @Test
    public void testCalculoCorrecto() {
        assertEquals(1024, Parcial.potencia(2, 10));
    }
    
    @Test
    void testExponenteNegativo() {
    		ArithmeticException exception = assertThrows(ArithmeticException.class,() -> Parcial.potencia(2, -3)
        );
        
        assertEquals("El exponente no puede ser negativo", exception.getMessage());
    }
    
    @Test
    void testMayorDeInt() {
        ArithmeticException exception = assertThrows(
            ArithmeticException.class,
            () -> Parcial.potencia(2, 31)
        );
        assertEquals("La potencia excede el límite de entero", exception.getMessage());
    }
}


