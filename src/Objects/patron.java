package Objects;

public class patron {
	
	String name;
	Book b1, b2, b3;
	
	public void Patron(String n){
		name = n;
		b1 = null;
		b2 = null;
		b3 = null;
	}
	public boolean borrow(Book b){
		boolean canborrow = (b1 == null || b2 == null || b3 == null);
		if (canborrow){
			if (b1 == null) b1 = b;
			else if (b2 == null) b2 = b;
			else b3 = b;
			return true;
		}
		else return false;
	}
	public boolean hasBook(Book b){
		if (b1 == b) return true;
		else if (b2 == b) return true;
		else if (b3 == b) return true;
		else return false;
	}
	public boolean returnBook(Book b){
		if (hasBook(b)){
			if (b1 == b) b1 = null;
			else if (b2 == b) b2 = null;
			else b2 = null;
			return true;
		}
		else return false;
	}
	public void getName(String name){
		System.out.println(name);
	}

}
