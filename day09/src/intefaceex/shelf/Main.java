package intefaceex.shelf;

public class Main {

	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		
		// 책 추가
		shelfQueue.enQueue("자바 프로그래밍");		//인덱스 0번
		shelfQueue.enQueue("스프링 부트");			//인덱스 1번
		shelfQueue.enQueue("안드로이드 프로그래밍");	//인덱스 2번
		
		// 책의 개수
		System.out.println(shelfQueue.getSize() + "권");
		
		// 책 꺼내기
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}

}
