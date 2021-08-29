package array2d;

public class Array2dCalc {

	public static void main(String[] args) {

		int[][] nums = {
				{1, 2, 3},
				{4, 5, 6}
			};
		int i, j;
		int sum = 0;
		double avg = 0d;
		int count = 0;
		
		// 인덱싱
		//int x = nums[1][2];
		//System.out.println(x);
		
		for(i = 0; i < nums.length; i++) {
			for(j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}System.out.println();
		}
		
		// 합계 와 평균
		for(i = 0; i < nums.length; i++) {
			for(j = 0; j < nums[i].length; j++) {
				sum += nums[i][j];
				count++;
			}
		}
		avg = (double)sum / count;
		System.out.println("합계 : " + sum);
		//System.out.println("평균 : " + avg);
		System.out.printf("평균 : %.1f", avg);
	}

}
