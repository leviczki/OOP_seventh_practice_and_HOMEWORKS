package myproducts;

public class Bread extends Product {
	private double mennyiseg;
	
	public Bread(String nev, int netto_ar, int afakulcs, double mennyiseg) {
		super(nev, netto_ar, afakulcs);
		this.mennyiseg = mennyiseg;
	}
		
	public double getMennyiseg() {
		return mennyiseg;
	}

	@Override
	public String toString() {
		return "Bread [mennyiseg=" + mennyiseg + ", toString()="
				+ super.toString() + "]";
	}

	public static boolean compareBreads(Bread x, Bread y) {
		if((x.bruttoAr()/x.mennyiseg) > (y.bruttoAr()/y.mennyiseg))
			return true;
		
		return false;
	}
}
