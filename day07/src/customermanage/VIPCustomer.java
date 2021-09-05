package customermanage;

public class VIPCustomer extends Customer {
	private int agentId;	// 전문 상담원 번호(아이디)
	double saleRatio;	// 구매시 할인율
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;		// 보너스 적립율 5	%
		saleRatio = 0.1;
	}
	
	public VIPCustomer(int customerId, String customerName, int agentId) {
		super(customerId, customerName);
		this.agentId = agentId;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	@Override	// 매서드 재정의
	public int calcPrice(int price) {
		price -= (int)(price * saleRatio);
		bonusPoint += (int)(price * bonusRatio);
		return price;
	}

	@Override
	public String showInfo() {
		return super.showInfo() + "담당 상담원 ID는 " + 
				agentId + "입니다.";
	}
	
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
}
