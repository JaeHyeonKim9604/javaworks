package vartype;

public class NumberType2 {

	public static void main(String[] args) {
		// 실수 자료형의 크기 및 범위
		// float형 = 4byte
		// 뒤에 F 또는 f를 붙여야함
		float fData = 2.54F;
		System.out.println(fData);
		
		// double형(기본) = 8byte
		// 뒤에 D 또는 d를 붙일수도 있고 안붙여도됨 
		double dData = 3.141592;
		System.out.println(dData);
		
		//float = 소수 8자리 까지 가능
		//double = 소수 16자리 까지 가
		float fData2 = 1.12345678f;
		double dData2 = 1.1234567890123456789d;
		
		System.out.println(fData2);
		System.out.println(dData2);

	}

}
