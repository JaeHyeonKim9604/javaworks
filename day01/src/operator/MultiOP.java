package operator;

public class MultiOP {

	public static void main(String[] args) {
		int num = 10;
		
		System.out.println(num += 2);
		System.out.println(num %= 10);
		num -= 1;
		System.out.println(num);
		
		//조건 연산자
		//조건식 ? 참인값 : 거짓값 
		int a = 0;
		int b = 0;
		
		boolean val = (a<b) ? true : false;
		System.out.println(val);
		
		int Fage = 45;
		int Mage = 47;
		
		char ch;
		ch = (Fage>Mage) ? 'T':'F';
		System.out.println(ch);

	}

}
