import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MetodoTest {

    private Metodo metodo;

    @BeforeEach
    void setUp() {
        metodo = new Metodo();
    }

    @AfterEach
    void tearDown() {
        metodo = null;
    }

    @Test
    void añadirCompletos() {
        metodo.AñadirCompletos();
    }

    @Test
    void quitarCompletos() throws IOException {
        metodo.QuitarCompletos();
    }

    @Test
    void añadirSopaipillas() {
        metodo.AñadirSopaipillas();
    }

    @Test
    void quitarSopaipillas() throws IOException {
        metodo.QuitarSopaipillas();
    }

    @Test
    void añadirPanesConQueso() {
        metodo.AñadirPanesConQueso();
    }

    @Test
    void quitarPanesConQueso() throws IOException {
        metodo.QuitarPanesConQueso();
    }

    @Test
    void calcularValor() {
        metodo.CalcularValor();
    }

    @Test
    void mostrarLista() {
        metodo.MostrarLista();
    }

    @Test
    void mostrarBoleta() {
        metodo.MostrarBoleta();
    }
}