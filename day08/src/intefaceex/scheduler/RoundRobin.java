package intefaceex.scheduler;

public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 대기열에서 가져오기");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 상담원에게 순서대로 배분하기");
	}

}
