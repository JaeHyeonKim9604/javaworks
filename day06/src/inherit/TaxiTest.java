package inherit;

class Car{
	String brand;
	int cc;		// 배기량
	
	public Car(String brand, int cc) {
		this.brand = brand;
		this.cc = cc;
	}
}

class Taxi extends Car {
	int passenger;	// 승객
	
	// super 키워드로 상속 받음
	public Taxi(String brand, int cc, int passenger) {	// 부모의 매개변수를 포함해서 다 써줘야함
		super(brand, cc);	// 부모의 변수는 이렇게 
		this.passenger = passenger;
	}
	
	public void showInfo() {
		System.out.println("브랜드 : " + brand + ", cc : " + cc + ","
											+ " 승객 수 : " + passenger);
	}
}

public class TaxiTest {

	public static void main(String[] args) {
		Taxi taxi = new Taxi("sonata", 2500, 3);
		taxi.showInfo();
	}

}
