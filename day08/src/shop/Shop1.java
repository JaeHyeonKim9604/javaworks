package shop;

public class Shop1 extends HeadShop{
	
	public Shop1() {
		System.out.println("대학가 매장입니다.");
	}

	@Override
	public void sellDoenJangJJige() {	
		System.out.println("된장찌개 : 5,000원");
	}

	@Override
	public void sellKimChiJJige() {
		System.out.println("김치찌개 : 5,500원");
	}

	@Override
	public void sellBiBimBap() {
		System.out.println("비빔밥 : 6,000원");
	}

}
