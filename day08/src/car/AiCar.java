package car;

public class AiCar extends Car {
	String brand;

	@Override
	public void drive() {
		System.out.println("자율 주행합니다.");		
	}

	@Override
	public void stop() {
		System.out.println("차가 스스로 멈춥니다.");
	}

}
