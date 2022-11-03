package Dani.TA21;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class AppTest 
{
	Calcula calcu=new Calcula();
	
	@BeforeAll
	public static void testbeforeClass(){
	System.out.println("Test Calcula");
	}

	@BeforeEach
	public void before(){
		System.out.println("Before");
		calcu= new Calcula();
	}
	
	@Test
	public void testSuma() {
		String result=calcu.calculaResultado("4+5");
		String esperado="9.0";
		assertEquals(result,esperado);
	}

	@Test
	public void testResta() {
		String result=calcu.calculaResultado("4-5");
		String esperado="-1.0";
		assertEquals(result,esperado);
	}
	
	@Test
	public void testMultiplicacion() {
		String result=calcu.calculaResultado("4x5");
		String esperado="20.0";
		assertEquals(result,esperado);
	}
	
	@Test
	public void testDivision() {
		String result=calcu.calculaResultado("15/2");
		String esperado="7.5";
		assertEquals(result,esperado);
	}
	
	@Test
	public void testDivisionExcepcion() {
		String result=calcu.calculaResultado("15/0");
		assertEquals(result,"Operacion no válida");
	}
	
	@Test
	public void testPotencia() {
		String result=calcu.calculaResultado("5²");
		String esperado="25.0";
		assertEquals(result,esperado);
	}
	
	@Test
	public void testraizcuadrada() {
		String result=calcu.calculaResultado("√25");
		String esperado="5.0";
		assertEquals(result,esperado);
	}
	
	@AfterEach
	public void after() {
		System.out.println("After");
	}
	
	@AfterAll
	public static void testbeforeAfter(){
		System.out.println("Final Test Calcula");
	}
}
