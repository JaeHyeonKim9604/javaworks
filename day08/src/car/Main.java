package car;

public class Main {

	public static void main(String[] args) {

		Car aicar = new AiCar();
		System.out.println("=-=-=-=-자율주행 자동차-=-=-=-=");
		aicar.run();
		
		Car manualcar = new ManualCar();
		System.out.println("=-=-=-=-사람이 운전하는 자동차-=-=-=-=");
		manualcar.run();
	}

}
