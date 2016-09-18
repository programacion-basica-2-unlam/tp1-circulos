package ar.edu.unlam.tp1;

import static org.junit.Assert.*;
import org.junit.Test;

public class CirculoTest {

	@Test
	public void crearUnCirculoConRadio2(){
		
		Circulo nuevoCirculo = new Circulo(2.0);
		Double esperado = 2.0;
		assertEquals(esperado, nuevoCirculo.getRadio() ,0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio3Punto7() {
		Circulo nuevoCirculo = new Circulo (3.7);
		Double esperado = 3.7;
		assertEquals(esperado, nuevoCirculo.getRadio() ,0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio5() {
		Circulo nuevoCirculo = new Circulo (5.0);
		Double esperado = 5.0;
		assertEquals(esperado, nuevoCirculo.getRadio() ,0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		Circulo nuevoCirculo = new Circulo (10.9);
		Double esperado = 10.9;
		assertEquals(esperado, nuevoCirculo.getRadio() ,0.01);
	}

	@Test
	public void queElAreaDeUnCirculoConRadio9Punto8Es61Punto58() {
		Circulo nuevoCirculo = new Circulo (9.8);
		Double esperado = 61.58;
		assertEquals(esperado, nuevoCirculo.calcularPerimetro(9.8),0.01);
	} 
	
	@Test
	public void crearUnCirculoConRadio16Punto6Es104Punto3() {
		Circulo nuevoCirculo = new Circulo (16.6);
		Double esperado = 104.30;
		assertEquals(esperado, nuevoCirculo.calcularPerimetro(16.6),0.01);
	} 
}

