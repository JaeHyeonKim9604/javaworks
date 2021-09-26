package tread;

public class BeepPrintTest2 {

	public static void main(String[] args) {
		//멀티 스레드로 작동
		Runnable beepTask = new BeepTask();
		// Thread 클래스의 생성자로 beepTask를 전달
		Thread thread = new Thread(beepTask);
		thread.start();
		
		
		//"띵" 문자를 5번 출력하기	->	1초간격으로!
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
