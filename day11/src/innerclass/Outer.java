package innerclass;

public class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable() {	// 지역 내부 클래스
		int num = 10;	// 인터페이스에서 변수는 final 상수로 바뀜
		class MyRunnable implements Runnable{
			int localNum = 10;
			
			@Override
			public void run() {
				// num = 20 : 
				System.out.println(outNum + " = 외부 클래스의 변수");
				System.out.println(sNum + " = 내부 클래스의 변수");
				System.out.println(localNum + " = 지역 클래스의 변수");
			}
			
		}
		
		MyRunnable myRun = new MyRunnable();
		return myRun;
	}
}
