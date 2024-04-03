import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testEntredaNula() { assertEquals(-1, Main.nuevaBebida("")); }
    @Test
    void testEntredaEnBlancoDos() { assertEquals(-1, Main.nuevaBebida("")); }
    @Test
    void testEntredaEnBlanco() { assertEquals(-1, Main.nuevaBebida(",")); }

    @Test
    void testNombreAlfabetico() { assertEquals(1, Main.nuevaBebida("Cafe,1")); }

    @Test
    void testNombreNoAlfabetico() { assertEquals(-1, Main.nuevaBebida("Caf878#fsd,1")); }

    @Test
    void testLongitudMenor() {
        assertEquals(-1, Main.nuevaBebida(",1"));
    }

    @Test
    void testCorrecta() {
        assertEquals(1, Main.nuevaBebida("Cafe,1"));
    }

    @Test
    void testLongitudMayor() {
        assertEquals(-1, Main.nuevaBebida("Espresso Intenso Grande,1"));
    }

    @Test
    void testTamanoBebida() {
        assertEquals(1, Main.nuevaBebida("Machiatto,1"));
    }

    @Test
    void testSinTamano() {
        assertEquals(-1, Main.nuevaBebida("Machiatto,"));
    }

    @Test
    void testTamanoBebidaMenor() {
        assertEquals(-1, Main.nuevaBebida("Machiatto,0"));
    }

    @Test
    void testTamanoMayor() {
        assertEquals(-1, Main.nuevaBebida("Machiatto,49"));
    }

    @Test
    void testTamanoEntero() {
        assertEquals(1, Main.nuevaBebida("Machiatto,9"));
    }

    @Test
    void testTamanoNoEntero() {
        assertEquals(-1, Main.nuevaBebida("Machiatto,T"));
    }

    @Test
    void testVariosTamanos() {
        assertEquals(1, Main.nuevaBebida("Machiatto,1,2,3,4,5"));
    }

    @Test
    void testDemasiadosTamanos() {
        assertEquals(-1, Main.nuevaBebida("Machiatto,1,2,3,4,5,7,8"));
    }

    @Test
    void testTamanosDesordenados() {
        assertEquals(-1, Main.nuevaBebida("Machiatto,1,3,1,5"));
    }

    @Test
    void testParametrosDesordenados() {
        assertEquals(-1, Main.nuevaBebida("1,3,1,5,Machiatto"));
    }

    @Test
    void testMedidasNoGuion() {
        assertEquals(-1, Main.nuevaBebida("Machiatto,1-3-1,5"));
    }

    @Test
    void testMedidasMasComas() {
        assertEquals(-1, Main.nuevaBebida("Machiatto,1,,3-1,5"));
    }

    @Test
    void testEspaciosBlancos() {
        assertEquals(1, Main.nuevaBebida(" Machiatto    ,1,   2,3 ,4 "));
    }
}