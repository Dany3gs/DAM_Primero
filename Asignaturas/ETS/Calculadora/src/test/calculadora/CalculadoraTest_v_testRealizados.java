package test.calculadora; 

import calculadora.Calculadora;
import org.junit.*;
import static org.junit.Assert.*;

/** 
* Calculadora Tester. 
* 
* @author <Authors name> 
* @since <pre>nov. 24, 2021</pre> 
* @version 1.0 
*/ 
public class CalculadoraTest_v_testRealizados {
    private static Calculadora calc;

    @BeforeClass
    public static void setupClass() throws Exception {
       // System.out.println("Estamos ejecutando el método setupClass");
        calc = new Calculadora(5,5);
    }

    @Before
    //@Ignore
    public void before() throws Exception {
        System.out.println("Estamos ejecutando el método before");
    }

    @After
    //@Ignore
    public void after() throws Exception {
        System.out.println("Estamos ejecutando el método after");
    }

    /**
    *
    * Method: suma()
    *
    */
    @Test
    public void testSuma() throws Exception {
    //TODO: Test goes here...
        System.out.println("Estamos ejecutando el método testSuma");
        //assertEquals("Error al calcular la suma, el valor esperado es 10", 10, calc.suma());
        assertEquals( 10, calc.suma());
    }

    /**
    *
    * Method: resta()
    *
    */
    @Test
    public void testResta() throws Exception {
    //TODO: Test goes here...
       // System.out.println("Estamos ejecutando el método testResta");
        assertEquals("Error al calcular la resta, el valor esperado es 0", 0, calc.resta());
    }

    /**
    *
    * Method: dividir()
    *
    */
    @Test
    public void testDividir() throws Exception {
    //TODO: Test goes here...
       // System.out.println("Estamos ejecutando el método testdividir");
        assertEquals("Error al calcular la división, el valor esperado es 1", 1, calc.dividir());
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
       // System.out.println("Estamos ejecutando el método tearDownClass");
    }

} 
