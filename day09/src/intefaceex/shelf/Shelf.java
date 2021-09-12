package intefaceex.shelf;

import java.util.ArrayList;

public class Shelf{
	ArrayList<String> shelf; 	// ArrayList 선언
	
	public Shelf() {		// 기본 생성시 ArrayList 생성
		shelf = new ArrayList<>();
	}
	
	public int getCount() {
		return shelf.size();	// ArrayList 인 shelf의 크기(개수)
	}
	
}
