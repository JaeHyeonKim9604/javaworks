package vartype;

public class CharType {

	public static void main(String[] args) {
		// 문자 자료형 - char, string
		// char = 2byte(-32768 ~ 32767)
		// string = 4byte
		char ch1 = 'A';
		char ch2 = 66;
		
		System.out.println(ch1);
		System.out.println(ch2);
		// 'A'의 아스키코드 
		System.out.println((int)ch1);
		System.out.println((int)ch2);
		
		// '한'의 유니코드
		char ch3 = '한';
		char ch4 = '\uD55C';
		char ch5 = '\uAE00';
		
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);
	}
}
