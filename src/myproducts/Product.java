package myproducts;

public class Product {
	private String nev;
	private int netto_ar;
	private int afakulcs;
	
	public Product(String nev, int netto_ar, int afakulcs) {
		this.nev = nev;
		this.netto_ar = netto_ar;
		this.afakulcs = afakulcs;
	}
	
	public int bruttoAr() {
		return netto_ar+(netto_ar*afakulcs/100);
	}
	
	public String toString() {
		return ""+nev+", "+bruttoAr()+" Ft.";
	}
	
	public void arNoveles(int szazalek) {
		netto_ar += (netto_ar*szazalek/100);
	}
	
	public int hasonlit(Product x) {
		if(x.bruttoAr() < this.bruttoAr())
			return 1;
		else if(x.bruttoAr() > this.bruttoAr())
			return -1;
		
		return 0;
	}
	
	//

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public int getNetto_ar() {
		return netto_ar;
	}

	public void setNetto_ar(int netto_ar) {
		this.netto_ar = netto_ar;
	}

	public int getAfakulcs() {
		return afakulcs;
	}

	public void setAfakulcs(int afakulcs) {
		this.afakulcs = afakulcs;
	}
	
	//
	
	
}
