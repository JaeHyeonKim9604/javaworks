package angkkoproject.singleton;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		CarFactory factory2 = CarFactory.getInstance();
		Car mySonata = factory.creatCar();
		Car yourSonata = factory.creatCar();
		Car ourSonata = factory.creatCar();
		Car myAvante = factory2.creatCar();
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
		System.out.println(ourSonata.getCarNum());
		System.out.println(myAvante.getCarNum());
		
	}

}
