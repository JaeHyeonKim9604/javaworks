package customers;

public class VIPTest {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		VIPCustomer vip1 = new VIPCustomer();
		
		c1.setCustomerName("박철수");
		vip1.setCustomerName("김재현");
		vip1.setAgentId(123);
		
		int price = 10000;
		int saleprice = vip1.calcPrice(price);
		
		
		// 	정보 출력
		System.out.println("구매 가격은 " + saleprice + "원 입니다.");
		System.out.println(vip1.showInfo());
		System.out.println(c1.showInfo());
	}

}
