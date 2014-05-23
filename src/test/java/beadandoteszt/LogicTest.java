/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beadandoteszt;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import beadando.JatekLogic;
import static org.junit.Assert.*;

/**
 *
 * @author Boruzs Tibor
 */
public class LogicTest {

    public LogicTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of logika method, of class Logic.
     */
    @Test
    @SuppressWarnings("empty-statement")
    public void testLogika() {
        int[] temp = {0, 0, 7, 0, 6, 9, 0, 0, 0, 0, 0, 0, 6, 0, 0, 1, 4, 0, 0, 9, 8, 0, 0, 0, 0, 0, 0, 0, 1, 0, 4, 7, 0, 0, 0, 0, 2, 5, 9, 0, 0, 0, 0, 0, 4, 7, 0, 2, 0, 0, 5, 0, 6, 0, 0, 0, 0, 0, 5, 1, 8, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 7, 0, 0, 9, 0, 0, 5, 0, 1};
        String flag = "teszt";
        JatekLogic teszt = new JatekLogic(2, 1, 7, temp, flag);
        int expResult = 7;
        int result = teszt.logika();
        assertNotEquals(expResult, result);

        JatekLogic teszt2 = new JatekLogic(9, 3, 0, temp, flag);
        int expResult2 = 3;
        int result2 = teszt2.logika();
        assertEquals(expResult2, result2);

        JatekLogic teszt3 = new JatekLogic(17, 5, 0, temp, flag);
        int expResult3 = 5;
        int result3 = teszt3.logika();
        assertEquals(expResult3, result3);

        JatekLogic teszt4 = new JatekLogic(27, 4, 0, temp, flag);
        int expResult4 = 4;
        int result4 = teszt4.logika();
        assertEquals(expResult4, result4);

        JatekLogic teszt5 = new JatekLogic(31, 4, 0, temp, flag);
        int expResult5 = 4;
        int result5 = teszt5.logika();
        assertEquals(expResult5, result5);

        JatekLogic teszt6 = new JatekLogic(37, 1, 5, temp, flag);
        int expResult6 = 1;
        int result6 = teszt6.logika();
        assertEquals(expResult6, result6);

        JatekLogic teszt7 = new JatekLogic(46, 1, 5, temp, flag);
        int expResult7 = 1;
        int result7 = teszt7.logika();
        assertEquals(expResult7, result7);

        JatekLogic teszt8 = new JatekLogic(56, 1, 5, temp, flag);
        int expResult8 = 1;
        int result8 = teszt8.logika();
        assertEquals(expResult8, result8);
        JatekLogic teszt9 = new JatekLogic(61, 1, 5, temp, flag);
        int expResult9 = 1;
        int result9 = teszt9.logika();
        assertEquals(expResult9, result9);

        JatekLogic teszt10 = new JatekLogic(71, 1, 5, temp, flag);
        int expResult10 = 1;
        int result10 = teszt10.logika();
        assertEquals(expResult10, result10);

        JatekLogic teszt11 = new JatekLogic(80, 1, 5, temp, flag);
        int expResult11 = 1;
        int result11 = teszt11.logika();
        assertEquals(expResult11, result11);

        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
}
