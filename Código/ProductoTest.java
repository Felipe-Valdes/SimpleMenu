import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {
    private Metodo productos;

    @BeforeEach
    void setUp() {
        productos = new Metodo();

    }

    @AfterEach
    void tearDown() {
        productos = null;
    }

    @Test
    void añadirCompletos() {
        int resultadoEsperado = 4;
        int resultadoObtenido = productos.añadirCompletos(4);
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

    @Test
    void añadirSopaipillas() {
        int resultadoEsperado = 5;
        int resultadoObtenido = productos.añadirSopaipillas(5);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    void añadirPanesConQueso() {
        int resultadoEsperado = 7;
        int resultadoObtenido = productos.añadirPanesConQueso(7);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    void validar() {
        assertNotNull(productos);
    }
}