package ar.edu.unlam.practico1;

import static org.junit.Assert.*;
import org.junit.Test;

public class CirculoTest {
	
	@Test
	public void queSeCreeUnCirculoConRadioDos(){
		Circulo miCirculo = new Circulo(2.00);
		assertEquals(2, miCirculo.darRadio(), 0.01);
	}
	
	@Test
	public void queSeCreeUnCirculoConRadioTresPuntoSiete(){
		Circulo miCirculo = new Circulo(3.7);
		assertEquals(3.7, miCirculo.darRadio(), 0.01); 
	}
	
	@Test
	public void queSeCreeUnCirculoConRadioCinco(){
		Circulo miCirculo = new Circulo(5.00);
		assertEquals(5, miCirculo.darRadio(), 0.01);
	}
	
	@Test
	public void queSeCreeUnCirculoConRadioDiezPuntoNueve(){
		Circulo miCirculo = new Circulo(10.9);
		assertEquals(10.9, miCirculo.darRadio(), 0.01);
	}
	
	@Test
	public void queElPerimetroDeUnCirculoConRadio9Punto8Es61Punto57() {
		Circulo miCirculo = new Circulo(9.80);
		
		assertEquals(miCirculo.calcularPerimetro(), 61.57, 0.01);
	}
	
	@Test
	public void queElAreaDeUnCirculoConRadio16Punto6Es865Punto69() {
		Circulo miCirculo = new Circulo(16.60);
		
		assertEquals(miCirculo.calcularArea(), 865.69, 0.01);
	}
}
