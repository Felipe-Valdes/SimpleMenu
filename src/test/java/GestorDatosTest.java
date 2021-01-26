import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class GestorDatosTest {
    private GestorDatos gestor = new GestorDatos();
    private Metodo metodo = new Metodo();

    @BeforeEach
    void setUp() {
        gestor = new GestorDatos();
    }

    @AfterEach
    void tearDown() {
        gestor = null;
    }

    @Test
    void imprimirBoleta() throws IOException {
        int resultadoEsperado = 1900;
        metodo.nCompletos = 1;
        metodo.nSopaipillas = 1;
        metodo.nPanesConQueso = 1;
        //este valor representa al total que se paga
        int resultadoObtenido = (metodo.CalcularValor());

        assertEquals(resultadoEsperado, resultadoObtenido);
    }
}