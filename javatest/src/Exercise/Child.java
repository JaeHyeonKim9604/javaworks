package Exercise;

public class Child extends Parents {

	// public으로 실행할때와
	// protected 로 실행할때
	// main에서의 차이는 없었음
	// 같은 패키지 안에 있어서 인것으로 추측...
	public void mul() {
		System.out.println(x*y);
	}
	
	protected void div() {
		System.out.println(x/y);
	}
}
