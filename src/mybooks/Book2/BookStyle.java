package mybooks.Book2;

import mybooks.Book.Book;

public class BookStyle extends Book {
	
		private String style;
		
		public BookStyle(String BookTitle, String BookAuthor, int BookPublicationYear, int BookPrice, String style) {
			super(BookTitle, BookAuthor, BookPublicationYear, BookPrice);
			this.style = style;
		}
		
		public String getStyle()
		{
			return style;
		}
		
		
		
}
