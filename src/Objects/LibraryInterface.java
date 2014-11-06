package Objects;

public class LibraryInterface {

	public static void main(String[] args) {

		Book b1, b2, b3, b4, b5;
		b1 = new Book("From Russia with love", "Greg Hines");
		b2 = new Book("Living Smart", "Rita langill");
		b3 = new Book("Singing in the Rain", "Harry Conner");
		b4 = new Book("Good Housekeeping", "Pat Burns");
		b5 = new Book("To be a Model", "Lisa Lahey");
		System.out.println("Here are the available books");
	//	System.out.println(b1 + "\n" + b2 + "\n" + b3 + "\n" + b4 + "\n" + b5);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		
	}

}
