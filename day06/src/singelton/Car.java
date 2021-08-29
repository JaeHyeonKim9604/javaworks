package singelton;

public class Car {
	private int carNum;		// 차량 번호
	private String brand;	// 차종
	private static int serialNum = 1000; // 기준번호
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}
	
	public int getCarNum() {
		return carNum;
	}
	
}
