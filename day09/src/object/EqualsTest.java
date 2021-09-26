package object;

public class EqualsTest {

	public static void main(String[] args) {

		String name1 = new String("kongJui");
		String name2 = new String("kongJui");
		
		System.out.println(name1 == name2);			// 메모리 주소 비교 : false
		System.out.println(name1.equals(name2));	// 저장된 값 비교 : true
		
		Book book1 = new Book(101, "ant");
		Book book2 = new Book(101, "ant");
		
		System.out.println(book1 == book2);			// 메모리 주소 비교 : false
		System.out.println(book1.equals(book2));	// 저장된 값 비교 : true	
		// 저장된 값 비교시 true가 나와야함
		// Book 클래스에 equals메서드를 오버라이딩 해주어야함
		
		// hashCode 비교
		System.out.println(book1.hashCode());
		System.out.println(book2.hashCode());
	}

}
