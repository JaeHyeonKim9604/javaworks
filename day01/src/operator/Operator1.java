package operator;

public class Operator1 {

	public static void main(String[] args) {
		// 변수의 교환
		int x = 0;
		int y = 1;
		int temp;
		
		System.out.println("====교환전====");
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		//교환처리
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("====교환후====");
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}

}
