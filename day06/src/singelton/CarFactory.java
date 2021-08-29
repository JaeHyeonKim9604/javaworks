package singelton;

public class CarFactory {
	// 싱글톤 패턴
	private static CarFactory instance;
	
	private CarFactory() {}
	
	// 변수가 static이면 매서드에도 static 들어가야함 
	public static CarFactory getInstance() {
		if(instance == null) {		// instance가 비어있을때
			instance = new CarFactory();
		}
		return instance;
	}
	
	// 자동차 생산 매서드
	public Car createCar() {
		Car car = new Car();
		return car;
	}

}
