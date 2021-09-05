package intefaceex.remotecontrol;

public interface RemoteControl {
	// 인터페이스 상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// 추상 매서드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	// 구체 매서드
	// : default 키워드를 앞에 붙여주어야만 사용 가능
	default void setMute(boolean mute) {
		if(mute = true) {
			System.out.println("무음 처리 합니다.");
		}
		else {
			System.out.println("무음 해제 합니다.");
		}
	}
	
	// 정적 매서드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
