package intefaceex.calculator;

public interface Calculator {
	int ERROR = -9999;		// 변수 -> 컴파일 시 상수로 바뀜
							// 인터페이스 자체 기능(인터페이스 상수)
	
	int add(int n1, int n2);	// 추상 매서드
	int sub(int n1, int n2);
	int mul(int n1, int n2);
	int div(int n1, int n2);
}
