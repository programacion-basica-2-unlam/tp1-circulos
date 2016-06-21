package ar.edu.unlam;

import static org.junit.Assert.*;

import org.junit.Test;

public class testTragamonedas {

	@Test
	public void queLosTamboresSeInicien(){
		Tragamonedas miTragamonedas = new Tragamonedas();
		
		assertTrue(miTragamonedas.primerTambor.getPosicion() == 5 &&
				   miTragamonedas.segundoTambor.getPosicion() == 5 &&
				   miTragamonedas.tercerTambor.getPosicion() == 5
				  );
	}
	
	@Test
	public void queSeCreeUnNumeroRandomEntreUnoYDiez() {
		RandoNumberGenerator newGenerator = new RandoNumberGenerator();
		Integer numeroAleatorio = newGenerator.generate();
		assertTrue(numeroAleatorio >0 && numeroAleatorio <= 10);
	}
	
	@Test
	
	public void testEntregaPremioONo(){
		Tragamonedas miTragamonedas = new Tragamonedas();
		miTragamonedas.activar();
		
		while(miTragamonedas.entregaPremio() == false){
			miTragamonedas.activar();
		}
		if(miTragamonedas.entregaPremio() == true){
			
		}
	}
	
}