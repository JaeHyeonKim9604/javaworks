package tread;

import java.awt.Toolkit;

public class BeepTask implements Runnable {
	// 소리 재생 작업
	@Override
	public void run() {
		// "Beep" 소리를 5번 재생
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
