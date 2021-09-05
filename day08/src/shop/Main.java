package shop;

public class Main {

	public static void main(String[] args) {
		HeadShop shop1 = new Shop1();
		shop1.sellDoenJangJJige();
		shop1.sellKimChiJJige();
		shop1.sellBiBimBap();
		System.out.println("=-=-=-=-=-=-=-=-=");
		HeadShop shop2 = new Shop2();
		shop2.sellDoenJangJJige();
		shop2.sellKimChiJJige();
		shop2.sellBiBimBap();
		
	}

}
