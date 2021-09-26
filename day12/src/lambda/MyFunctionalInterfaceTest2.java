package lambda;

public class MyFunctionalInterfaceTest2 {

	public static void main(String[] args) {

		MyFunctionalInterface2 fi2;
		
		fi2 = (x) -> {
			x += 10;
			System.out.println(x);
		};
		fi2.method(1);
		
		//{} 생략
		fi2 = (x) -> System.out.println(x+10);
		fi2.method(2);
		
		// 제곱수 계산 함수
		fi2 = (y) -> System.out.println(y*y);
		fi2.method(4);
	}
}
