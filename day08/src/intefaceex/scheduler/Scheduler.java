package intefaceex.scheduler;

public interface Scheduler {
	// 추상 메서드
	public void getNextCall();		// 다음 전화 가져오기
	public void sendCallToAgent();	// 가저온 전화 상담원에게 배분하기
}
