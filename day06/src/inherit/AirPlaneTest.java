package inherit;

public class AirPlaneTest {
	
	public static void main(String[] args) {
		SuperSonicAirPlane sa = new SuperSonicAirPlane();
		
		sa.takeOff();
		sa.fly();
		sa.flymode = SuperSonicAirPlane.SUPERSONIC;
		sa.fly();
		sa.flymode = SuperSonicAirPlane.NORMAL;
		sa.fly();
		sa.land();
	}
}
