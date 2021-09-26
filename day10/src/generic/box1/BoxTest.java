package generic.box1;

class Box{
	private Object obj;
	
	public void set(Object obj) {		// Object 타입으로 지정되어있으면 뭐든 넣을 수 있다.
		this.obj = obj;
	}
	
	public Object get() {				// 하지만 출력시에는 형변환이 필요하다.
		return obj;
	}
}

public class BoxTest {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("good luck!");
		String msg = (String) box.get();	// 크기가 큰 Object형인 box.get() 을 String 형인 msg에 넣기 위해 형변환
		System.out.println(msg);
		
		// 객체 타입 지정
		box.set(new Apple());
		Apple apple = (Apple) box.get();
		System.out.println(apple);
	}

}
