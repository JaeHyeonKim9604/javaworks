package arrays;

public class CopyArray {

	public static void main(String[] args) {
		// 배열의 복사
		int[] arr1 = {1, 2, 3, 4};
		int[] arr2 = new int[4];
		int i;
		
		for(i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
			System.out.print(arr2[i]);
		}
		System.out.println();
		
		// 문자형 배열 복사
		char[] chArr1 = {'N', 'E', 'T'};
		char[] chArr2 = new char[3];
		
		for(i=0; i<chArr1.length; i++) {
			chArr2[i] = chArr1[chArr1.length - i - 1];
			System.out.println(chArr2[i]);
		}
	}
}
