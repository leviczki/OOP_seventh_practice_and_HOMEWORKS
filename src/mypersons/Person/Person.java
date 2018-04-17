package mypersons.Person;

public class Person {
	
	private String nev;
	private int kor;
	
	public Person(String nev, int kor) {

		this.nev = nev;
		this.kor = kor;
		
	}

	public String getNev() {
		return nev;
	}

	public int getKor() {
		return kor;
	}
	
	@Override
	public String toString() {
		
		return this.nev + " " + this.kor;
	}
	
	public boolean hasonlit(Person x) {
		if(x.getKor() < this.getKor())
			return true;
		
		return false;
	}
}
