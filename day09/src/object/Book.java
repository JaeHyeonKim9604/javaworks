package object;

public class Book {		// 모든 클래스는 기본적으로 Object 클래스(최상위 클래스)를 상속 받는 상태임(extends Object 가 생략된 상태)
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	// String 클래스의 toString 매서드를 재정의 해주면
	// String이 아닌 클래스에서 toString 사용
	@Override
	public String toString() {
		return bookNumber + ", " + bookTitle;
	}

	// equals 재정의
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

	// 두 객체의 정보가 일치 하려면
	// equals()와 hashCode() 매서드를 모두 재정의 해주어야 함
	
	@Override
	public int hashCode() {
		return bookNumber;
	}
	// hashCode 매서드는 인스턴스의 저장주소를 10진수로 반환함
	
	
	
}
