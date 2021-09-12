package object;

public class Book {		// 모든 클래스는 기본적으로 Object 클래스(최상위 클래스)를 상속 받는 상태임(extends Object 가 생략된 상태)
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	// String 클래스의 toString 매서드를 재정의 해줌
	// showInfo를 할 필요가 없어짐..
	@Override
	public String toString() {
		return bookNumber + ", " + bookTitle;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {		// obj가 Book의 인스턴스라면~
			Book book = (Book)obj;		// 형변환(다운캐스팅)
			if(this.bookNumber == book.bookNumber) {	// 외부에서 입력받은 값과 내부 값이 같으면~
				return true;
			}
		}
		return false;
	}
	
}
