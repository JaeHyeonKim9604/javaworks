package vartype;

public class NumberType {

	public static void main(String[] args) {
		//byte 자료형의 크기 = 1byte(-128~127)
		byte bData1 = -128;
		//byte bData2 = 128; 범위 초과 오류
		
		//short 자료형의 크기 = 2byte(-32768~32767)
		short sData = 32767;
		//short sData2 = 32768;
		
		System.out.println(sData);
		
		//int 자료형의 크기 = 4byte(약-21억 ~ 21억)
		int inums = 123456789;
		System.out.println(inums);
		//int inum2 = 12345678901;
		
		//long 자료형의 크기 = 8byte(L이나 'l'을 끝에 붙어햐
		long inu = 1234567890L;
		System.out.println(inu);
		
		System.out.println(bData1);

	}

}
