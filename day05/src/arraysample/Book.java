package arraysample;

public class Book {
	private String bookName;
	private String author;
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println("책이름 : " + bookName + ", 작가 : " + author);
	}
}
