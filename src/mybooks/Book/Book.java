package mybooks.Book;
public class Book {

	/*2. Készítsen Könyv osztályt és egy Könyv osztályt használó osztályt.
	a) A Könyv osztály adattagjai: cím, szerző, megjelenés éve, ára. Legyen egy metódusa, amely a
	paraméterként kapott százalékos értékkel növeli a könyv árát. Legyen egy metódusa, ami egy
	String-be összefűzi az adatokat és
	ezt adja vissza.
	b)   Írjunk   setter   metódusokat   az   adatok   beállításához,   és   getter   metódusokat   az   adatok
	lekérdezéséhez (adatrejtés → ellenőrzött adathozzáférés).*/
	
	private String BookTitle;
	private String BookAuthor;
	private int BookPublicationYear;
	private int BookPrice;
	
	/////////////////////////////////////////////////////////
	
	public Book(String BookTitle, String BookAuthor, int BookPublicationYear, int BookPrice) {
		this.BookTitle = BookTitle;
		this.BookAuthor = BookAuthor;
		this.BookPublicationYear = BookPublicationYear;
		this.BookPrice = BookPrice;
	}
	
	public Book(String cim, String szerzo) {
		//java.util.Calendar.getInstance().get(java.util.Calendar.YEAR)
		this(cim, szerzo, java.time.LocalDate.now().getYear(), 2500);
	}
	
	/////////////////////////////////////////////////////////
	
	public void bookPercentageIncrease(int percentage) {
		this.BookPrice = this.BookPrice + (this.BookPrice*percentage)/100;
	}
	
	public String bookInfo() {
		return "\n\n"+ BookAuthor +": "+ BookTitle +"\n Kiadva: "+ BookPublicationYear +"\n Ára: "+ BookPrice;
	}
	
	public boolean cimEgyezes(String cim) {
		if(this.BookTitle.equals(cim))
			return true;
		
		return false;
	}

	//////////////////////////////////////////////////////////
	public int getBookPrice() {
		return this.BookPrice;
	}
	public void setBookPrice(int bookPrice) {
		BookPrice = bookPrice;
	}
	
	public String getBookAuthor() {
		return BookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}

	public String getBookTitle() {
		return BookTitle;
	}
	public void setBookTitle(String bookTitle) {
		BookTitle = bookTitle;
	}

	public int getBookPublicationYear() {
		return BookPublicationYear;
	}
	public void setBookPublicationYear(int bookPublicationYear) {
		BookPublicationYear = bookPublicationYear;
	}
	
}