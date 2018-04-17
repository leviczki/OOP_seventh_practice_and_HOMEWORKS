package sajat.masodik;

import sajat.elso.Sz·m;

public class main {
	
	public static void main(String[] args) {
	
		final Sz·m asd = new Sz·m(Math.random());
		System.out.println("A sz√°m: "+asd.getY());
		int counter = 0;
		
		while(true) {
			double tempNum=Math.random();
		
			counter++;
			System.out.println(tempNum);
		
			if(asd.turesenBelul(tempNum))
				break;
		
		}
	}

}
