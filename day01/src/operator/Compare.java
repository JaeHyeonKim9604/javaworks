package operator;

public class Compare {

	public static void main(String[] args) {
		// 비교연산자
		int n1 = 7;
		int n2 = 3;
		boolean result1, result2, result3, result4;
		/*System.out.println(n1 > n2);
		System.out.println(n1 <= n2);
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);*/

		//논리 연산자
		//boolean 자료형은 true/false만 저장 가능(1bit)
		
		result1 =  (n1 < n2) && (n1 != n2);
		result2 = (n1 < n2) || (n1 != n2);
		result3 = !(n1 < n2);
		result4 = !(n1 < n2) && (n1 != n2);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		
		//나이를 비교해서 boolean변수에 저장하기
		/*int age = 27;
		boolean value;
		value = age >25;
		System.out.println(value);*/
		
	}

}
