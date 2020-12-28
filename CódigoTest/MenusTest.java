import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenusTest {
    private Menus menu1;

    @BeforeEach
    void setUp() {
        menu1 = new Menus();
    }

    @AfterEach
    void tearDown() {
        menu1 = null;
    }

    @Test
    void ventana1() {
        assertNotNull(menu1);
    }

    @Test
    void ventana2() {
        assertNotNull(menu1);
    }

    @Test
    void ventana3() {
    }
}