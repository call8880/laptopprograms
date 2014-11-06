package Objects;

public class Book {
	
	private String book;
	private String author;
	
	public Book(String b, String a){
		book = b;
		author = a;
	}
	public boolean borrow(String b){
		if (b == book){
			return true;
		}
		else return false;
	}
	
}
