package ar.edu.unlam.basica2.tp1;

public class Circulo {
	
	
	private double radio;
	
	public Circulo(double radio){
		
		this.radio = radio;
	}
	
	public double getRadio(){
		
		return this.radio;
	}
	
	public double CalcularPerimetro(){
		
		double perimetro;
		
		perimetro = 2 * Math.PI * this.radio;
		
		return perimetro;
	}
}
