package mypersons.test.PersonTest;
import mypersons.Person.*;

public class Main {
	
	/*public static void main(String[] args) {
		Person a = new Person(null, 0);
		Person b = new Person(null, 0);
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("Kerem a nevet: ");
		String nev = input.nextLine(), isk_munk = null;
		
		System.out.print("Kor: ");
		int kor = Integer.parseInt(input.nextLine());
		
		if(kor >= 18 ) {
			System.out.println("Kerem a munkahely nevet: ");
			isk_munk = input.nextLine();
			
			if(isk_munk != null)
				a = new Employee(nev, kor, isk_munk, 180000);
			else
				a = new Felnott(nev, kor, isk_munk);
			
			
		} else if(kor < 18 && kor > 0) {
			System.out.println("Kerem az iskola nevet: ");
			isk_munk = input.nextLine();
			a = new Gyermek(nev, kor, isk_munk);
		}
		
		System.out.print("Kerem a nevet: ");
		nev = input.nextLine();
		isk_munk = " ";
		
		System.out.print("Kor: ");
		kor = Integer.parseInt(input.nextLine());
		
		if(kor >= 18 ) {
			System.out.println("Kerem a munkahely nevet: ");
			isk_munk = input.nextLine();
			b = new Felnott(nev, kor, isk_munk);
		} else if(kor < 18 && kor > 0) {
			System.out.println("Kerem az iskola nevet: ");
			isk_munk = input.nextLine();
			b = new Gyermek(nev, kor, isk_munk);
		}
		
		input.close();
		
		
		System.out.println("a intanceof gyermek: "+ (a instanceof Gyermek));
		System.out.println("a intanceof felnott: "+ (a instanceof Felnott));
		System.out.println("a intanceof munkas: "+ (a instanceof Employee));
		System.out.println("b intanceof gyermek: "+ (b instanceof Gyermek));
		System.out.println("b intanceof felnott: "+ (b instanceof Felnott));
		System.out.println("b intanceof munkas: "+ (b instanceof Employee));
	}*/
	
	public static void main(String[] args) {
		Person a[] = new Person[2];
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		for(int i = 0; i < a.length; i++) {
			
			System.out.print("Kerem a nevet: ");
			String nev = input.nextLine();
			
			System.out.print("Kor: ");
			int kor = Integer.parseInt(input.nextLine());
			
			String isk_munk = null;
			if(kor >= 18 ) { //FELNOTT
				
				System.out.print("Kerem a munkahely nevet: ");
				isk_munk = input.nextLine();

				if(isk_munk.length() > 0) {
					System.out.print("Fizetes: ");
					int fizetes = Integer.parseInt(input.nextLine());
					a[i] = new Employee(nev, kor, isk_munk, fizetes);
				}
				else
					a[i] = new Felnott(nev, kor, isk_munk);
				
				
			} else if(kor < 18 && kor > 0) {
				
				System.out.println("Kerem az iskola nevet: ");
				isk_munk = input.nextLine();
				a[i] = new Gyermek(nev, kor, isk_munk);
				
			}
			
			System.out.println("a["+i+"] intanceof Gyermek: "+ (a[i] instanceof Gyermek));
			System.out.println("a["+i+"] intanceof Felnott: "+ (a[i] instanceof Felnott));
			System.out.println("a["+i+"] intanceof Employee: "+ (a[i] instanceof Employee));
			
			
		}
		
		input.close();
		
		
		
		
		for(int i = 0; i < a.length; i++) {
			int min_index = i;
			for(int j = i+1; j < a.length; j++) {
				if(a[min_index].getKor() > a[j].getKor())
					min_index = j;
			}
			
			Person tmp = a[i];
			a[i] = a[min_index];
			a[min_index] = tmp;
		}
		
		for(Person x : a) {
			x.toString();
		}
		
		
	}

}
