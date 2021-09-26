package object;

public class CloneTest {

	public static void main(String[] args) {

		int[] arr1 = {10, 20, 30, 40};
		int[] arr2 = new int[4];
		
		// 복사
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		// 출력
		System.out.println("==arr2 출력==");
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr2[i]);
		}
		
		// clone()으로 복사
		int[] arr3 = arr2.clone();
		
		// 출력
		System.out.println("==arr3 출력==");
		for(int a : arr3) {
			System.out.println(a);
		}
		
		System.out.println(arr1 == arr2);	// false
		System.out.println(arr2 == arr3);	// false
	}

}
