package ar.edu.unlam.tp1;

public class Circulo {
	
	private Double radio;
	
	public Circulo (Double radio){
		
		this.radio=radio;
	}
	
	public Double getRadio(){
		
		return radio;
	}
	
	public Double calcularPerimetro (Double radio){
		
		return Math.PI*radio*2;
	}

}
