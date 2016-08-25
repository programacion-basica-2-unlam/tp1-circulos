package ar.edu.unlam;

public class Tragamonedas {
	
	Tambor primerTambor;
	Tambor segundoTambor;
	Tambor tercerTambor;
	
	FixNumberGenerator newGenerator = new FixNumberGenerator(5);
	
	public Tragamonedas(){
		this.primerTambor = new Tambor(newGenerator);
		this.segundoTambor = new Tambor(newGenerator);
		this.tercerTambor = new Tambor(newGenerator);
	}

	public void activar(){
		this.primerTambor.girar();
		this.segundoTambor.girar();
		this.tercerTambor.girar();
	}

	public Boolean entregaPremio(){
		Integer posicionIzquierda = this.primerTambor.getPosicion();
		Integer posicionCentro = this.segundoTambor.getPosicion();
		Integer posicionDerecha = this.tercerTambor.getPosicion();
		
		if(posicionIzquierda == posicionCentro && posicionCentro == posicionDerecha){
			return true;
		}
		else{
			return false;
		}
			
	}
	
}
