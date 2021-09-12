package abstractex.animal;

public abstract class Animal {		// 추상 클래스(abstract)

	public void eat() {
		System.out.println("먹는다.");
	}
	
	public void sleep() {
		System.out.println("잠을 잔다.");
	}
	
	public abstract void cry();		// 추상 매서드 : 구현부 없이 선언만 되어있음
}
