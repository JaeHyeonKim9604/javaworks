package angkkoproject.version;

public class Book2 {
	private String bookname;
	
	public Book2() {}
	
	public Book2(String bookname) {
		this.bookname = bookname;
	}
	
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	
	public String getBookname() {
		return bookname;
	}
	
	public void showInfo() {
		System.out.println(bookname);
	}
}
