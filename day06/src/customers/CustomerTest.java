package customers;

public class CustomerTest {

	public static void main(String[] args) {
		// 기본생성자로 인스턴스 생성하기
		Customer c1 = new Customer();
		VIPCustomer vip1 = new VIPCustomer();
		
		c1.setCustomerName("박철수");
		vip1.setCustomerName("김재현");
		vip1.setAgentId(123);
		
		// 보너스 포인트 계산
		int price = 10000;
		c1.calcPrice(price);
		vip1.calcPrice(price);
		int saledPrice = vip1.calcPrice(price);
		
		// 	정보 출력
		System.out.println(c1.showInfo());
		System.out.println(vip1.getCustomerName() + "님의 구매 가격은 "
											+ saledPrice + "원 입니다.");
		System.out.println(vip1.showInfo());
	}

}
