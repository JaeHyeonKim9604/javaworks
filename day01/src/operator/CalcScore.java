package operator;

public class CalcScore {

	public static void main(String[] args) {
		int math = 90;
		int eng = 75;
		int total;
		double avg;
		
		total = math + eng;
		avg = (double)total/2;
		// 강제 형변환(크기(byte)가 더 큰 double 형으로 바뀜)
		System.out.println(total);
		System.out.println(avg);
		
		//증가 감소 연산자
		int num = 10;
		System.out.println(++num);
		System.out.println(num);
		
		//관계연산자
	}

}
