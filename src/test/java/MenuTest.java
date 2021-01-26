import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {
    private Menu menu;


    @BeforeEach
    void setUp() {
        menu = new Menu();
    }

    @AfterEach
    void tearDown() {
        menu = null;
    }

    @Test
    void ventana1() throws IOException {
        menu.Ventana1();
    }

    @Test
    void ventana2() throws IOException {
        menu.Ventana2();
    }

    @Test
    void ventana3() throws IOException {
        menu.Ventana3();
    }
}