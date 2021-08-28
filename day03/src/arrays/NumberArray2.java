package arrays;

public class NumberArray2 {

	public static void main(String[] args) {
		// 배열의 선언과 사용
		int i;
		int sum = 0;
		int[] arr = {1, 2, 3, 4};
		double avg = 0.0;
	
		// 배열의 크기
		System.out.println("배열의 크기 = " + arr.length);
		System.out.println();
		
		// arr[]의 값 출력
		System.out.println("배열의 각 항목 :");
		for(i= 0; i<arr.length; i++) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		System.out.println();
		
		// arr[2]의 값 수정(변경)
		arr[2] = 6;
		
		// 합계
		for(i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("합계 : " + sum);
		
		// 평균
		avg = sum / (double)arr.length;  //평균 = 합계/갯수 : 반드시 형변환
		System.out.println("평균 : " + avg);
	}

}
