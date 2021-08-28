package forexample;

public class For1to10 {

	public static void main(String[] args) {
		// for 반복문 - 1부터 10까지 출력
		
		int sum = 0;
		for(int i =1; i<=10; i++) {
			sum += i;
			System.out.println("i = " + i + ", sum = " + sum);
		}
		System.out.println("sum = " + sum);

	}
}
