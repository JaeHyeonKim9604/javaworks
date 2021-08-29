package list;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		// ArrayList 배열 생성하기 
		ArrayList<String> cart = new ArrayList<String>();
		
		// 장바구니 물품 추가
		//cart[0] = "쌀"
		cart.add("쌀");
		cart.add("계란");
		cart.add("커피");
		cart.add("생수");
		
		// ArrayList의 개수
		System.out.println("장바구니 품목 : " + cart.size() + "개");
		
		// 출력
		for(int i = 0; i < cart.size(); i++) {
			String c = cart.get(i);
			System.out.println(cart.get(i));
		}
		
		// 삭제 
		cart.remove(0); // 	0번 인덱스의 "쌀" 삭제됨
		
		// 향상 for
		System.out.println("향상for 문");
		for(String c : cart) {
			System.out.println(c);
		}
		
		
	}

}
