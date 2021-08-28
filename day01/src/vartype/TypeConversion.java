package vartype;

public class TypeConversion {
	public static void main(String[] args) {
		// 자동 형변환 : 큰자료형 = 작은자료형
		int iNum = 20;
		float fNum = iNum;
		
		System.out.println(fNum);
		
		// 강제 형변환 : 작은자료형 = (자료형)큰자료형
		double dNum = 1.2;
		float fNum2 = 0.9f;
		
		int result1 = (int)dNum + (int)fNum2;
		int result2 = (int)(dNum + fNum2);
		System.out.println(result1);
		System.out.println(result2);
	}
	

}
