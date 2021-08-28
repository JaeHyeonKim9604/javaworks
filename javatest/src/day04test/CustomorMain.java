package day04test;

public class CustomorMain {

	public static void main(String[] args) {
		// 클래스 인스턴트변수 = new 생성자
		Customor cus = new Customor();
		CustomSystem cs = new CustomSystem();
		CustomPage pg = new CustomPage();

		cus.setAccount(999l);
		pg.Logo();
		cs.MainPage();
		
		}

}