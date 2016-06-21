package ar.edu.unlam;

public class RandoNumberGenerator implements NumberGenerator {
	
	public Integer generate(){
		Integer valorAleatorio = (int)(Math.random() * 10);
		while(valorAleatorio <= 0 || valorAleatorio > 10){
			valorAleatorio = (int)(Math.random() * 10);
		}			
		return valorAleatorio;
	}
	
}
