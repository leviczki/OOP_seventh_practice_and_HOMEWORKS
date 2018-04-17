package mypersons.Person;

public class Employee  extends Felnott {
	
	private int fizetes;
	private static int nyugdijkorhatar = 65;
	
	public Employee(String nev, int kor, String munkahely, int fizetes) {
		super(nev, kor, munkahely);
		this.fizetes = fizetes;
	}

	public int getFizetes() {
		return fizetes;
	}
	
	@Override
	public String toString() {
		
		return this.getNev() + " " + this.getKor() + " " + this.getMunkahely() + " " + this.fizetes + " " + this.nyugdijkorhatar;
	}

}
