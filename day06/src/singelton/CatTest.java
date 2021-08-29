package singelton;

public class CatTest {

	public static void main(String[] args) {

		Car car1 = new Car();
		System.out.println("car1차번 : " + car1.getCarNum());
		
		Car car2 = new Car();
		System.out.println("car2차번 : " + car2.getCarNum());
		
		
	}

}
