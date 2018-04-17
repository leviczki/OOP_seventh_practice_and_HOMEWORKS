package mybooks.Book;

public class Main {
	public static void main(String[] args) {
			
		/*Book b = new Book();
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Kérem a könyv íróját: ");
		b.setBookAuthor(input.nextLine());
		
		System.out.print("Kérem a könyv címét: ");
		b.setBookTitle(input.nextLine());
		
		System.out.print("Kérem a könyv megjelenésének évét: ");
		b.setBookPublicationYear(input.nextInt());
		
		System.out.print("Kérem a könyv árát: ");
		b.setBookPrice(input.nextInt());
		
		input.close();
		
		System.out.println("A könyv tulajdonságai: "+b.bookInfo());*/
		
		
		
		Book a, b;
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("Kérem a könyv íróját: ");
		String writer = input.nextLine();
		System.out.print("Kérem a könyv címét: ");
		String title = input.nextLine();
		System.out.print("Kérem a könyv megjelenésének évét: ");
		int year = input.nextInt();
		System.out.print("Kérem a könyv árát: ");
		int price = input.nextInt();
		
		a = new Book(title, writer,year, price);
		b = new Book(title, writer);
		
		input.close();
		System.out.println("A könyv tulajdonságai: "+a.bookInfo());
		System.out.println("A könyv tulajdonságai: "+b.bookInfo());
		System.out.println("\nA címek megegyeznek: "+a.cimEgyezes(b.getBookTitle()));
		
		
	}
}