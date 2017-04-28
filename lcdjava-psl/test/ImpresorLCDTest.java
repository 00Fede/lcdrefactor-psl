/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author federico
 */
public class ImpresorLCDTest {
    
    public ImpresorLCDTest() {
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
     * Test of procesar method, of class ImpresorLCD.
     */
    @Test
    public void testProcesar() {
        System.out.println("procesar");
        String comando = "5,552";
        int espacioDig = 2;
        ImpresorLCD instance = new ImpresorLCD();
        instance.procesar(comando, espacioDig);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isNumeric method, of class ImpresorLCD.
     */
    @Test
    public void testIsNumeric() {
        System.out.println("isNumeric");
        String cadena = "5454";
        boolean expResult = true;
        boolean result = ImpresorLCD.isNumeric(cadena);
        assertEquals(expResult, result);
    }
    
}
