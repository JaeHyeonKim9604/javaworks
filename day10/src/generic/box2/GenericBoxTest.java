package generic.box2;

import generic.box1.Apple;

class Box<T>{		// T : 사용하면서 정하는 자료형
	private T type;
	
	public void set(T type) {
		this.type = type;
	}
	
	public T get() {
		return type;
	}
	
}

public class GenericBoxTest {

	public static void main(String[] args) {
		// String 형 사용
		Box<String> box1 = new Box<>();
		box1.set("행운을 빌여요!");
		String msg = box1.get();
		System.out.println(msg);
		
		// Integer 형 사용
		Box<Integer> box2 = new Box<>();
		box2.set(12);
		Integer num = box2.get();
		System.out.println(num);
		
		// 객체 사용
		Box<Apple> box3 = new Box<>();	// 형이 정해져있음(Apple)
		box3.set(new Apple());
		Apple apple = box3.get();		// 따라서 형 변환 할 필요가 없음
		System.out.println(apple);
		
	}

}
