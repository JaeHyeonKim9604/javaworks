package lambda;

public class MyFunctionalInterfaceTest {

	public static void main(String[] args) {

		MyFunctionalInterface fi;
		//람다식으로 구현
		fi = () -> {
			String str = "Hello~ lambda";
			System.out.println(str);
		};
		fi.method();
		
		// {} 생략
		fi = () -> System.out.println("Hello! lambda");
		fi.method();
	}

}
