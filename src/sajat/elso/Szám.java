package sajat.elso;

public class Szám {
	double x = 0.001;
	private double y;
	
	public Szám(double y) {
		this.y = y;
	}
	
	public boolean turesenBelul(double z) {
		if(Math.abs(y-z) < x)
			return true;
		
		return false;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	
}
