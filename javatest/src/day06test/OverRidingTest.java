package day06test;

public class OverRidingTest extends OverRiding{
	
	private int n;
	
	public OverRidingTest(int n) {
		this.n = n;
	}
	
	@Override
	public void print() {
		System.out.println("자식의 매서드 입니다.");
		System.out.println(n);
	}

	public static void main(String[] args) {
		OverRiding n1 = new OverRiding();
		n1.print();
		
		OverRidingTest n2 = new OverRidingTest(1);
		n2.print();
		
		OverRiding n3 = new OverRidingTest(1);
		n3.print();
				
	}

}
