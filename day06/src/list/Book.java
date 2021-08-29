package list;

public class Book {
	private String bookName;
	private String author;
	
	public Book() {} 	// 사용하는 쪽에서 호출하면 명시해야함
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println("책이름 : " + bookName + ", 작가 : " + author);
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	
}
