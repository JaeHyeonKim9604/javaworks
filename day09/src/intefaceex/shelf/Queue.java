package intefaceex.shelf;

public interface Queue {	// 큐방식 : 선입선출(먼저 들어간 자료가 먼저 빠짐)

	void enQueue(String title);		// 리스트의 마지막에 추가
	
	String deQueue();		// 리스트의 0번 인덱스 항목 반환
	
	int getSize();			// 현재 Queue에 있는 개수 반환
}
