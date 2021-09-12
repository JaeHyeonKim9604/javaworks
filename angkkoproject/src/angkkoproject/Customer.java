/* 
 * 
 */
package angkkoproject;

class BDB {
	String coffeeName;
	int coffeePrice;
	
	public BDB(String coffeeName, int coffeePrice) {
		this.coffeeName = coffeeName;
		this.coffeePrice = coffeePrice;
	}
	
	public void showInfo() {
		System.out.println("별다방에서 " + coffeeName + "을 " + coffeePrice + "원에 샀습니다.");
	}

}

class KDB {
	String coffeeName;
	int coffeePrice;
	
	public KDB(String coffeeName, int coffeePrice) {
		this.coffeeName = coffeeName;
		this.coffeePrice = coffeePrice;
	}
	
	public void showInfo() {
		System.out.println("콩다방에서 " + coffeeName + "을 " + coffeePrice + "원에 샀습니다.");
	}
	
}

public class Customer {
	
	public String cName;
	
	public Customer(String cName) {
		this.cName = cName;
	}
	
	public void takeBDB(BDB bdb) {
		return;
	}
	
	public void takeKDB(KDB kdb) {
		return;
	}
	
	public void showInfo() {
		System.out.print(cName + "씨는 ");
	}
	
	public static void main(String[] args) {
		Customer kim = new Customer("kim");
		Customer lee = new Customer("lee");		
		
		BDB bdb1 = new BDB("아메리카노", 4000);
		kim.takeBDB(bdb1);
		kim.showInfo();
		bdb1.showInfo();
		
		KDB kdb1 = new KDB("라떼", 4500);
		lee.takeKDB(kdb1);
		lee.showInfo();
		kdb1.showInfo();
		
	}
}
