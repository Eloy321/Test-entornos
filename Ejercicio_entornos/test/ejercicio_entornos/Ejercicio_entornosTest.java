/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ejercicio_entornos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author elolop
 */
public class Ejercicio_entornosTest {
    
    public Ejercicio_entornosTest() {
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
     * Test of multiplica method, of class Ejercicio_entornos.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = Ejercicio_entornos.multiplica(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     /**
     * Test of multiplica method, of class Ejercicio_entornos.
     */
        @Test(timeout=)
    public void testMultiplicaTimeout() {
        System.out.println("multiplica");
        int a = 35000;
        int b = 35000;
        int result = Ejercicio_entornos.multiplica(a, b);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of factorial method, of class Ejercicio_entornos.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        int a = 0;
        int expResult = 0;
        int result = Ejercicio_entornos.factorial(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Ejercicio_entornos.
     */
    @Ignore 
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Ejercicio_entornos.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
