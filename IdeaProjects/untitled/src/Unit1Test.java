import org.junit.Test;

import static junit.framework.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: ks
 * Date: 4/8/13
 * Time: 12:02 AM
 * To change this template use File | Settings | File Templates.
 */

class UnexpectedResultsException extends Exception {
    UnexpectedResultsException() {
        System.out.println("Мы получили неожиданные значения на тестовой выборке -" +
                " метод работает неверно.");
    }
}

public class Unit1Test {
    @Test
    public void testIsMama() throws UnexpectedResultsException {
        assertTrue(null, Unit1.isMama(0));
        assertTrue(null, Unit1.isMama(1));
        assertTrue(null, Unit1.isMama(5));

        assertTrue("Mama", Unit1.isMama(3));
    }

    @Test
    public void testIsPapa() throws UnexpectedResultsException {
        assertTrue(null, Unit1.isPapa(0));
        assertTrue(null, Unit1.isPapa(1));
        assertTrue(null, Unit1.isPapa(3));

        assertTrue("Papa", Unit1.isPapa(5));
    }
}
