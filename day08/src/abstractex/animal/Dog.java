package abstractex.animal;

public class Dog extends Animal {

	// 추상 클래스를 상속받으면 반드시 해당 추상 클래스의 추상 매서드를 구현해야함(재정의, override)
	@Override
	public void cry() {
		System.out.println("왕왕");
	}

}
