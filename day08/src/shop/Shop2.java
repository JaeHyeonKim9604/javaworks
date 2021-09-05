package shop;

public class Shop2 extends HeadShop {
	
	public Shop2() {
		System.out.println("역세권 매장입니다.");
	}

	@Override
	public void sellDoenJangJJige() {
		System.out.println("된장찌개 : 6,000원");
	}

	@Override
	public void sellKimChiJJige() {
		System.out.println("김치찌개 : 6,000원");
	}

	@Override
	public void sellBiBimBap() {
		System.out.println("비빔밥 : 6,000원");
	}
	
}
