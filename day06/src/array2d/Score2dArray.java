package array2d;

public class Score2dArray {

	public static void main(String[] args) {
		// 학생 5명의 국어와 수학 점수 계산
		int[][] score = {
				{90, 70},
				{80, 50},
				{75, 62},
				{93, 85},
				{80, 70}
				};
		int i, j;
		int[] sum = {0, 0};
		double[] avg = {0, 0};
		
		System.out.println("국어  수학");
		for(i = 0; i < score.length; i++) {
			for(j = 0; j < score[0].length; j++) {
				System.out.print(score[i][j] + "   ");
			}System.out.println();
		}
		
		// 합계와 평균
		for(i = 0; i < score.length; i++) {
			sum[0] += score[i][0];	// 국어의 합계
			sum[1] += score[i][1];	// 수학의 합계
		}
		
		avg[0] = (double)sum[0] / score.length;
		avg[1] = (double)sum[1] / score.length;
		
		System.out.println();
		System.out.println("국어점수 합계 : " + sum[0]);
		System.out.println("수학점수 합계 : " + sum[1]);
		System.out.println("국어점수 합계 : " + avg[0]);
		System.out.println("수학점수 합계 : " + avg[1]);
	}

}
