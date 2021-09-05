package Exercise2;

public class MainTest {
	
	public void feed(Predator predator) {
		System.out.println("feed" + predator.getFood());
	}
	
	public static void main(String[] args) {
		MainTest mt = new MainTest();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		/*
		mt.feed(tiger);
		mt.feed(lion);
		*/
		
		mt.feed(tiger);
		mt.feed(lion);
		
	}

}
