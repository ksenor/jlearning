import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: ks
 * Date: 4/8/13
 * Time: 12:02 AM
 * To change this template use File | Settings | File Templates.
 */

public class Ex1Test {
    @Test
    public void testIsMama() throws Exception {
        assertEquals(null, Ex1.isMama(0));
        assertEquals(null, Ex1.isMama(1));
        assertEquals(null, Ex1.isMama(5));

        assertEquals("Mama", Ex1.isMama(3));
    }

    @Test
    public void testIsPapa() throws Exception {
        assertEquals(null, Ex1.isPapa(0));
        assertEquals(null, Ex1.isPapa(1));
        assertEquals(null, Ex1.isPapa(3));

        assertEquals("Papa", Ex1.isPapa(5));
    }

    @Test
    public void testIsPapaMama() throws Exception {
        assertEquals(null, Ex1.isPapaMama(1));
        assertEquals(null, Ex1.isPapaMama(2));
        assertEquals(null, Ex1.isPapaMama(3));

        assertEquals("PapaMama", Ex1.isPapaMama(15));
    }
}
