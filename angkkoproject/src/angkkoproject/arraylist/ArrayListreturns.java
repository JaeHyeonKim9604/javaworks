package angkkoproject.arraylist;

import java.util.ArrayList;		// import 필요

public class ArrayListreturns {
	// ArrayList는 java.util 에서 제공되는 객체 배열 클래스임
	/*
	 * 대표적인 특징은
	 * 1. 배열 길이와 상관없이 객체 추가가 가능
	 * 2. 배열 중간 요소가 제거되면 자동으로 뒤의 요소값을 앞으로 이동(빈 요소가 없도록 함)
	 */
	
	public static void main(String[] args) {
		// ArrayList 선언
		// ArrayList<자료형> 배열이름 = new ArrayList<>();
		ArrayList<Book> lib = new ArrayList<>();
		
		// add() 메서드로 생성자만 호출해 인스턴스를 생성하여 배열의 요소로 추가
		lib.add(new Book(100, "kim"));
		lib.add(new Book(101, "lee"));
		lib.add(new Book(102, "park"));
		lib.add(new Book(103, "choi"));
		lib.add(new Book(104, "kang"));
		
		// lib 배열에 추가된 요소 출력
		for(int i = 0; i < lib.size(); i++) {
			Book book = lib.get(i);	// 객체 book에 lib 배열에 있는 요소를 순서대로 넣음 
			book.showInfo();		// 출력
		}
		
		// 향상된 for문으로 출력
		for(Book book : lib) {
			book.showInfo();
		}
		
		System.out.println(lib);	// 배열 내 요소가 가지고 있는 인스턴스의 주소를 출력
		System.out.println(lib.get(0));	// 0번 요소의 인스턴스 주소 출력
		
	}
}
