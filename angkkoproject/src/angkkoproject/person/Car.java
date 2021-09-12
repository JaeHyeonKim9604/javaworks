package angkkoproject.person;

public class Car {
	private static int serialNum = 0000;
	String carName;
	int carNum;
	
	public Car() {}
	
	public Car(String carName) {
		this.carName = carName;
		serialNum++;
		carNum = serialNum;
	}
	
}
