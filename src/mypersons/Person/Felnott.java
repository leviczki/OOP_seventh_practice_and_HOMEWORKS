package mypersons.Person;

public class Felnott extends Person{
	
	private String munkahely;

	public Felnott(String nev, int kor, String munkahely) {
		super(nev, kor);
		this.munkahely = munkahely;
		
	}

	public String getMunkahely() {
		return munkahely;
	}

	@Override
	public String toString() {
		
		return this.getNev() + " " + this.getKor() + this.munkahely;
	}
	
}
