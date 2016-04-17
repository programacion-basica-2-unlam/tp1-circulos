package ar.edu.unlam.practico1;

public class Circulo {

	private Double Radio;
	
	
	public Circulo (Double Radio){
		this.Radio= Radio;
	}
	
	public Double darRadio(){
		return this.Radio;
	}
	
	public Double calcularPerimetro() {
		return Math.PI * 2 * this.darRadio().doubleValue();
	}
	
	public Double calcularArea() {
		return Math.PI * Math.pow(this.darRadio().doubleValue(), 2);
	}
}


