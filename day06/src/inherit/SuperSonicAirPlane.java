package inherit;

public class SuperSonicAirPlane extends AirPlane{

	// 초음속 비행기의 모드 = 일반모드, 초음속 모드
	static final int NORMAL = 1;
	static final int SUPERSONIC = 2;
	
	int flymode = NORMAL;
	
	@Override 	// 애너테이션 표시 -> 매서드 재정의(매서드 오버라이드)
	public void fly() {
		if(flymode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}
		else {
			super.fly();	// "일반 비행합니다."
		}
	}
}
