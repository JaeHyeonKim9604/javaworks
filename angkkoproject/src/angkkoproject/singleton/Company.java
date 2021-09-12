package angkkoproject.singleton;

public class Company {
	// 싱글톤 패턴 구현하기
	// 싱글톤 : 인스턴스를 단 하나만 생성하는 디자인 패턴
	
	// 2. 클래스 내부에 static으로 유일한 인스턴스 생성하기
	// 외부에서 인스턴스 생성 불가. 따라서 외부에서 사용할 수 있는 인스턴스를 하나 만들어야함.
	private static Company instance = new Company();
	
	// 1. private 생성자 만들기
	// 외부클래스에서 인스턴스 생성을 못하도록 생성자를 private으로 만듬
	private Company() {}
	
	// 3. public 메서드 만들기
	// 메서드는 public으로 만들어서 외부에서 참조 할 수 있도록 해야함
	// 또한 유일하게 생성한 인스턴스를 반환해주는 메서드를 만들어줄때는 static으로 선언해야함(인스턴스 생성과 상관 없이 호출 할 수 있도록)
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
