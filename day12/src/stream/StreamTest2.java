package stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest2 {

	public static void main(String[] args) {
		// 정수형 배열
		int[] num = {1, 2, 3, 4};
		/*
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}*/
		
		// stream은 생성 후 1번만 사용 가능, 이후 소모됨 - Consumer
		IntStream stream = Arrays.stream(num);
		stream.forEach(n -> System.out.println(n));
		
		// 합계와 평균
		stream = Arrays.stream(num);
		int sumVal = Arrays.stream(num).sum();	// 사용하고 소모s
		
		// 새로운 stream 생성
		int count = (int)Arrays.stream(num).count();
		
		double avg = (double)sumVal / count;
		
		System.out.println("합계 : " + sumVal);
		System.out.println("개수 : " + count);
		System.out.println("평균 : " + avg);
  	}

}
