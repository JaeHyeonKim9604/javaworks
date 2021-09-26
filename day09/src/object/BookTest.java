package object;

public class BookTest {

	public static void main(String[] args) {
		
		String name = new String("흥부");
		System.out.println(name);
		System.out.println(name.toString());
		
		Book book = new Book(100, "미생1");
		System.out.println(book);
		System.out.println(book.toString());
		
	}
	
}
