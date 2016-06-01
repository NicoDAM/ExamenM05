package penjat;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Classe Test per ralitzar proves sobre el programa del penjat
 * 
 * @author Marina
 */
public class MainIT {

    /**
     * Test del metode nova_lletra, de la classe Main.
     */
    @Test
    public void testNova_lletra() {
        char nova = 'a';
        boolean expResult = true;
        boolean result = Main.nova_lletra(nova);
        assertEquals(expResult, result);
    }
   
}
 