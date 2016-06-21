package ar.edu.unlam;

public class Tambor {
	
	private Integer number;
	
	public Tambor(NumberGenerator generator){
		this.number = generator.generate();
	}

	public Integer getPosicion(){
		return this.number;
	}
	
	public void girar(){
		RandoNumberGenerator nuevaPosicion = new RandoNumberGenerator();
		this.number = nuevaPosicion.generate();
	}
	
}
