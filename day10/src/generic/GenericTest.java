package generic;

import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("grape");
		list.add("egg");
		list.add("coffee");
		
		String str1 = list.get(1);
		
		System.out.println(str1);
		System.out.println(list);
		
		// 왜 제네릭 프로그래밍을 하는가?
		ArrayList cart = new ArrayList();
		cart.add(list.get(0));
		cart.add(list.get(1));
		cart.add(list.get(2));
		
		String str2 = (String)list.get(1);		// 제네릭을 하지 않아 형변환 필요
		System.out.println(str2);
	}

}
