package myproducts;

public class Main {
	public static void main(String[] args) {
		Product aru = new Product("Csomagolo papir", 10, 27);
		Bread kenyer = new Bread("Kenyer", 300, 27, 0.5);
		
		Product product2 = new Bread("Kifli", 20, 27, 0.1);
		System.out.println(product2.toString());
		//System.out.println(kenyer_2.getMennyiseg());
		
		Bread bread2 = new Bread("Kenyer", 300, 27, 0.5);
		
		if( bread2.compareBreads( bread2, (Bread)product2 ) )
			System.out.println("bread2");
		else
			System.out.println("product2");
		
	}
}
