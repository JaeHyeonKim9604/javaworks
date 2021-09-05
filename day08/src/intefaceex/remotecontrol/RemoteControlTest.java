package intefaceex.remotecontrol;

public class RemoteControlTest {

	public static void main(String[] args) {
		RemoteControl tv = new TV();
		RemoteControl audio = new Audio();
		
		tv.turnOn();
		tv.setVolume(8);
		tv.setMute(true);
		tv.turnOff();
		RemoteControl.changeBattery();	// static 매서드 이므로 인터페이스 이름으로 직접 접근
		
		System.out.println("=-=-=-=-=-=-=-=-=");
		audio.turnOn();
		audio.setVolume(9);
		audio.setMute(true);
		audio.turnOff();
		RemoteControl.changeBattery();
		
	}

}
