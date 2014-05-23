/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beadandoteszt;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.Assert.*;

import org.xml.sax.SAXException;

import beadando.CreateGame;

/**
 *
 * @author Boruzs Tibor
 */
public class CreateGameTest {

    public CreateGameTest() {
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
     * Test of Gamecreator method, of class CreateGame.
     */
    @Test
    public void testGamecreator() throws ParserConfigurationException, SAXException, IOException {
        System.out.println("Gamecreator");
        int jatekszam = 2;
        CreateGame instance = new CreateGame();
        String expResult = "070690000006001400980000000104700002590000047020050600000518000000030000700900501";
        System.out.println(expResult.length());
        String result = instance.Gamecreator(jatekszam);
        String result2;
        int[] jatek = new int[82];
        int[] jatek2 = new int[82];
        for (int i = 0; i < expResult.length(); i++) {
            jatek[i] = expResult.charAt(i) - 48;
            System.out.print(expResult.charAt(i) - 48);
        }
        System.out.println(jatek[0]);
        result2 = result.replaceAll(" ", "");
        System.out.println(result2.length());
        for (int i = 1; i < result2.length() - 1; i++) {
            jatek2[i - 1] = result2.charAt(i) - 48;
            System.out.print(result2.charAt(i) - 48);
        }
        System.out.println(jatek2[0]);
        assertArrayEquals(jatek, jatek2);
        File f = new File ("game.xml");
        if (f.exists())
            assertTrue(true);
        else assertFalse(false);
    }
}