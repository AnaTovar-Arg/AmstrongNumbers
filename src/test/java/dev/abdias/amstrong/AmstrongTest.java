package dev.abdias.amstrong;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AmstrongTest {
    private Amstrong amstrong;
    @BeforeEach
    public void setUp() {
        amstrong = new Amstrong();
    }

    @Test
    void testIsAmstrongNumb_371() {
        assertEquals(true, Amstrong.isAmstrongNumnb(371), "El número positivo debe coincidir");
    }

    @Test
    void testIsAmstrongNumb_1634() {
        assertEquals(true, Amstrong.isAmstrongNumnb(1634), "El número positivo debe coincidir");
    }

    @Test
    void testIsNotAmstrongNumb_351() {
        assertEquals(false, Amstrong.isAmstrongNumnb(351), "El número positivo debe coincidir");
    }

    @Test
    void testIsNotAmstrongNumb_2015() {
        assertEquals(false, Amstrong.isAmstrongNumnb(2015), "El número positivo debe coincidir");
    }
}
