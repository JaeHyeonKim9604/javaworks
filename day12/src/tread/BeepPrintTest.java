package tread;

import java.awt.Toolkit;

public class BeepPrintTest {

	public static void main(String[] args) {
		//"띵" 문자를 5번 출력하기	->	1초간격으로!
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// "띵" 소리를 5번 재생
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
