package angkkoproject.arraylist;

public class Book {
	int bookNum;
	String author;
	
	public Book() {}
	
	public Book(int bookNum, String author) {
		this.bookNum = bookNum;
		this.author = author;
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println(bookNum + author);
	}
}
