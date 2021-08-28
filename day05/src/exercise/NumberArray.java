package exercise;

public class NumberArray {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		int sum = 0;
		
		for(int i = 0; i<numbers.length; i++) {
			numbers[i] = (i+1) *2;
		}

		for(int num : numbers ) {
			sum += num;
		}
		
		System.out.println(sum);
	}

}
