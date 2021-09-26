package innerclass;

public class Outer2 {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable runner = new Runnable() {
		// 익명 객체 runner(클래스를 생성하지 않고 객체를 만듬)
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println(outNum + " = 외부 클래스의 변수");
			System.out.println(sNum + " = 내부 클래스의 변수");
		}
		
	};	// 세미콜론을 붙여야 run() 구현 가
	
}
