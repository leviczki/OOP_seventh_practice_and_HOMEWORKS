package mypersons.Person;

public class Gyermek extends Person {
	
	private String iskola;
	
	public Gyermek(String nev, int kor, String iskola) {
		super(nev, kor);
		this.iskola = iskola;
		
		
	}

	public String getIskola() {
		return iskola;
	}

	
	@Override
	public String toString() {
		
		return this.getNev() + " " + this.getKor() + this.iskola;
	}
	

}
