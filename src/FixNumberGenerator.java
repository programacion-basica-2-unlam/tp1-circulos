package ar.edu.unlam;

public class FixNumberGenerator implements NumberGenerator {

	private Integer number;

	public FixNumberGenerator(Integer number){
		this.number = number;
	}

	public Integer generate(){
		return this.number;
	}
	
}
