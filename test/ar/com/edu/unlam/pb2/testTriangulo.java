package ar.com.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.com.edu.unlam.pb2.triangulo;

public class testTriangulo {

	@Test
	public void testArea() {
		triangulo unTriangulo=new triangulo(8.0,4.0);
		Double valorEsperado=16.0;
		
		assertEquals(valorEsperado,unTriangulo.calcularArea());
	}
	
	@Test
	public void testPerimetro() {
		triangulo unTriangulo=new triangulo(4.0,4.0,4.0);
		Double valorEsperado=12.0;
		
		assertEquals(valorEsperado,unTriangulo.calcularPerimetro());
	}
}
