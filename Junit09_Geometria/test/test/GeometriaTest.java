package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;

class GeometriaTest {
	
	Geometria geometria;

	@BeforeAll
	static void testbeforeClass(){
		System.out.println("Test Geometria");
	}

	@BeforeEach
	void before(){
		System.out.println("Before");
		geometria= new Geometria();
	}
	
	@Test
	void testconstructor() {
		geometria=new Geometria(5);
	
	}

	@Test
	void testareacuadrado() {
		int area=geometria.areacuadrado(4);
		int resultado=16;
		assertEquals(area,resultado);
	}
	
	@Test
	void testareacirculo() {
		double area=geometria.areaCirculo(5);
		double resultado=78.54;
		assertEquals(area,resultado,0.1);
	}
	
	@Test
	void testareatriangulo() {
		int area=geometria.areatriangulo(5,3);
		double resultado=7.5;
		assertEquals(area,resultado,0.5);
	}
	
	@Test
	void testarearectangulo() {
		int area=geometria.arearectangulo(5,3);
		int resultado=15;
		assertEquals(area,resultado);
	}
	
	@Test
	void testareapentagono() {
		int area=geometria.areapentagono(5,3);
		double resultado=7.5;
		assertEquals(area,resultado,0.5);
	}
	
	@Test
	void testarearombo() {
		int area=geometria.arearombo(5,4);
		double resultado=10;
		assertEquals(area,resultado,0.5);
	}
	
	@Test
	void testarearomboide() {
		int area=geometria.arearomboide(5,3);
		int resultado=15;
		assertEquals(area,resultado);
	}
	
	@Test
	void testareatrapecio() {
		int area=geometria.areatrapecio(5,3,2);
		int resultado=8;
		assertEquals(area,resultado);
	}
	
	@Test
	void testfiguracuadrado() {
		String prueba=geometria.figura(1);
		String resultado="cuadrado";
		assertEquals(prueba,resultado);
	}
	
	@Test
	void testfiguracirculo() {
		String prueba=geometria.figura(2);
		String resultado="Circulo";
		assertEquals(prueba,resultado);
	}
	
	@Test
	void testfiguratrianguloo() {
		String prueba=geometria.figura(3);
		String resultado="Triangulo";
		assertEquals(prueba,resultado);
	}
	
	@Test
	void testfigurarectangulo() {
		String prueba=geometria.figura(4);
		String resultado="Rectangulo";
		assertEquals(prueba,resultado);
	}
	
	@Test
	void testfigurapentagono() {
		String prueba=geometria.figura(5);
		String resultado="Pentagono";
		assertEquals(prueba,resultado);
	}
	
	@Test
	void testfigurarombo() {
		String prueba=geometria.figura(6);
		String resultado="Rombo";
		assertEquals(prueba,resultado);
	}
	
	@Test
	void testfiguraromboide() {
		String prueba=geometria.figura(7);
		String resultado="Romboide";
		assertEquals(prueba,resultado);
	}
	
	@Test
	void testfiguratrapecio() {
		String prueba=geometria.figura(8);
		String resultado="Trapecio";
		assertEquals(prueba,resultado);
	}
	
	@Test
	void testfiguradefault() {
		String prueba=geometria.figura(9);
		String resultado="Default";
		assertEquals(prueba,resultado);
	}
	
	@Test
	void testgetters() {
		geometria=new Geometria(1);
		int id=geometria.getId();
		String nombre=geometria.getNom();
		double area=geometria.getArea();
		assertEquals(id,1);
		assertEquals(nombre,"cuadrado");
		assertEquals(area,16);
	}
	
	@Test
	void testsetters() {
		geometria.setArea(17.2);
		geometria.setId(1);
		geometria.setNom("Cuadrado");
		assertEquals(geometria.getArea(),17.2);
		assertEquals(geometria.getId(),1);
		assertEquals(geometria.getNom(),"Cuadrado");
		
	}
	
	@Test
	void testtostring() {
		String prueba=geometria.toString();
		String resultado="Geometria [id= 9, nom= Default, area= 0]";
	}
	
	
	@AfterEach
	void after() {
		System.out.println("After");
		geometria.clear();
	}
	
	@AfterAll
	static void testbeforeAfter(){
		System.out.println("Final Test Geometria");
	}
}
