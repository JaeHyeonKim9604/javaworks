package intefaceex.calculator;

public class MyCalculator implements Calculator {		// 인터페이스를 사용 : implements

	@Override
	public int add(int n1, int n2) {
		return n1 + n2;
	}

	@Override
	public int sub(int n1, int n2) {
		return n1 - n2;
	}

	@Override
	public int mul(int n1, int n2) {
		return n1 * n2;
	}

	@Override
	public int div(int n1, int n2) {
		int result = 0;
		if(n2 != 0) {
			result = n1 / n2;
		}
		else {
			result = ERROR;
		}
		return result;
		
	}


}