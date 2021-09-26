package object;

class MyDog{
	String name;
	String type;
	
	public MyDog() {}
	
	public MyDog(String name, String type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return type + " " + name;
	}
	
}

public class MyDogTest {

	public static void main(String[] args) {
		MyDog dog = new MyDog("멍멍이", "진돗개");
		System.out.println(dog);
	}
/*
 * 객체를 출력하면 원래 주소가 나온다
 * String은 다르다
 * String str = "abc"; 일때
 * String은 클래스 이고 str은 객체이다.
 * System.out.println(str); 을 하면 
 * 출력 결과는 abc 가 나온다.
 * 즉 객체를 출력했는데 주소가 아닌 내용이 나오는 것이다.
 * 그 이유는 toString()메서드의 기능 때문이며
 * 따라서 다른 클래스에서도 객체를 출력햇을때 내용이 나오게 하려면 
 * toString 을 overriding 하면 된다.
 */
}

