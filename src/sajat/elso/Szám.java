package sajat.elso;

public class Sz�m {
	double x = 0.001;
	private double y;
	
	public Sz�m(double y) {
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
