package arrays;

public class FindMax {

	public static void main(String[] args) {
		// 최댓값 찾기
		int[] arr = {3, 7, 2, 8, 4};
		int max = arr[0];
		
		for(int i = 0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}	
		}
		System.out.println("max = " + max);
		
		// 최댓값의 위치
		int max_idx = 0;

		for(int i = 0; i<arr.length; i++) {
			if(arr[max_idx] < arr[i]) {
				max_idx = i;
			}	
		}
		System.out.println("max_idx = " + max_idx);
		
		// 최솟값 찾기
		int min = arr[0];
		
		for(int i = 0; i<arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}	
		}
		System.out.println("min = " + min);
		
		// 최솟값의 위치
		int min_idx = 0;

		for(int i = 0; i<arr.length; i++) {
			if(arr[min_idx] > arr[i]) {
				min_idx = i;
			}	
		}
		System.out.println("min_idx = " + min_idx);
	}
}
